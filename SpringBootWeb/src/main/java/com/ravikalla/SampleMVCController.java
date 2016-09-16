package com.ravikalla;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleMVCController {

	@RequestMapping("/hi")
	public @ResponseBody String hiThere() {
		return "Hello World!";
	}
	@RequestMapping(value="/hello/{testStr}")
	public @ResponseBody String hello(@PathVariable String strName) {
		return "Hello World! " + strName;
	}
	// Enable "spring-boot-starter-thymeleaf" in pom.xml to make this work
	@RequestMapping("/thymeleafExample/{name}")
	public String hiThere(Map model, @PathVariable String name) {
		System.out.println("Start : ThymeController.hiThere(...)");
		model.put("name", name);
		System.out.println("End : ThymeController.hiThere(...)");
		return "ThymeSamplePage";
	}
	@RequestMapping("/jspExample/{name}")
	public String jspExample(Map model, @PathVariable String name) {
		System.out.println("Start : ThymeController.jspExample(...)");
		model.put("name", name);
		System.out.println("End : ThymeController.jspExample(...)");
		return "JSPExample";
	}
}
