package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	//JSP
		//login.jsp
		
		// "login"
		// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
		@RequestMapping("login")
		public String goToLoginPage() {
			return "login";
		}
}
