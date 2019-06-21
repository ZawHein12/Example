package com.zh.spring.ZhProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
@RequestMapping(value="/index.htm",method=RequestMethod.GET)
public String welcome(Model model){
	return"abc";
}
@RequestMapping(value="/student.htm",method=RequestMethod.POST)
public String welcome(Model model){
	model.addAttributes(person,new student(hikru));
	return"def";
}

}