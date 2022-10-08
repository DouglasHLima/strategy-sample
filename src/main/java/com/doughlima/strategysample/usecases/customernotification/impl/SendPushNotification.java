package com.doughlima.strategysample.usecases.customernotification.impl;

import com.doughlima.strategysample.domain.OptionsContext;
import com.doughlima.strategysample.gateways.PushNotificationGateway;
import com.doughlima.strategysample.usecases.customernotification.OptionsProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendPushNotification implements OptionsProcessor {

    private final PushNotificationGateway pushNotificationGateway;

    @Override
    public void execute(final OptionsContext context) {
        pushNotificationGateway.sendPushNotification(context.getCustomer());
    }

    @Override
    public boolean shouldRun(final OptionsContext context) {
        return context.sendPushNotification();
    }
}
