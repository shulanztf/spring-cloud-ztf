package com.cloud.backend.hhcf.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: ConfigServerController
 * @Description:
 * @author: zhaotf
 * @date: 2017年10月5日 下午3:51:49
 */
@RestController
@RequestMapping("/configServer")
public class ConfigServerController {
	private static Logger logger = Logger
			.getLogger(ConfigServerController.class);

	/**
	 * @see http://127.0.0.1:8888/configServer/getConfig.do
	 */
	@RequestMapping("/getConfig")
	public String getConfig(String setName) {
		logger.info("spring-cloud-config服务端:" + setName);
		return "abcees12222222222222222222";
	}

}
