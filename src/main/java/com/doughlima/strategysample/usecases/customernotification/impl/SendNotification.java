package com.doughlima.strategysample.usecases.customernotification.impl;

import com.doughlima.strategysample.domain.OptionsContext;
import com.doughlima.strategysample.gateways.NotificationGateway;
import com.doughlima.strategysample.usecases.customernotification.OptionsProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendNotification implements OptionsProcessor {

    private final NotificationGateway notificationGateway;

    @Override
    public void execute(final OptionsContext context) {
        notificationGateway.sendNotification(context.getCustomer());
    }

    @Override
    public boolean shouldRun(final OptionsContext context) {
        return context.sendNotification();
    }
}
