package com.yz.tianbaoums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yz"})
@MapperScan("com.yz.tianbaoums.mapper")
public class TianbaoUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TianbaoUmsApplication.class, args);
    }

}
