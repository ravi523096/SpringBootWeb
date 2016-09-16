package com.ravikalla;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ravikalla.domain.Player;
import com.ravikalla.domain.Team;

@Controller
public class CricketController {

	private Team team;

	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Sachin", "Batsman"));
		players.add(new Player("Dhoni", "Keeper"));

		team = new Team("Mumbai", "MumbaiIndians", players);
	}

	@RequestMapping("/restExample")
	public @ResponseBody Team restExample(Map model) {
		System.out.println("Start : CricketController.restExample(...)");
		System.out.println("End : CricketController.restExample(...)");
		return team;
	}
}
