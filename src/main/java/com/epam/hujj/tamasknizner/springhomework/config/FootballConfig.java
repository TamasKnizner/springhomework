package com.epam.hujj.tamasknizner.springhomework.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.epam.hujj.tamasknizner.springhomework.beanpostprocessors.InGameBeanPostProcessor;
import com.epam.hujj.tamasknizner.springhomework.domain.FootballField;
import com.epam.hujj.tamasknizner.springhomework.domain.WeatherType;

@Configuration
@Import({HunConfig.class})
@PropertySource("classpath:football.properties")
@ComponentScan(basePackages = {"com.epam.hujj.tamasknizner.springhomework.domain", "com.epam.hujj.tamasknizner.springhomework.aspects"})
@EnableAspectJAutoProxy
public class FootballConfig {

    @Bean
    public InGameBeanPostProcessor inGameBeanPostProcessor() {
        return new InGameBeanPostProcessor();
    }

    @Bean
    public FootballField footballField() {
        return new FootballField("main field", WeatherType.WET);
    }

    @Bean
    public Locale locale() {
        return new Locale.Builder().setLanguage("en").setRegion("US").build();
    }

}
