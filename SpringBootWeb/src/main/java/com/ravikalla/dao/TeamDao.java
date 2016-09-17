package com.ravikalla.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ravikalla.entity.Team;

public interface TeamDao extends CrudRepository<Team, Long>{
	List<Team> findAll();

	Team findByName(String name);
}
