package com.doughlima.strategysample.gateways.impl;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.gateways.MessageGateway;
import org.springframework.stereotype.Component;

@Component
public class MessageGatewayImpl implements MessageGateway {
    @Override
    public void sendMessage(Customer customer) {

    }
}
