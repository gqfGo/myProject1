package com.jxd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jxd.dao")
public class EmpmgrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpmgrApplication.class, args);
	}

}
