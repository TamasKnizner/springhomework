package com.epam.hujj.tamasknizner.springhomework.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HunConfig.class})
@ComponentScan(basePackages = {"com.epam.hujj.tamasknizner.springhomework.domain"})
public class FootballConfig {

}
