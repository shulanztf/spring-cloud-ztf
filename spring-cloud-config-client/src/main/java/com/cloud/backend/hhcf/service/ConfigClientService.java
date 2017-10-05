package com.cloud.backend.hhcf.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @ClassName: ConfigClientService
 * @Description:
 * @author: zhaotf
 * @date: 2017年10月5日 下午2:29:01
 */
@Service("configClientService")
public class ConfigClientService {
	private static Logger logger = Logger.getLogger(ConfigClientService.class);
	@Resource
	private RestTemplate restTemplate;

	public Object getConfig(String text) {
		String obj = restTemplate.getForObject(
				"http://config-server/configServer/getConfig.do?setName="
						+ text, String.class);
		logger.info("spring-cloud-config+netflix-eureka测试:" + text + ","
				+ obj.toString());
		return "AAAAAAAAAAA:" + obj;
	}

}
