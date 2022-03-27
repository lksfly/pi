package com.lksfly.pi.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("apiNoticeController") //@Responsebody와 같은 역할( 문서출력을 하는게 아니라 문자열을 출력하게된다.)
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@RequestMapping("list")
	public String list() {
		
		return "공지사항 list";
	}
}
