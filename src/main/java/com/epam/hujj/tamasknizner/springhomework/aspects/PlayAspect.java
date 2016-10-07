package com.epam.hujj.tamasknizner.springhomework.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PlayAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlayAspect.class);

    @Before("execution (* com.epam.hujj.tamasknizner.springhomework.domain.Match.play())")
    public void beforePlayText(final JoinPoint joinPoint) {
        LOGGER.info("Match is starting ...");
    }

}
