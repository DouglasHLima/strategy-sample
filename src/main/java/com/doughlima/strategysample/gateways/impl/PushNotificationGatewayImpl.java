package com.doughlima.strategysample.gateways.impl;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.gateways.PushNotificationGateway;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationGatewayImpl implements PushNotificationGateway {
    @Override
    public void sendPushNotification(Customer customer) {

    }
}
