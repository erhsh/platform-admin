package com.blackcrystal.pa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blackcrystal.pa.service.DeviceService;
import com.blackcrystal.pa.vo.DeviceVO;

@Controller
@RequestMapping("/device")
public class DeviceController {

	private Logger logger = LoggerFactory.getLogger(DeviceController.class);

	@Autowired
	private DeviceService deviceService;

	@RequestMapping(value = "/list")
	public String list(Model model) {
		logger.info("list devices");

		List<DeviceVO> deviceVOs = deviceService.list();
		model.addAttribute("devices", deviceVOs);
		return "device/list";
	}
}
