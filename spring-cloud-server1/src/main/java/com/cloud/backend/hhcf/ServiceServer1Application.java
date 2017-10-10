package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @Title: ServiceServer1Application
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70162074
 * @Author: zhaotf
 * @Since:2017年10月10日 上午8:06:20
 * @Version:1.0
 */
@SpringBootApplication
public class ServiceServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceServer1Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public AlwaysSampler getAlwaysSampler() {
		return new AlwaysSampler();
	}

}
