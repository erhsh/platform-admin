package com.blackcrystal.pa.service;

import java.util.List;

import com.blackcrystal.pa.vo.TestVO;

public interface TestService {
	List<TestVO> list();

	TestVO get(String id);
}
