package io.springbootlab.springbootsecuritymysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"io.springbootlab.springbootsecuritymysql.*"})
@EnableJpaRepositories({"io.springbootlab.springbootsecuritymysql.repository"})
public class SpringbootSecurityMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityMysqlApplication.class, args);
	}

}
