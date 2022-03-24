package com.lksfly.pi.web.controller.customer;


import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lksfly.pi.web.entity.Notice;
import com.lksfly.pi.web.service.NoticeService;

@Controller //객체화
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@RequestMapping("/customer/notice/list")
	public String list(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException  {
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		
		request.setAttribute("list", list);
		
		return "notice.list";
	}
	
	@RequestMapping("/customer/notice/detail")
	public String detail() {
		
		return "notice.detail";
	}
	
	
	
//	@Override
//	public ModelAndView handleRequest() throws Exception {
//		System.out.println("Detail========");
//		ModelAndView mv = new ModelAndView("notice.detail");
//		//mv.setViewName("/WEB-INF/views/index.jsp");
//		return mv;
//	}

}
