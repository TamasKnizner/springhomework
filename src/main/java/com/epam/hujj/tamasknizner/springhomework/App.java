package com.epam.hujj.tamasknizner.springhomework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.hujj.tamasknizner.springhomework.config.FootballConfig;
import com.epam.hujj.tamasknizner.springhomework.domain.Match;
import com.epam.hujj.tamasknizner.springhomework.domain.Team;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.debug("Hello World!");

        try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(FootballConfig.class)) {
            LOGGER.info(context.getBean("teamOfHungary", Team.class).toString());
            LOGGER.info(context.getBean("teamOfHungary", Team.class).getMembers());

            Match match = context.getBean("defaultMatch", Match.class);
            match.play();
            LOGGER.info("{}", match.getFootballField());

        }
    }

}
