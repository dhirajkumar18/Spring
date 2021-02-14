package com.student.com.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.student.com.entity.Student;
import com.student.com.service.StateService;
import com.student.com.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StateService stService;
    
	@Autowired
	private StudentService studService;
	
	@RequestMapping(value="/")
	public String home() {
		return "home";
	}
	@RequestMapping(value = "/showRegisrationForm", method = RequestMethod.GET)
	public ModelAndView showRegisrationForm(Model model) {
         ModelAndView mav=new ModelAndView();
         model.addAttribute("stateList", stService.getAllState());
         model.addAttribute("studentData",studService.findAll());
         mav.setViewName("studentRegs");
         
		return mav ;
	}
	
	@RequestMapping(value="/registerStudent", method = RequestMethod.POST)
	public String registerStudent(HttpServletRequest request, HttpServletResponse response, RedirectAttributes redirectAttrs) {
		Map<String,String> data=new  HashMap<>();
		data.put("name", request.getParameter("name"));
		data.put("course", request.getParameter("course"));
		data.put("gender", request.getParameter("gender"));
		data.put("address", request.getParameter("address"));
		data.put("state", request.getParameter("state"));
		studService.registerStudent(data);
		redirectAttrs.addFlashAttribute("msg", "Congratualtion! You have registered successfully");
		return "redirect:showRegisrationForm";
	}
	
	@RequestMapping(value="/studentDetails", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> studentDetailsByName() {
		
		return studService.findAll();
	}
	
	@RequestMapping(value="/getMetro")
	@ResponseBody
	public Map<String,String> getMetro(HttpServletRequest request){
		String city=request.getParameter("city");
		Map<String, String> map=new HashMap<>();
		map.put("expiry", "02-09-2021");
		map.put("closing_stock", "203");
		return map;
	}
 }
	
	
	
	

