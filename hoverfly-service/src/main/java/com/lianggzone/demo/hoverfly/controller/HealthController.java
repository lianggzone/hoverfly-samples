package com.lianggzone.demo.hoverfly.controller;

import com.lianggzone.demo.hoverfly.proxy.HoverflyProxy;
import com.lianggzone.demo.hoverfly.vo.HealthVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@Autowired
	private HoverflyProxy hoverflyProxy;

	@RequestMapping(value = "/health")
	public HealthVO getHealthInfo() {
		return hoverflyProxy.getHealthInfo();
	}
}