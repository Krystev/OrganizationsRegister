package com.inveitix.register;

import javax.security.auth.message.config.AuthConfigFactory;

import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
		SpringApplication.run(Application.class, args);
	}

}
