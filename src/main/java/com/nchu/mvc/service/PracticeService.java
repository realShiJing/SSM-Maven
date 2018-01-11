package com.nchu.mvc.service;

import com.nchu.mvc.bean.PracticeUser;
import com.nchu.mvc.dao.PracticeUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangshijing on 2018/1/11 0011.
 */
@Component
public class PracticeService {
    @Autowired
    PracticeUserMapper practiceUserMapper;
    public PracticeUser getUserById(Integer id) {
        return practiceUserMapper.getUserById(id);
    }

    public PracticeUser login(PracticeUser practiceUser) {
        return practiceUserMapper.login(practiceUser);
    }
}
