package com.learn.service.impl;

import com.learn.bean.Learn;
import com.learn.dao.LearnMapper;
import com.learn.exception.GlobalException;
import com.learn.result.CodeMsg;
import com.learn.service.LearnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LearnServiceImpl implements LearnService {
    @Autowired
    LearnMapper learnMapper;

    @Override
    public void add(String text) {
        if (text == null) {
            log.error("text is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        learnMapper.add(text);
    }

    @Override
    public void delete(Integer id) {
        if (id == null) {
            log.error("id is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        learnMapper.delete(id);
    }


    @Override
    public void update(Learn learn) {
        if (learn == null) {
            log.error("learn is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        learnMapper.update(learn.getText(), learn.getId());
    }

    @Override
    public Learn select(Integer id) {
        if (id == null) {
            log.error("id is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        return learnMapper.select(id);
    }
}
