package com.lksfly.pi.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.lksfly.pi.web.entity.Notice;
import com.lksfly.pi.web.service.NoticeService;

public class ListController implements Controller {
	
	private NoticeService noticeService;

	public NoticeService getNoticeService() {
		return noticeService;
	}

	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("List========");
		ModelAndView mv = new ModelAndView("notice.list"); // -> tiles
		//mv.setViewName("/WEB-INF/views/index.jsp");
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		System.out.println("List========"+list);
		mv.addObject("list",list);
		return mv;
	}

}
