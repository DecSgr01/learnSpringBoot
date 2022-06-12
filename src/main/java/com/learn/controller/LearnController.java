package com.learn.controller;

import com.learn.bean.Learn;
import com.learn.result.CodeMsg;
import com.learn.result.Result;
import com.learn.service.LearnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/add")

    public String add(String text) {
        log.info("add");
        learnService.add(text);
        return Result.success();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        log.info("delete");
        learnService.delete(id);
        return Result.success();
    }

    @RequestMapping("/update")
    public String update(Learn learn) {
        log.info("update");
        learnService.update(learn);
        return Result.success();
    }

    @RequestMapping("/select/{id}")
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
