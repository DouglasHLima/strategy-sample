package com.doughlima.strategysample.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * The Customer Options domain is the options configuration for each customer
 * where they choose by what means can they be communicated
 * */
@Builder
@Getter
@ToString
public class CustomerOptions {
    private boolean sendEmail;
    private boolean sendMessage;
    private boolean sendNotification;
    private boolean sendPushNotification;
    private boolean sendPromotions;
    private boolean sendNewsletter;
    private boolean sendWhatsapp;
}

