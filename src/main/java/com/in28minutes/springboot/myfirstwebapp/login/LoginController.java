package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	//JSP
		//login.jsp
		
		// "login"
		// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
		// login?name=Sammy
		// Model
		@RequestMapping("login")
		public String goToLoginPage(@RequestParam String name, ModelMap model) {
			model.put("name", name);
			// System.out.println("Request param is " + name); // Not recommended
			
			return "login";
		}
}
