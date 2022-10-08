package com.doughlima.strategysample.gateways;

import com.doughlima.strategysample.domain.Customer;

public interface EmailGateway {
    void sendEmail(final Customer customer);
}
