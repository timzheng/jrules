package com.jrules.ruleengine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jrules.ruleengine.mapper")
public class RuleEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuleEngineApplication.class, args);
	}
}
