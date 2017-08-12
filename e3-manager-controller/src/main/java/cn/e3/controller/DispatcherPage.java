package cn.e3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherPage {
	@RequestMapping("{pagePath}")
	public String dispatcherPage(@PathVariable String pagePath){
		return pagePath;
	}
}
