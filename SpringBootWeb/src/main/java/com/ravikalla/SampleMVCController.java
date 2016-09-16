package com.ravikalla;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleMVCController {
	@RequestMapping("/hi")
	public @ResponseBody String hiThere() {
		return "Hello World";
	}
}
