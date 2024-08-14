package com.project.cache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CacheApplication {

	public static void main(String[] args) {
		log.info("Request to list all products");
		SpringApplication.run(CacheApplication.class, args);
	}

}
