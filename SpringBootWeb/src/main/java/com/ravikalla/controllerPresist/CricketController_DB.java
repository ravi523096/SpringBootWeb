package com.ravikalla.controllerPresist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ravikalla.dao.TeamDao;
import com.ravikalla.entity.Team;

@Controller
public class CricketController_DB {

	@Autowired TeamDao teamDao;

//	http://localhost:8082/SpringBootWeb/restExample_DB/MumbaiIndians.json
//	http://localhost:8082/SpringBootWeb/restExample_DB/MumbaiIndians.xml
	@RequestMapping("/restExample_DB/{name}")
	public @ResponseBody Team restExample(@PathVariable String name) {
		System.out.println("Start : CricketController_DB.restExample(...) : " + name);
		Team objTeam = teamDao.findByName(name);
		List<Team> findAll = teamDao.findAll();
		System.out.println("End : CricketController_DB.restExample(...) : " + (null == objTeam) + " : " + (null == findAll));
		return objTeam;
	}
}
