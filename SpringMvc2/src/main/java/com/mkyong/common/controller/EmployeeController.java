package com.mkyong.common.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmployeeController extends MultiActionController {
	 
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Calling Add Employee...");
		return new ModelAndView("employee", "message", "Employee Added");
	}
 
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Calling Delete Employee...");
		return new ModelAndView("employee", "message", "Employee Deleted");
	}
 
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response,OutputStream outputstream) throws Exception {
		System.out.println("Calling Update Employee...");
		return new ModelAndView("employee", "message", "Employee Updated");
	}
	
	
	public ModelAndView getBatchDetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
		OutputStream outputstream=response.getOutputStream();
		String batchNo=request.getParameter("batchno");
		String expiry="";
		if(batchNo.equals("bt001")) {
		 expiry= "02/2/2025#"+"205";
		}
		if(batchNo.equals("bt002")) {
			 expiry= "02/12/2026#"+"25";
			}
		if(batchNo.equals("bt008")) {
			 expiry= "02/12/2027#"+"278";
			}
		outputstream.write(expiry.toString().getBytes());
		System.out.println("Calling Update Employee...");
		return null;
	}
}
