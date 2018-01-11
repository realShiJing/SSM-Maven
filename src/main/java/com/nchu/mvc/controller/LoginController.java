package com.nchu.mvc.controller;

import com.nchu.mvc.bean.PracticeUser;
import com.nchu.mvc.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by yangshijing on 2018/1/11 0011.
 */

@Controller
@RequestMapping("/practice")
public class LoginController {
    public static final String SUCCES = "success";

    @Autowired
    PracticeService practiceService;
    /**
     * 从数据库中按id号查出一条数据
     * @param id
     * @return
     */
    @RequestMapping("/getUserById")
    public String  getUserById(@RequestParam(value = "id")  Integer id, Map<String,Object> map){
        PracticeUser practiceUser = practiceService.getUserById(id);
        map.put("practiceUser",practiceUser);
        return SUCCES;
    }

    /**
     * 用户名和密码登录
     * @param practiceUser
     * @param map
     * @return
     */
    @RequestMapping("/login")
    public String  test(PracticeUser practiceUser, Map<String,Object> map){
        PracticeUser dbuser = practiceService.login(practiceUser);
        if (dbuser != null ){
            return SUCCES;
        }
       return "error";
    }
}
