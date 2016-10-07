package com.epam.hujj.tamasknizner.springhomework.beanpostprocessors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.epam.hujj.tamasknizner.springhomework.domain.Player;

public class InGameBeanPostProcessor implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(InGameBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Player) {
            LOGGER.debug("{} is in the game!", ((Player) bean).getName());
        }
        return bean;
    }

}
