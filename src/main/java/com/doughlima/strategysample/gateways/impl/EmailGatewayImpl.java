package com.doughlima.strategysample.gateways.impl;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.gateways.EmailGateway;
import org.springframework.stereotype.Component;

@Component
public class EmailGatewayImpl implements EmailGateway {
    @Override
    public void sendEmail(Customer customer) {

    }
}
