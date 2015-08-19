package com.blackcrystal.pa.service;

import java.util.List;

import com.blackcrystal.pa.vo.DeviceVO;

public interface DeviceService {
	List<DeviceVO> list();

	DeviceVO get(String id);
}
