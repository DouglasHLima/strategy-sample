package com.doughlima.strategysample.usecases.customernotification.impl;

import com.doughlima.strategysample.domain.OptionsContext;
import com.doughlima.strategysample.gateways.PromotionsGateway;
import com.doughlima.strategysample.usecases.customernotification.OptionsProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendPromotions implements OptionsProcessor {

    private final PromotionsGateway promotionsGateway;

    @Override
    public void execute(final OptionsContext context) {
        promotionsGateway.sendPromotions(context.getCustomer());
    }

    @Override
    public boolean shouldRun(final OptionsContext context) {
        return context.sendPromotions();
    }
}
