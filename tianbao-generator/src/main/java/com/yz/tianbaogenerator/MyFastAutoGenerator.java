package com.yz.tianbaogenerator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @Author: yangzhen
 * @Date 2022/11/19-22:50
 * @Description: 3.5.2版本 加上mybatis-plus 和 mybatis-plus-generator依赖 可以使用
 * @version: 1.0
 */
public class MyFastAutoGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/tianbao?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true", "root", "root")
                .globalConfig(builder -> {
                    builder.author("yz") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\simpleProject\\tianbao-mall-parent\\tianbao-service\\tianbao-ums\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.yz.tianbaoums") // 设置父包名
                            .moduleName("") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\simpleProject\\tianbao-mall-parent\\tianbao-service\\tianbao-ums\\src\\main\\java\\com\\yz\\tianbaoums\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ums_member"); // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
