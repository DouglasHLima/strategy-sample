package com.doughlima.strategysample.gateways.impl;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.gateways.WhatsappGateway;
import org.springframework.stereotype.Component;

@Component
public class WhatsappGatewayImpl implements WhatsappGateway {
    @Override
    public void sendWhatsapp(Customer customer) {

    }
}
