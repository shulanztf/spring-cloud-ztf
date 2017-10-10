package com.cloud.backend.hhcf.controller;

import javax.annotation.Resource;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @Title: ZipkinServerController
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70162074
 * @Author: zhaotf
 * @Since:2017年10月10日 上午8:08:06
 * @Version:1.0
 */
@RestController
@RequestMapping("/zipkinServer")
public class ZipkinServer1Controller {
	private static Logger logger = Logger.getLogger(ZipkinServer1Controller.class);
	@Resource
	private RestTemplate restTemplate;

	@RequestMapping("/hi")
	public String callHome() {
		logger.log(Level.INFO, "calling trace service-hi  ");
		return restTemplate.getForObject("http://localhost:8989/miya", String.class);
	}

	@RequestMapping("/info")
	public String info() {
		logger.log(Level.INFO, "calling trace service-hi ");
		return "i'm service-hi";
	}

}
