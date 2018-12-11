package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping("/")
	public ModelAndView HomePage()
	{
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("greeting","welcome to Sprinmg mvc");
		return mv;
		
		
	}
	@RequestMapping("/about")
	public ModelAndView AboutPage()
	{
		ModelAndView mv=new ModelAndView("about");
		mv.addObject("greeting","welcome to aboutpage");
		return mv;
		
		
	}
	@RequestMapping("/contact")
	public ModelAndView ContactPage()
	{
		ModelAndView mv=new ModelAndView("contact");
		mv.addObject("greeting","welcome to conatact page");
		return mv;
		
		
	}
	}

