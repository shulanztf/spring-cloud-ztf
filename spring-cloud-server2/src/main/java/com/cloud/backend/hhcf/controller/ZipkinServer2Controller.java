package com.cloud.backend.hhcf.controller;

import javax.annotation.Resource;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @Title: ZipkinServer2Controller
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70162074
 * @Author: zhaotf
 * @Since:2017年10月10日 上午8:14:42
 * @Version:1.0
 */
@RestController
@RequestMapping("/zipkinServer2")
public class ZipkinServer2Controller {
	private static Logger logger = Logger
			.getLogger(ZipkinServer2Controller.class);
	@Resource
	private RestTemplate restTemplate;

	/**
	 * @see http://localhost:8989/zipkinServer2/hi.do
	 */
	@RequestMapping("/hi")
	public String home() {
		logger.log(Level.INFO, "hi is being called");
		return "hi i'm miya!";
	}

	/**
	 * @see http://localhost:8989/zipkinServer2/miya
	 */
	@RequestMapping("/miya")
	public String info() {
		logger.log(Level.INFO, "info is being called");
		return restTemplate.getForObject("http://localhost:8988/zipkinServer1/info",
				String.class);
	}

}
