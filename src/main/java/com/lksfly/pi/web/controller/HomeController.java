package com.lksfly.pi.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String index (HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		return "root.index";
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("===========================!");
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data" ,"Hello Spring MVC~");
//		//mv.setViewName("index");
//		
//		return mv;
//	}
	
}
