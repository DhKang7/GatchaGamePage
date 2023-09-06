package com.cran.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cran.service.LoginService;
import com.cran.spring.dto.UserID;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/Login/*")
@AllArgsConstructor
@Controller
public class LoginController {
		
	private LoginService service;
	

	@PostMapping("/createID")
	public String createID(UserID id) {
		log.info("아이디 만드는 중.");
		service.createID(id);
		log.info("아이디를 만들었음");
		return "redirect:/";
	}
	@GetMapping("/createID")
	public void createID() {
		
	}
//	@GetMapping("/getData")
//	@ResponseBody
//	public String getData() {
//		String data="";
//		return data;
//	}
	//get으로 받은 값(TestVO의 testId, testPw)을 다시 보내주기
	
	@RequestMapping("/sessionTest")
	public void sessionTest() {
	}
	@RequestMapping("/loginProc")
	public String loginProc(HttpSession s,
			@RequestParam("id") String id, @RequestParam("pw") String pw) {
		log.info("==== id:"+id);
		log.info("==== pw:"+pw);
		s.setAttribute("id", id);
		s.setAttribute("pw", pw);
		return "redirect:/";
	}
	@RequestMapping("/logout")
	public String loginProc(HttpSession s) {
		s.invalidate();
		return "redirect:/";
	}
	
}
