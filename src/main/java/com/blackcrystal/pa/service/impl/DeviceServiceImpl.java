package com.blackcrystal.pa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcrystal.pa.dao.impl.pa.DeviceDao;
import com.blackcrystal.pa.dao.po.pa.PaDevice;
import com.blackcrystal.pa.service.DeviceService;
import com.blackcrystal.pa.vo.DeviceVO;

@Service
public class DeviceServiceImpl implements DeviceService {

	private Logger logger = LoggerFactory.getLogger(DeviceServiceImpl.class);

	@Autowired
	private DeviceDao deviceDao;

	@Override
	public List<DeviceVO> list() {
		List<DeviceVO> result = new ArrayList<DeviceVO>();

		logger.debug("list all device...");

		List<PaDevice> devices = deviceDao.getAll();
		for (PaDevice device : devices) {
			DeviceVO deviceVO = new DeviceVO();
			deviceVO.setId(device.getId().toString());
			deviceVO.setName(device.getName());
			deviceVO.setMac(device.getMac());
			deviceVO.setSn(device.getSn());
			result.add(deviceVO);
		}

		return result;
	}

	@Override
	public DeviceVO get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
