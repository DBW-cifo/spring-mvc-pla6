package com.trifulcas.pla6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Start {
	@RequestMapping("/") 
	public String inicio() {
		return "start";
	}

}
