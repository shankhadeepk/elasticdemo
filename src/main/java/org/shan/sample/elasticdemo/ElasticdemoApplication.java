package org.shan.sample.elasticdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ElasticdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticdemoApplication.class, args);
	}

}
