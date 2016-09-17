package com.ravikalla.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.ravikalla.entity.Player;

// Below link with Get type retrieves players data (in Header, put Accept=application/json)
//http://localhost:8082/SpringBootWeb/players"
//http://localhost:8082/SpringBootWeb/players/1
//http://localhost:8082/SpringBootWeb/players/2
@RestResource(path="players", rel="players")
public interface PlayerRestDao extends CrudRepository<Player, Long>{
}
