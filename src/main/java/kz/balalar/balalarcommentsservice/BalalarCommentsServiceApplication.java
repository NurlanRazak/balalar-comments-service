package kz.balalar.balalarcommentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BalalarCommentsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalalarCommentsServiceApplication.class, args);
	}

}
