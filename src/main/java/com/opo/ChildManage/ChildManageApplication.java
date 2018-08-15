package com.opo.ChildManage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.opo.ChildManage.mapper")
@SpringBootApplication
public class ChildManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChildManageApplication.class, args);
	}
}
