package com.yz.tianbao.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yz.tianbao.ums.api.entity.UmsMember;
import com.yz.tianbao.ums.api.service.UmsMemberService;
import com.yz.tianbao.ums.mapper.UmsMemberMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yangzhen
 * @Date 2022/11/20-21:02
 * @Description: com.yz.tianbao.ums.service.impl
 * @version: 1.0
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;


    public String register(){

        UmsMember umsMember = new UmsMember();
        umsMember.setNickName("c");
        umsMemberMapper.insert(umsMember);
        return "success";

    }
}
