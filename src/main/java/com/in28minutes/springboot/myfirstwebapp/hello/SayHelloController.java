package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	// "say-hello"
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, what are you learning today?";
	}
	
	// "say-hello-html"
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Hello World</title>");
		sb.append("</head>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	//JSP
	//sayHello.jsp
	
	// "say-hello-jsp"
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
