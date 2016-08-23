package com.epam.hujj.tamasknizner.springhomework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.epam.hujj.tamasknizner.springhomework.beanpostprocessors.InGameBeanPostProcessor;

@Configuration
@Import({HunConfig.class})
@ComponentScan(basePackages = {"com.epam.hujj.tamasknizner.springhomework.domain"})
public class FootballConfig {

	@Bean
	public InGameBeanPostProcessor inGameBeanPostProcessor(){
		return new InGameBeanPostProcessor();
	}
	
}
