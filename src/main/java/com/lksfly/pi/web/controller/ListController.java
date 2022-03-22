package com.lksfly.pi.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.lksfly.pi.web.entity.Notice;
import com.lksfly.pi.web.service.NoticeService;
import com.lksfly.pi.web.service.jdbc.JDBCNoticeService;

public class ListController implements Controller {
	
	private NoticeService noticeService;
	

	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("List========");
		ModelAndView mv = new ModelAndView("notice.list"); // -> tiles
		//mv.setViewName("/WEB-INF/views/index.jsp");
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		System.out.println("List========"+list.toString());
		System.out.println("List========~"+String.valueOf(list));
		for(Notice item :list) {
			System.out.println("sdfsdf"+list.size());
		}
		mv.addObject("list",list);
		return mv;
	}

}
