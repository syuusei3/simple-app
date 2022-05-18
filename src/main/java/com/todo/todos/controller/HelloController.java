package com.todo.todos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController {
    @RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping("/task")
	public String task() {
		return "task";
	}
	@RequestMapping("/database")
	public String database() {
		return "database";
	}
}