package com.doughlima.strategysample.usecases.customernotification.impl;

import com.doughlima.strategysample.domain.OptionsContext;
import com.doughlima.strategysample.gateways.NewsLetterGateway;
import com.doughlima.strategysample.usecases.customernotification.OptionsProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendNewsletter implements OptionsProcessor {

    private final NewsLetterGateway newsLetterGateway;

    @Override
    public void execute(final OptionsContext context) {
        newsLetterGateway.sendNewsLetter(context.getCustomer());
    }

    @Override
    public boolean shouldRun(final OptionsContext context) {
        return context.sendNewsletter();
    }
}
