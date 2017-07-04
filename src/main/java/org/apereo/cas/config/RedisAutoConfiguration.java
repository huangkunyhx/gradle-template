package org.apereo.cas.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Copyright (C), 2016, 银联智惠信息服务（上海）有限公司
 * <p>
 * RedisSessionConfiguration
 *
 * @author Kevin Huang
 * @version 2017年06月26日 18:06:00
 */
@Configuration
@Import(org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration.class)
public class RedisAutoConfiguration {
}
