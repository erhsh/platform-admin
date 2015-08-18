package com.blackcrystal.pa.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AuthController {

	private Logger logger = LoggerFactory.getLogger(AuthController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		String result = "login";

		// 已经登录
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			result = "redirect:/main";
		}

		return result;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, @RequestParam String username,
			@RequestParam String password) {
		logger.info("login>>> username={}, password={}", username, password);

		String result = "login";

		// 已经登录
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			return "main";
		}

		// 登录
		UsernamePasswordToken token = null;
		try {
			token = new UsernamePasswordToken(username, password);
			subject.login(token);

			result = "redirect:/main";
		} catch (AuthenticationException e) {
			logger.debug("auth exception happen", e);
			model.addAttribute("errorInfo", "用户名或者密码错误");
		}

		return result;
	}
}
