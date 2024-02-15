package com.example.SpringDemo0.services;

import com.example.SpringDemo0.ws.obj.Quote;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class QuoteService {
    private List<Quote> quotes = new ArrayList<>();

    public QuoteService() {
        quotes.add(new Quote("hhh0", "ttt0"));
        //quotes.add(new Quote("hhh1", "ttt1"));
        //quotes.add(new Quote("hhh2", "ttt2"));
        //quotes.add(new Quote("hhh3", "ttt3"));
    }

    public Quote getQuote(){
        Random rn = new Random();
        int select = rn.nextInt(this.quotes.size());
        return this.quotes.get(select);
    }

    public void addQuote(Quote quote){
        quotes.add(quote);
    }
}
