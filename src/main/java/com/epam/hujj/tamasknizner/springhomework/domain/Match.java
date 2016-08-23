package com.epam.hujj.tamasknizner.springhomework.domain;

import java.util.Map;

public class Match {

	private Map<String, Team> teams;
	
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
		
	}
	
}
