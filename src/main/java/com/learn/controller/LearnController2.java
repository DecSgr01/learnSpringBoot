package com.learn.controller;

import com.learn.ann.SysLog;
import com.learn.bean.Learn;
import com.learn.request.learnrequest.LearnAddRequest;
import com.learn.request.learnrequest.LearnUpdataRequest;
import com.learn.result.CodeMsg;
import com.learn.result.Result;
import com.learn.service.LearnService;
import com.learn.service.impl.LearnServiceImpl2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xyp
 */
@Controller
@RequestMapping("/learn2")
@ResponseBody
@Slf4j
public class LearnController2 {
    @Autowired
    LearnServiceImpl2 learnService2;

    @SysLog(value = "增加")
    @PostMapping("/add")
    @Transactional
    public String add(LearnAddRequest request) {
        log.info("add");
        learnService2.add(request);
        return Result.success();
    }

    @SysLog(value = "删除")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        log.info("delete");
        learnService2.delete(id);
        return Result.success();
    }

    @SysLog(value = "更新")
    @PostMapping("/update")
    public String update(LearnUpdataRequest request) {
        log.info("update");
        learnService2.update(request);
        return Result.success();
    }

    @SysLog(value = "查询")
    @GetMapping("/select/{id}")
    public Result<Learn> select(@PathVariable Integer id) {
        log.info("select");
        Learn learn = learnService2.select(id);
        if (learn == null) {
            log.error("learn is null");
            return Result.error(CodeMsg.ERROR);
        }
        return Result.success(learn);
    }
}
