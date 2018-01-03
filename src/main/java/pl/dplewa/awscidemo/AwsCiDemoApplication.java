package pl.dplewa.awscidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class AwsCiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCiDemoApplication.class, args);
	}
}
