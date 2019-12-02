package apiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages={
		"com.controller", "com.employee.dao", "com.employee.repository", "com.employee.model","apiexample"})
@EnableJpaAuditing
public class EmployeeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
