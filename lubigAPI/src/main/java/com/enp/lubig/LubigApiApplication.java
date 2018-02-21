package com.enp.lubig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.enp.lubig.constant.Constants;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
@ComponentScan(basePackages={Constants.BASE_PACKAGE})
public class LubigApiApplication {

//	@Value("${sms.sendNo}")
//	public static String test;
	
	public static void main(String[] args) {
		SpringApplication.run(LubigApiApplication.class, args);
//		System.out.println("=== " + test);
	}
}
