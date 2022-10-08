package com.doughlima.strategysample.gateways;

import com.doughlima.strategysample.domain.Customer;

public interface MessageGateway {
    void sendMessage(final Customer customer);
}
