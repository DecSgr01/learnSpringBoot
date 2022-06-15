package com.learn.dao;

import com.learn.bean.Learn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author xyp
 */
public interface LearnRepository extends JpaSpecificationExecutor<Learn>, JpaRepository<Learn, Integer> {


}

