package com.mkyong.common.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HelloWorldController extends MultiActionController{

	/*
	 * @Override protected ModelAndView handleRequestInternal(HttpServletRequest
	 * request, HttpServletResponse response) throws Exception {
	 * 
	 * ModelAndView model = new ModelAndView("HelloWorldPage");
	 * model.addObject("msg", "hello world");
	 * 
	 * return model; }
	 */
    
    public ModelAndView  handleRequestInternal(OutputStream outputStream, HttpServletRequest request) throws IOException {
    	String city=request.getParameter("city");
    	Map<String,String> map=new HashMap<>();
    	map.put("city", city);
    	map.put("name", "dhiraj kumar");
    	outputStream.write(map.toString().getBytes());
    	return null;
    }
}