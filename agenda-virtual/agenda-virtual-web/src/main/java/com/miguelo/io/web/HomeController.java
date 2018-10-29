package com.miguelo.io.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miguelo.io.services.UtilService;

@Controller
public class HomeController {
	
	@Autowired
	private UtilService utilService;

	@RequestMapping("/init")
	public String welcome(Map<String, Object> model) {
		
		model.put("message", utilService.saludo());
		return "welcome";
	}

}
