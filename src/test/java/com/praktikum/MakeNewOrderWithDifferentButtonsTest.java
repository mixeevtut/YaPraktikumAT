package com.praktikum;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MakeNewOrderWithDifferentButtonsTest {

    @Before
    public void setBrowserSettings() {
        //        System.setProperty("selenide.browser", "edge");
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\yandexdriver.exe");
        Configuration.browserSize = "1920x1280";
    }

    @Test
    public void makeNewOrderWithSmallButtonScenario() {

        MainPage mainPage = Selenide.open(MainPage.URL, MainPage.class);
        mainPage
                .clickAcceptCookiesButton()
                .clickMakeNewOrderButton();
        NewOrderPage orderPage = Selenide.page(NewOrderPage.class);
        orderPage.fillOrderName("Павел")
                .fillOrderSurname("Карпов")
                .fillOrderAddress("ул. Багратиона, д. 10")
                .selectOrderSubway("Крас")
                .fillOrderPhone("89111111111")
                .clickNextButton()
                .selectRentStartDate("10.03.2022")
                .selectRentDuration("сут")
                .selectColorCheckbox("серая безысходность")
                .fillDeliveryComment("Привезите нежно")
                .clickNextButton()
                .clickConfirmOrderButton();

        String orderWasMadeSuccessfully = "Посмотреть статус";
        Assert.assertEquals(orderWasMadeSuccessfully, orderPage.buttonTextCheckOrderStatus(orderWasMadeSuccessfully));
    }

    @Test
    public void makeNewOrderWithBigButtonScenario() {

        MainPage mainPage = Selenide.open(MainPage.URL, MainPage.class);
        mainPage
                .clickAcceptCookiesButton()
                .clickMakeNewOrderBigButton();
        NewOrderPage orderPage = Selenide.page(NewOrderPage.class);
        orderPage.fillOrderName("Тест")
                .fillOrderSurname("Тестов")
                .selectOrderSubway("Ново")
                .fillOrderPhone("79117451111")
                .clickNextButton()
                .selectRentStartDate("20.11.2025")
                .selectRentDuration("четверо суток")
                .selectColorCheckbox("чёрный жемчуг")
                .fillDeliveryComment("Быстрее, ну")
                .clickNextButton()
                .clickConfirmOrderButton();

        String orderWasMadeSuccessfully = "Посмотреть статус";
        Assert.assertEquals(orderWasMadeSuccessfully, orderPage.buttonTextCheckOrderStatus(orderWasMadeSuccessfully));
    }
}
