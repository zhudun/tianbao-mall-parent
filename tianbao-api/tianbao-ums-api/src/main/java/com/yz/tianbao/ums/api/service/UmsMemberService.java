package com.yz.tianbao.ums.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yz.tianbao.ums.api.entity.UmsMember;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author yz
 * @since 2022-11-20
 */
public interface UmsMemberService extends IService<UmsMember> {
    public String register();
}
