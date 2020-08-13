package io.springbootlab.springbootsecuritymysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"io.springbootlab.springbootsecuritymysql.*"})
public class SpringbootSecurityMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityMysqlApplication.class, args);
	}

}
