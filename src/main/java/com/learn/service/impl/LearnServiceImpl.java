package com.learn.service.impl;

import com.learn.bean.Learn;
import com.learn.dao.LearnMapper;
import com.learn.exception.GlobalException;
import com.learn.request.learnrequest.LearnAddRequest;
import com.learn.request.learnrequest.LearnUpdataRequest;
import com.learn.result.CodeMsg;
import com.learn.service.LearnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xyp
 */
@Service
@Slf4j
public class LearnServiceImpl implements LearnService {
    @Autowired
    LearnMapper learnMapper;

    @Override
    public void add(LearnAddRequest request) {
        if (request == null) {
            log.error("text is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        learnMapper.add(request.getText());
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
    public void update(LearnUpdataRequest learnUpdataRequest) {
        if (learnUpdataRequest == null) {
            log.error("learn is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        learnMapper.update(learnUpdataRequest.getText(), learnUpdataRequest.getId());
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
