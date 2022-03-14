package com.cjc.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;

@Controller
public class HomeController 
{
	
	@RequestMapping("/")
	public String prelogin()
	{
		
		System.out.println("Welcome To Login Page...");
		return "login";		
	}
	
	@RequestMapping("/log")
	public String login(@RequestParam("uname")String unm, @RequestParam("pass")String pas, Model m)
	{
		System.out.println("Username : " + unm);
		System.out.println("Password : " + pas);
		
//		m.addAttribute("uname", unm);
//		m.addAttribute("pass", pas);
		
		System.out.println("Welcome To Success Page...");
		return "success";
	}
	
	@RequestMapping("/reg")
	public String preregister()
	{
		System.out.println("Welcome To Register Page...");
		return "register";
	}
	
	
	@RequestMapping("/rega")
	public String registered(@ModelAttribute("s") Student stu,Model m)
	{
		System.out.println("roll No. : " + stu.getRollno());
		System.out.println("name : " + stu.getName());
		System.out.println("address : " + stu.getAddress());
		System.out.println("Mobile No. : " + stu.getMobno());
		
		
//		m.addAttribute("rno", stu.getRollno());
//		m.addAttribute("name", stu.getName());
//		m.addAttribute("addr", stu.getAddress());
//		m.addAttribute("mob", stu.getMobno());
		
		
		System.out.println("Welcome To Login Page...");
		return "login";
	}

}
