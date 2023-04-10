package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ssm")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class,SpringMvcConfig.class})
public class SpringConfig {
}
