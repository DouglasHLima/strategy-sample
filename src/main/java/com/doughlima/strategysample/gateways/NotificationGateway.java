package com.doughlima.strategysample.gateways;

import com.doughlima.strategysample.domain.Customer;

public interface NotificationGateway {
    void sendNotification(final Customer customer);
}
