package com.doughlima.strategysample.gateways;

import com.doughlima.strategysample.domain.Customer;

public interface NewsLetterGateway {
    void sendNewsLetter(final Customer customer);
}
