package com.doughlima.strategysample.usecases;

import com.doughlima.strategysample.domain.Customer;
import com.doughlima.strategysample.domain.CustomerOptions;
import com.doughlima.strategysample.gateways.*;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

import static com.doughlima.strategysample.templates.CustomerOptionsTemplates.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SendNotificationsTest {

    @MockBean()
    private EmailGateway emailGateway;
    @MockBean()
    private MessageGateway messageGateway;
    @MockBean()
    private NewsLetterGateway newsLetterGateway;
    @MockBean()
    private NotificationGateway notificationGateway;
    @MockBean()
    private PromotionsGateway promotionsGateway;
    @MockBean()
    private PushNotificationGateway pushNotificationGateway;
    @MockBean()
    private WhatsappGateway whatsappGateway;

    @Autowired
    private SendNotifications sendNotifications;

    private static Stream<Arguments> scenarios() {
        return Stream.of(
                Arguments.of(ALLOPTIONSTRUE,1,1,1,1,1,1,1),
                Arguments.of(ONLYEMAIL,1,0,0,0,0,0,0),
                Arguments.of(ONLYNEWSLETTER,0,1,0,0,0,0,0),
                Arguments.of(ONLYMESSAGE,0,0,1,0,0,0,0),
                Arguments.of(ONLYPROMOTIONS,0,0,0,1,0,0,0),
                Arguments.of(ONLYWHATSAPP,0,0,0,0,1,0,0),
                Arguments.of(ONLYPUSH,0,0,0,0,0,1,0),
                Arguments.of(ONLYNOTIFICATION,0,0,0,0,0,0,1)
        );
    }

    @DisplayName("Tests the called times gateways")
    @ParameterizedTest(name = "{index} - Gateways called Times match: {0}")
    @MethodSource("scenarios")
    void sendNotifications(
            final CustomerOptions customerOptions,
            final int email,
            final int newsletter,
            final int message,
            final int promotions,
            final int whatsapp,
            final int push,
            final int notification
    ) {
        //given a customer
        val customer = Customer.builder()
                .email("test@test")
                .name("doughlima")
                .options(customerOptions)
                .build();
        //when call send notification usecase
        sendNotifications.execute(customer);

        //then call the specifics gateways
        verify(whatsappGateway, times(whatsapp)).sendWhatsapp(any());
        verify(emailGateway, times(email)).sendEmail(any());
        verify(pushNotificationGateway, times(push)).sendPushNotification(any());
        verify(newsLetterGateway, times(newsletter)).sendNewsLetter(any());
        verify(notificationGateway, times(notification)).sendNotification(any());
        verify(promotionsGateway, times(promotions)).sendPromotions(any());
        verify(messageGateway, times(message)).sendMessage(any());
    }


}