package com.doughlima.strategysample.gateways.impl;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.gateways.NewsLetterGateway;
import org.springframework.stereotype.Component;

@Component
public class NewsLetterGatewayImpl implements NewsLetterGateway {
    @Override
    public void sendNewsLetter(Customer customer) {

    }
}
