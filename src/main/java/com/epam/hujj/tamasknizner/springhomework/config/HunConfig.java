package com.epam.hujj.tamasknizner.springhomework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epam.hujj.tamasknizner.springhomework.domain.Coach;
import com.epam.hujj.tamasknizner.springhomework.domain.Player;
import com.epam.hujj.tamasknizner.springhomework.domain.PlayerRole;
import com.epam.hujj.tamasknizner.springhomework.domain.Team;
import com.epam.hujj.tamasknizner.springhomework.domain.TeamNationality;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class HunConfig {

	@Autowired
	ApplicationContext ctx;

	@Bean
	public Team teamOfHungary() {
		List<Player> players = new ArrayList<>();
		players.add(ctx.getBean("grosicsGyula", Player.class));
		players.add(ctx.getBean("buzanszkyJeno", Player.class));
		players.add(ctx.getBean("lorantGyula", Player.class));
		players.add(ctx.getBean("lantosMihaly", Player.class));
		players.add(ctx.getBean("bozsikJozsef", Player.class));
		players.add(ctx.getBean("zakariasJozsef", Player.class));
		players.add(ctx.getBean("budaLaszlo", Player.class));
		players.add(ctx.getBean("kocsisSandor", Player.class));
		players.add(ctx.getBean("hidegkutiNandor", Player.class));
		players.add(ctx.getBean("cziborZoltan", Player.class));
		players.add(ctx.getBean("puskasFerenc", Player.class));
		
		Team team = new Team();
		team.setCoach(ctx.getBean("sebesGusztav", Coach.class));
		team.setPlayers(players);
		team.setNationality(TeamNationality.HUNGARY);
		
		return team;
	}

	@Bean
	public Coach sebesGusztav() {
		return new Coach("Sebes Gusztáv");
	}
	
	@Bean
	public Player puskasFerenc() {
		return new Player("Puskás Ferenc", PlayerRole.STRIKER);
	}
	
	@Bean
	public Player cziborZoltan() {
		return new Player("Czibor Zoltán", PlayerRole.STRIKER);
	}
	
	@Bean
	public Player hidegkutiNandor() {
		return new Player("Hidegkuti Nándor", PlayerRole.MIDFIELDER);
	}
	
	@Bean
	public Player kocsisSandor() {
		return new Player("Kocsis Sándor", PlayerRole.MIDFIELDER);
	}
	
	@Bean
	public Player budaLaszlo() {
		return new Player("Budai II. László", PlayerRole.MIDFIELDER);
	}
	
	@Bean
	public Player zakariasJozsef() {
		return new Player("Zakariás József", PlayerRole.MIDFIELDER);
	}
	
	@Bean
	public Player bozsikJozsef() {
		return new Player("Bozsik József ", PlayerRole.MIDFIELDER);
	}
	
	@Bean
	public Player lantosMihaly() {
		return new Player("Lantos Mihály", PlayerRole.DEFENDER);
	}
	
	@Bean
	public Player lorantGyula() {
		return new Player("Lóránt Gyula", PlayerRole.DEFENDER);
	}
	
	@Bean
	public Player buzanszkyJeno() {
		return new Player("Buzánszky Jenő ", PlayerRole.DEFENDER);
	}
	
	@Bean
	public Player grosicsGyula() {
		return new Player("Grosics Gyula", PlayerRole.GOALKEEPER);
	}
	

}
