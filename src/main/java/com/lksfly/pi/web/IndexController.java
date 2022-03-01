package com.lksfly.pi.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===========================!");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("data","Hello Spring MVC~");
		//mv.setViewName("index");
		
		return mv;
	}
	
}
