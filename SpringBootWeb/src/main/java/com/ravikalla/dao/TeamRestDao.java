package com.ravikalla.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.ravikalla.entity.Team;

// Below link with Get type retrieves entire data (in Header, put Accept=application/json)
//http://localhost:8082/SpringBootWeb/teams
//http://localhost:8082/SpringBootWeb/teams/1

//Below link with Put type saves data to DB (in Header, put Content-Type=application/json)
//http://localhost:8082/SpringBootWeb/teams/1
@RestResource(path="teams", rel="teams")
public interface TeamRestDao extends CrudRepository<Team, Long>{
	List<Team> findAll();
	Team findByName(String name);
}
