package com.learn.service;

import com.learn.bean.Learn;
import com.learn.request.learnrequest.LearnAddRequest;
import com.learn.request.learnrequest.LearnUpdataRequest;

public interface LearnService {

    void add(LearnAddRequest learnAddRequest);

    void delete(Integer id);

    void update(LearnUpdataRequest learnUpdataRequest);

    Learn select(Integer id);


}
