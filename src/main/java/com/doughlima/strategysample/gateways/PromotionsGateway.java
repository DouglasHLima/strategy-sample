package com.doughlima.strategysample.gateways;

import com.doughlima.strategysample.domain.Customer;

public interface PromotionsGateway {
    void sendPromotions(final Customer customer);
}
