package com.doughlima.strategysample.gateways.impl;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.gateways.NotificationGateway;
import org.springframework.stereotype.Component;

@Component
public class NotificationGatewayImpl implements NotificationGateway {
    @Override
    public void sendNotification(Customer customer) {

    }
}
