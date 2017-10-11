package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @ClassName: ConsulProduct1Application
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70245644
 * @author: zhaotf
 * @date: 2017年10月11日 下午7:14:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProduct1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsulProduct1Application.class, args);
	}

}
