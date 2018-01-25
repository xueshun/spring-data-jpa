package com.xue.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 1. 新建一个Class，这里取名为GlobalDefaultExceptionHandler
 * 2. 在Class上添加注解，@ControllerAdvice
 * 3. 在Class中添加一个方法
 * 4. 在方法上添加@ExcetionHandler
 * 5. 如果返回的是view -- 方法的返回值是ModelAndView
 * 6. 如果返回的是String或者是Json数据，那么需要在方法上添加@ResponseBody
 * @author xueshun
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ModelAndView defaultExceptionHandler(HttpServletRequest req,Exception e) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("1211");
		return mv;
		//return "对不起，服务器繁忙，请稍后再试！";
	}
}
