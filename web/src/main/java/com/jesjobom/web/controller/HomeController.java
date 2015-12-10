package com.jesjobom.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador inicial
 *
 * @author jesjobom
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/")
	public String home(ModelMap model) {
		model.addAttribute("origem", "WEB");
		return "home";
	}
}
