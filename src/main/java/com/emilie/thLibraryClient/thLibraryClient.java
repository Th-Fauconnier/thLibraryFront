package com.emilie.thLibraryClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(scanBasePackages="com.emilie.thLibraryClient")
@EnableFeignClients/*("com.emilie.library7WebClient")*/
public class thLibraryClient {

	public static void main(String[] args) {
		SpringApplication.run(thLibraryClient.class, args);
	}


}
