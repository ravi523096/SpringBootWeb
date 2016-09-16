package com.ravikalla;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

	@RequestMapping("/thymeExample/{name}")
	public String hiThere(Map model, @PathVariable String name) {
		System.out.println("Start : ThymeController.hiThere(...)");
		model.put("name", name);
		System.out.println("End : ThymeController.hiThere(...)");
		return "ThymeSamplePage";
	}
}
