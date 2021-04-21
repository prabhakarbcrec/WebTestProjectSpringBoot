package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeContrller {
	@GetMapping("start")
	public String getui() {
		
		return "tag.jsp"; 
		
	}
	@RequestMapping("sum")
	public String getsum(HttpServletRequest res,Model m) {
		int total=Integer.valueOf(res.getParameter("num1"))+Integer.valueOf(res.getParameter("num2"));
		//res.setAttribute("total", total);
		//System.out.println(" this value comming from model; "+m.getAttribute("num1"));
		m.addAttribute("total", total);
		return "result.jsp"; 
		
	}


}
