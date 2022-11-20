package com.yz.tianbao.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yz.tianbao.ums.api.entity.UmsMember;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author yz
 * @since 2022-11-20
 */
@Repository
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    UmsMember selectByName(String name);
}
