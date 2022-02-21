package com.lksfly.pi.web.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("List========");
		ModelAndView mv = new ModelAndView("notice/list");
		//mv.setViewName("/WEB-INF/views/index.jsp");				
		return mv;
	}

}
