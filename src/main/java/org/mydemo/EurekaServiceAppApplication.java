package org.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceAppApplication.class, args);
	}
}

@RestController
class GreetingController {
	@RequestMapping("/greet")
	public String greeting() {
		return "Hello, World!";
	}
}