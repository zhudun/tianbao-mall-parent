package com.yz.tianbaoums.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author: yangzhen
 * @Date 2022/11/20-12:20
 * @Description: com.yz.tianbaoums.handle
 * @version: 1.0
 */
@Component
public class MyHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("添加插入时间");
        this.setFieldValByName("gmtCreate", LocalDateTime.now(),metaObject);
        this.setFieldValByName("gmtModified",LocalDateTime.now(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("添加更新时间");
        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }
}
