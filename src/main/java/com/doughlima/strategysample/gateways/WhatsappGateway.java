package com.doughlima.strategysample.gateways;

import com.doughlima.strategysample.domain.Customer;

public interface WhatsappGateway {
    void sendWhatsapp(final Customer customer);
}
