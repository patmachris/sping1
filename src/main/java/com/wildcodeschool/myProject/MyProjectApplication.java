package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" +
				"<li><a href=/Doctor/1>Doctor 1</a></li>" +
				"<li><a href=/Doctor/2>Doctor 2</a></li>" +
				"<li><a href=/Doctor/3>Doctor 3</a></li>" +
				"<li><a href=/Doctor/4>Doctor 4</a></li>" +
				"</ul>";
	}

	@RequestMapping("/Doctor/1")
	@ResponseBody
	public String doctorOne(){
		return "Paul McGann";
	}

	@RequestMapping("/Doctor/2")
	@ResponseBody
	public String doctortwo(){
		return "Christopher Eccleston";
	}

	@RequestMapping("/Doctor/3")
	@ResponseBody
	public String doctorthree(){
		return "Patrick Troughton";
	}

	@RequestMapping("/Doctor/4")
	@ResponseBody
	public String doctorfour(){
		return "Jodie Whittaker";
	}

}

