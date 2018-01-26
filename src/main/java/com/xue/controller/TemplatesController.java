package com.xue.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 注意：
 * 	1. 在Thymeleaf 模板文件中，标签是需要关闭的，3.0之前是需要关闭的
 *  2. thymeleaf 3.0+ 是可以不强制要求闭合的。
 *  3. 支持同时使用多个模板引擎，比如：thymeleaf和freemarker 可以并存。
 * @author xueshun
 *
 */
@RestController
@RequestMapping(value="/templates")
public class TemplatesController {
	
	/**
	 * 映射地址是：/templates/hello
	 * @return
	 */
/*	@RequestMapping("/hello")
	public String hello(Map<String,Object> map) {
		//返回的是ModelAndView对象;
//		ModelAndView mv = new ModelAndView("hello");
//		
//		return mv;
		
		map.put("name","Andy");
	}*/
	
	@RequestMapping("/hello")
	public ModelAndView hello(Map<String,Object> map) {
		//model.addAttribute("name", "Andy");
		//map.put("name", "Andy");
		ModelAndView mv  = new ModelAndView();
		mv.setViewName("/hello");
		map.put("name", "Andy");
		return mv;
	}
	@RequestMapping("/helloFtl")
	public String helloFtl(Map<String,Object> map){
		map.put("name","Andy");
		return "helloFtl";
	}
	
	/**
	 * 返回html模板.
	 */
	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String,Object> map){
		map.put("hello","from TemplateController.helloHtml");
		return "/helloHtml";
	}

}
