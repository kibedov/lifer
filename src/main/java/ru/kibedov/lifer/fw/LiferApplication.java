package ru.kibedov.lifer.fw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.kibedov.lifer")
public class LiferApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiferApplication.class, args);
	}

}
