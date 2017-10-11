package com.cloud.backend.hhcf.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: ConsulProduct1Controller
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70245644
 * @author: zhaotf
 * @date: 2017年10月11日 下午7:16:25
 */
@RestController
@RequestMapping("/consulProduct1")
public class ConsulProduct1Controller {
	private static Logger logger = Logger
			.getLogger(ConsulProduct1Controller.class);

	/**
	 * @see http://localhost:8502/consulProduct1/registConsulPro.do
	 */
	@RequestMapping("/registConsulPro")
	public String registConsulPro() {
		logger.info("consul 服务注册");
		return "hi ,i'm miya";
	}

}
