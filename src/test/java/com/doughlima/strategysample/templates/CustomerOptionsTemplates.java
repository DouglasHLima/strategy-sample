package com.doughlima.strategysample.templates;

import com.doughlima.strategysample.domain.CustomerOptions;

public class CustomerOptionsTemplates {

    public static CustomerOptions ALLOPTIONSTRUE = CustomerOptions.builder()
            .sendEmail(true)
            .sendMessage(true)
            .sendNotification(true)
            .sendPushNotification(true)
            .sendPromotions(true)
            .sendNewsletter(true)
            .sendWhatsapp(true)
            .build();

    public static CustomerOptions ONLYEMAIL = CustomerOptions.builder()
            .sendEmail(true)
            .build();

    public static CustomerOptions ONLYMESSAGE = CustomerOptions.builder()
            .sendMessage(true)
            .build();

    public static CustomerOptions ONLYNOTIFICATION = CustomerOptions.builder()
            .sendNotification(true)
            .build();

    public static CustomerOptions ONLYPUSH = CustomerOptions.builder()
            .sendPushNotification(true)
            .build();

    public static CustomerOptions ONLYPROMOTIONS = CustomerOptions.builder()
            .sendPromotions(true)
            .build();

    public static CustomerOptions ONLYNEWSLETTER = CustomerOptions.builder()
            .sendNewsletter(true)
            .build();

    public static CustomerOptions ONLYWHATSAPP = CustomerOptions.builder()
            .sendWhatsapp(true)
            .build();
}

