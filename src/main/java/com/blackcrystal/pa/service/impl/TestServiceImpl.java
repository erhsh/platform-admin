package com.blackcrystal.pa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blackcrystal.pa.service.TestService;
import com.blackcrystal.pa.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public List<TestVO> list() {
		List<TestVO> result = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			TestVO testVO = new TestVO("" + i);
			result.add(testVO);
		}

		return result;
	}

	@Override
	public TestVO get(String id) {
		return null;
	}

}
