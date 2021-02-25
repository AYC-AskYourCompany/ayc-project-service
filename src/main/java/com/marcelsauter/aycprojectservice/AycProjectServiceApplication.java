package com.marcelsauter.aycprojectservice;

import com.ayc.exceptionhandler.config.EnableAycExceptionHandling;
import com.ayc.keycloaksecurity.config.EnableKeycloakSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableKeycloakSecurity
@EnableAycExceptionHandling
public class AycProjectServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AycProjectServiceApplication.class, args);
	}

}
