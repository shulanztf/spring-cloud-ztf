package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * 
 * @Title: ServerZipkinApplication
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70162074
 * @Author: zhaotf
 * @Since:2017年10月10日 上午7:59:07
 * @Version:1.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZipkinApplication.class, args);
	}

}
