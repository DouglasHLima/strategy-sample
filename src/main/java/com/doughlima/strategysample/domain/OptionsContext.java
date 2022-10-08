package com.doughlima.strategysample.domain;

import lombok.Builder;
import lombok.Getter;


/**
 * The Options Context Domain is the object that encapsulate a customer
 * and then provide some business logic to operates on our strategy example
 * */
@Getter
@Builder
public class OptionsContext {
    private Customer customer;

    public boolean sendEmail() {
        return this.getCustomer().getOptions().isSendEmail();
    }

    public boolean sendMessage() {
        return this.getCustomer().getOptions().isSendMessage();
    }

    public boolean sendNotification() {
        return this.getCustomer().getOptions().isSendNotification();
    }

    public boolean sendPushNotification() {
        return this.getCustomer().getOptions().isSendPushNotification();
    }

    public boolean sendPromotions() {
        return this.getCustomer().getOptions().isSendPromotions();
    }

    public boolean sendNewsletter() {
        return this.getCustomer().getOptions().isSendNewsletter();
    }

    public boolean sendWhatsapp() {
        return this.getCustomer().getOptions().isSendWhatsapp();
    }
}
