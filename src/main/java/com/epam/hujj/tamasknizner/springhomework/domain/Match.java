package com.epam.hujj.tamasknizner.springhomework.domain;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("defaultMatch")
public class Match {

    private static final Logger LOGGER = LoggerFactory.getLogger(Match.class);

    private Map<String, Team> teams;

    @Autowired
    private FootballField footballField;

    public Map<String, Team> getTeams() {
        return teams;
    }

    public void setTeams(Map<String, Team> teams) {
        this.teams = teams;
    }

    public FootballField getFootballField() {
        return footballField;
    }

    public void setFootballField(FootballField footballField) {
        this.footballField = footballField;
    }

    public void play() {
        LOGGER.info("Match is in progress...");
    }

}
