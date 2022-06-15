package com.learn.service.impl;

import com.learn.bean.Learn;
import com.learn.dao.LearnRepository;
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
public class LearnServiceImpl2 implements LearnService {
    @Autowired
    LearnRepository learnRepository;

    @Override
    public void add(LearnAddRequest request) {
        if (request == null) {
            log.error("text is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        Learn learn = new Learn();
        learn.setText(request.getText());
        learnRepository.save(learn);
    }

    @Override
    public void delete(Integer id) {
        if (id == null) {
            log.error("id is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        learnRepository.deleteById(id);
    }


    @Override
    public void update(LearnUpdataRequest learnUpdataRequest) {
        if (learnUpdataRequest == null) {
            log.error("learn is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        Learn learn = learnRepository.getById(learnUpdataRequest.getId());
        learn.setText(learnUpdataRequest.getText());
        learnRepository.save(learn);
    }

    @Override
    public Learn select(Integer id) {
        if (id == null) {
            log.error("id is null");
            throw new GlobalException(CodeMsg.ERROR);
        }
        return learnRepository.getById(id);
    }
}
