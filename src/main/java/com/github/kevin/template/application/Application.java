package com.github.kevin.template.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2016, 银联智惠信息服务（上海）有限公司
 * 启动类.
 *
 * @author Kevin Huang
 * @since v0.0.1
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    /**
     * echo method.
     */
    public void echo() {
        LOGGER.info("Hello World");
    }

    /**
     *  Spring Boot 启动方法.
     * @param args 输入参数
     */
    public static void main(final String[] args) {
        new SpringApplication(Application.class).run(args);
    }
}
