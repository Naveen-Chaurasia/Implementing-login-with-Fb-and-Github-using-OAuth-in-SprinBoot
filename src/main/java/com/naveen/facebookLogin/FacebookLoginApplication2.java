package com.naveen.facebookLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;


@SpringBootApplication
@EnableOAuth2Sso
public class FacebookLoginApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(FacebookLoginApplication2.class, args);
	}

}
