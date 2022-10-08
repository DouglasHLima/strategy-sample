package com.doughlima.strategysample.gateways;

import com.doughlima.strategysample.domain.Customer;

public interface PushNotificationGateway {
    void sendPushNotification(final Customer customer);
}
