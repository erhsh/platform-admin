package com.blackcrystal.pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blackcrystal.pa.service.TestService;
import com.blackcrystal.pa.vo.TestVO;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping
	public String test() {
		return "test/test";
	}

	@RequestMapping("/developing")
	public String developing() {
		return "test/developing";
	}

	@Autowired
	private TestService testService;

	@RequestMapping("/service")
	public String service(Model model, String... params) {
		List<TestVO> tests = testService.list();
		model.addAttribute("tests", tests);
		return "test/service";
	}
}
