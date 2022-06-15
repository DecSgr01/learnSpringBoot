package com.learn.controller;

import com.learn.ann.SysLog;
import com.learn.bean.Learn;
import com.learn.result.CodeMsg;
import com.learn.result.Result;
import com.learn.service.LearnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author xyp
 */
@Controller
@RequestMapping("/learn")
@ResponseBody
@Slf4j
public class LearnController {
    @Autowired
    LearnService learnService;

    @SysLog(value = "增加")
    @PostMapping("/add")
    public String add(String text) {
        log.info("add");
        learnService.add(text);
        return Result.success();
    }

    @SysLog(value = "删除")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        log.info("delete");
        learnService.delete(id);
        return Result.success();
    }

    @SysLog(value = "更新")
    @PostMapping("/update")
    public String update(Learn learn) {
        log.info("update");
        learnService.update(learn);
        return Result.success();
    }

    @SysLog(value = "查询")
    @GetMapping("/select/{id}")
    public Result<Learn> select(@PathVariable Integer id) {
        log.info("select");
        Learn learn = learnService.select(id);
        if (learn == null) {
            log.error("learn is null");
            return Result.error(CodeMsg.ERROR);
        }
        return Result.success(learn);
    }
}
