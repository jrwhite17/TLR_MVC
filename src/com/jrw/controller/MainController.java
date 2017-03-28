package com.jrw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 
/*
 * author: JWhite
 * 
 */
 
@Controller
public class MainController {
	
	/*
	 * Establish Database Connection
	 */
	 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
     TeamJDBCTemplate teamJDBCTemplate = 
        (TeamJDBCTemplate)context.getBean("teamJDBCTemplate");
 
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<h3>Tony LaRussa</h3>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/test")
	public ModelAndView test() {
 
		String message = "<h1>TEST TEST TEST TEST</h1>";
		return new ModelAndView("welcome", "message", message);
	}
	
	//////////////////////////////////////////////////////////////////
	
	@RequestMapping("/whitesox")
	public ModelAndView whitesoxView() {
		ModelAndView mv = new ModelAndView("team");
		
		Team team = teamJDBCTemplate.getTeam("CHW");
		
		mv.addObject("backgroundColor", team.getPrimaryColor());
		mv.addObject("teamName", "<h1 style=\"color:" + team.getsecondaryColor() + ";\">" + team.getCity() + " " + team.getName() + "</h1>");
		
		return mv;
	}
	
	@RequestMapping("/athletics")
	public ModelAndView athleticsView() {
		ModelAndView mv = new ModelAndView("team");
		
		Team team = teamJDBCTemplate.getTeam("OAK");
		
		mv.addObject("backgroundColor", team.getPrimaryColor());
		mv.addObject("teamName", "<h1 style=\"color:" + team.getsecondaryColor() + ";\">" + team.getCity() + " " + team.getName() + "</h1>");
		
		return mv;
	}
	
	@RequestMapping("/cardinals")
	public ModelAndView cardinalsView() {
		ModelAndView mv = new ModelAndView("team");
		
		Team team = teamJDBCTemplate.getTeam("STL");
		
		mv.addObject("backgroundColor", team.getPrimaryColor());
		mv.addObject("teamName", "<h1 style=\"color:" + team.getsecondaryColor() + ";\">" + team.getCity() + " " + team.getName() + "</h1>");
		
		return mv;
	}
	
}