package com.example.SpringDemo0;

import com.example.SpringDemo0.services.QuoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringDemo0Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo0Application.class, args);
	}


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	//@Bean
	//public QuoteService getQuoteService(){
	//	return new QuoteService();
	//}
}
