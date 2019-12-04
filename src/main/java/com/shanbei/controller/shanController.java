package com.shanbei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class shanController {
	//配置pom、web.xml,使用ssm框架
	@RequestMapping("list")
	public String list() {
		return "list";
	}
}
