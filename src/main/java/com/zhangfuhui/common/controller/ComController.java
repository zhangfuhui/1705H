package com.zhangfuhui.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComController {
	
	@RequestMapping("tohtml")
	public void tohrml(String c){
		System.out.println(c);
	}
}
