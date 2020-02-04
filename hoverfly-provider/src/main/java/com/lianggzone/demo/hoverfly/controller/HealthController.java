package com.lianggzone.demo.hoverfly.controller;

import com.lianggzone.demo.hoverfly.vo.HealthVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	@RequestMapping(value = "/health")
	public HealthVO getHealthInfo() {
		HealthVO healthVO = HealthVO.builder()
				.msg("OK")
				.timestrap(System.currentTimeMillis())
				.build();
		return healthVO;
	}
}