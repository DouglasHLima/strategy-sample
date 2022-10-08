package com.doughlima.strategysample.usecases;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.domain.OptionsContext;
import com.doughlima.strategysample.usecases.customernotification.SendCustomerNotificationsRunner;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendNotifications {

    private final SendCustomerNotificationsRunner runner;

    public void execute(final Customer customer) {
        val optionsContext = OptionsContext.builder()
                .customer(customer)
                .build();
        runner.execute(optionsContext);
    }
}
