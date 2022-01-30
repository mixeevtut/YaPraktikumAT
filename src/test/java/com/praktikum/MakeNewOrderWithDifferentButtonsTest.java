package com.praktikum;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeNewOrderWithDifferentButtonsTest {

    @Test

    public void makeNewOrderWithSmallButtonScenario() {

        System.setProperty("selenide.browser", "edge");

        MainPage mainPage = Selenide.open(MainPage.URL, MainPage.class);
        mainPage
                .clickAcceptCookiesButton()
                .clickMakeNewOrderButton();
        NewOrderPage orderPage1 = Selenide.page(NewOrderPage.class);
        orderPage1.fillOrderName("Павел")
                .fillOrderSurname("Карпов")
                .fillOrderAddress("ул. Багратиона, д. 10")
                .selectOrderSubway("Крас")
                .fillOrderPhone("89111111111")
                .clickNextButton();
        NewOrderPage orderPage2 = Selenide.page(NewOrderPage.class);
        orderPage2
                .selectRentStartDate("10.03.2022")
                .selectRentDuration("сут")
                .selectColorCheckbox("серая безысходность")
                .fillDeliveryComment("Привезите нежно")
                .clickNextButton();
    }

    @Test

    public void makeNewOrderWithBigButtonScenario() {

        MainPage mainPage = Selenide.open(MainPage.URL, MainPage.class);
        mainPage
                .clickAcceptCookiesButton()
                .clickMakeNewOrderBigButton();
        NewOrderPage orderPage1 = Selenide.page(NewOrderPage.class);
        orderPage1.fillOrderName("Тест")
                .fillOrderSurname("Тестов")
                .selectOrderSubway("Ново")
                .fillOrderPhone("79117451111")
                .clickNextButton();
        NewOrderPage orderPage2 = Selenide.page(NewOrderPage.class);
        orderPage2
                .selectRentStartDate("20.11.2025")
                .selectRentDuration("четверо суток")
                .selectColorCheckbox("чёрный жемчуг")
                .fillDeliveryComment("Быстрее, ну")
                .clickNextButton();
    }
}