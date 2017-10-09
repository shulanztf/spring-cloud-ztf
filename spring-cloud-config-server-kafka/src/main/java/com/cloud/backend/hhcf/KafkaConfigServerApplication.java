package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @ClassName: KafkaConfigServerApplication
 * @Description:
 * @see http://www.jianshu.com/p/730d86030a41
 * @see http://www.cnblogs.com/zhangjianbin/p/6347247.html
 * @author: zhaotf
 * @date: 2017年10月8日 下午7:03:42
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class KafkaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConfigServerApplication.class, args);
	}

}
