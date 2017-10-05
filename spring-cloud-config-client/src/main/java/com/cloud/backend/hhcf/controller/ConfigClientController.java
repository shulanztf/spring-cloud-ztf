package com.cloud.backend.hhcf.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.backend.hhcf.service.ConfigClientService;

/**
 * 
 * @ClassName: ConfigClientController
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70037291
 * @author: zhaotf
 * @date: 2017年10月3日 上午11:13:44
 */
@RefreshScope
@Controller
@RequestMapping("/configClient")
public class ConfigClientController {
	private Logger logger = Logger.getLogger(ConfigClientController.class);
	@Resource
	private ConfigClientService configClientService;

	@Value("${foo}")
	private String foo;

	/**
	 * @see http://127.0.0.1:8881/configClient/getServerConfig.do
	 * @see http://127.0.0.1:8881/refresh 动态刷新配置用
	 */
	@ResponseBody
	@RequestMapping(value = "/getServerConfig")
	public String getServerConfig() {
		logger.info("远程配置信息:" + foo);
		return foo;
//		return "没有 config文件";
	}

	/**
	 * @see http://127.0.0.1:8881/configClient/getRetormConfig.do
	 */
	@ResponseBody
	@RequestMapping("getRetormConfig")
	public Object getRetormConfig(String param) {
		return configClientService.getConfig(param);
	}

}
