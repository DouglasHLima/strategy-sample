package com.doughlima.strategysample.usecases.customernotification;

import com.doughlima.strategysample.domain.OptionsContext;

/**
 * The processor is the mean for each use-case are recognized
 * and then how it is called to run
 * */
public interface OptionsProcessor {

    void execute(final OptionsContext context);

    boolean shouldRun(final OptionsContext context);
}
