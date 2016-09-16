package com.ravikalla;

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
	@RequestMapping(value="/hi0/{testStr}")
	public @ResponseBody String hiThere0(@PathVariable String strName) {
		return "Hello World0! " + strName;
	}
}
