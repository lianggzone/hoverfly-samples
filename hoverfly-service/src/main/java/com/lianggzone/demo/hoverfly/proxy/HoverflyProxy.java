package com.lianggzone.demo.hoverfly.proxy;

import com.lianggzone.demo.hoverfly.vo.HealthVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HoverflyProxy {

    @Autowired
    private RestTemplate restTemplate;

    public HealthVO getHealthInfo(){
        String url = "http://localhost:8080/health";
        HealthVO healthVO = restTemplate.getForEntity(url, HealthVO.class).getBody();
        return healthVO;
    }
}
