package com.blackcrystal.pa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/device")
public class DeviceController {

	@RequestMapping(value = "/list")
	public String list() {

		return "device/list";
	}
}
