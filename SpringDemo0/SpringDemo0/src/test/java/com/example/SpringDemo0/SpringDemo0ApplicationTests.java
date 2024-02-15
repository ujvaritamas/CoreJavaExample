package com.example.SpringDemo0;

import com.example.SpringDemo0.services.QuoteService;
import com.example.SpringDemo0.ws.obj.Quote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Assertions;


@SpringBootTest
class SpringDemo0ApplicationTests {

	QuoteService quoteService;

	@BeforeEach
	public void beforeEach(){
		quoteService = new QuoteService();
	}


	@Test
	void contextLoads() {
	}

	@Test
	public void testGetQuote(){
		quoteService.addQuote(new Quote("ABC", "D"));
		//Assertions.assertEquals();
	}

}
