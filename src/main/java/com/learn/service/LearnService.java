package com.learn.service;

import com.learn.bean.Learn;

public interface LearnService {

    void add(String text);

    void delete(Integer id);

    void update(Learn learn);

    Learn select(Integer id);


}
