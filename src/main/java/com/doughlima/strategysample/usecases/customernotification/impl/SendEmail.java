package com.doughlima.strategysample.usecases.customernotification.impl;

import com.doughlima.strategysample.domain.OptionsContext;
import com.doughlima.strategysample.gateways.EmailGateway;
import com.doughlima.strategysample.usecases.customernotification.OptionsProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendEmail implements OptionsProcessor {

    private final EmailGateway emailGateway;

    @Override
    public void execute(final OptionsContext context) {
        emailGateway.sendEmail(context.getCustomer());
    }

    @Override
    public boolean shouldRun(final OptionsContext context) {
        return context.sendEmail();
    }
}
