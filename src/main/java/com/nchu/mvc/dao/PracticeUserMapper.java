package com.nchu.mvc.dao;

import com.nchu.mvc.bean.PracticeUser;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangshijing on 2018/1/11 0011.
 */
@Component
public interface PracticeUserMapper {
    /*@Autowired
    SqlSession sqlSession;*/
    PracticeUser getUserById(Integer id);

    PracticeUser login(PracticeUser practiceUser);
}
