package com.ravikalla;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.ravikalla.dao.TeamDao;
import com.ravikalla.entity.Player;
import com.ravikalla.entity.Team;

@SpringBootApplication
public class SpringBoot_CricketPersist extends SpringBootServletInitializer {

	@Autowired TeamDao teamDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot_CricketPersist.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBoot_CricketPersist.class);
	}

	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Sachin", "Batsman"));
		players.add(new Player("Dhoni", "Keeper"));

		Team team = new Team("Mumbai", "MumbaiIndians", players);
		teamDao.save(team);
	}
}
