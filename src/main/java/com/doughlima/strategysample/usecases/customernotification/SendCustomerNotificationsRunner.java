package com.doughlima.strategysample.usecases.customernotification;

import com.doughlima.strategysample.domain.OptionsContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class SendCustomerNotificationsRunner {

    /**
     * This value will be injected automatically by Spring with all objects that's implements OptionsProcessor
     * */
    private final Set<OptionsProcessor> optionsProcessors;

    /**
     * This is a simple logic to run each process that's corresponds with
     * shouldRun state in our example, it can run multiples use-cases
     * */
    public void execute(final OptionsContext context) {
        optionsProcessors.stream()
                .filter(optionsProcessor -> optionsProcessor.shouldRun(context))
                .forEach(optionsProcessor -> optionsProcessor.execute(context));
    }

}
