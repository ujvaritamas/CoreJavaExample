package com.example.SpringDemo0.ws.EndPoint;

import com.example.SpringDemo0.services.QuoteService;
import com.example.SpringDemo0.ws.obj.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Endpoint {

    private RestTemplate restTemplate;
    private QuoteService quoteService;

    public Endpoint(RestTemplate restTemplate, QuoteService quoteService) {
        this.restTemplate = restTemplate;
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String home(){
        return "Hello world";
    }

    @RequestMapping("/other")
    public String other(){
        return "other is working!";
    }

    @RequestMapping("/template")
    public String hello(){
        String message = this.restTemplate.getForObject("http://localhost:8090", String.class);
        return message;
    }

    @RequestMapping("/quote")
    public Quote getQuote(){
        return this.quoteService.getQuote();
    }

    @RequestMapping(value = "/quote", method = RequestMethod.POST)
    public void addQuote(@RequestBody Quote quote){
        this.quoteService.addQuote(quote);
    }
}
