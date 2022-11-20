package com.yz.tianbao.portal.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yz.tianbao.ums"})
@MapperScan("com.yz.tianbao.ums.mapper")
public class TianbaoPortalWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TianbaoPortalWebApplication.class, args);
    }

}
