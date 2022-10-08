package com.doughlima.strategysample.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.With;

/**
 * The Customer domain is a fictional customer that is used
 * to simulate an application that's receive a registered customer,
 * and it's called to send notifications
 * */

@With
@Getter
@Builder
public class Customer {
    private String name;
    private String email;
    private CustomerOptions options;
}
