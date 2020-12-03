package com.tomaskadlcek.MyWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyWebsiteApplication {

	// if on server uncomment

	// extends SpringBootServletInitializer
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
//		return application.sources(MyWebsiteApplication.class);
//	}


	public static void main(String[] args) {
		SpringApplication.run(MyWebsiteApplication.class, args);
	}

}
