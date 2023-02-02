package pl.hirely.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class TrainCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainCompanyApplication.class, args);
	}

}
