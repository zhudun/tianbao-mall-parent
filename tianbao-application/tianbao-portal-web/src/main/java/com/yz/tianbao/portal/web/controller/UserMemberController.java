package com.yz.tianbao.portal.web.controller;

import com.yz.tianbao.ums.api.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangzhen
 * @Date 2022/11/20-19:13
 * @Description: com.yz.tianbao.portal.web.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/user-member")
public class UserMemberController {

    @Autowired
    UmsMemberService umsMemberService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/register")
    public String register(){
        umsMemberService.register();
        return "register";
    }
}
