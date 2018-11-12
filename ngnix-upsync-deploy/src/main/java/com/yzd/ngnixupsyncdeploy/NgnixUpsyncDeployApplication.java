package com.yzd.ngnixupsyncdeploy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzd.ngnixupsyncdeploy.mapper")
public class NgnixUpsyncDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgnixUpsyncDeployApplication.class, args);
	}
}
