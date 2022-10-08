package com.doughlima.strategysample.usecases.customernotification.impl;

import com.doughlima.strategysample.domain.OptionsContext;
import com.doughlima.strategysample.gateways.WhatsappGateway;
import com.doughlima.strategysample.usecases.customernotification.OptionsProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendWhatsapp implements OptionsProcessor {

    private final WhatsappGateway whatsappGateway;

    @Override
    public void execute(final OptionsContext context) {
        whatsappGateway.sendWhatsapp(context.getCustomer());
    }

    @Override
    public boolean shouldRun(final OptionsContext context) {
        return context.sendWhatsapp();
    }
}
