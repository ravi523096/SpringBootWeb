package com.ravikalla.domain;

import java.util.Set;

public class Team {
	String name;
	String location;
	String mascott;
	Set<Player> players;

	public Team() {
		super();
	}
	public Team(String location, String name, Set<Player> players) {
		super();
		this.name = name;
		this.location = location;
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascott() {
		return mascott;
	}
	public void setMascott(String mascott) {
		this.mascott = mascott;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
}
