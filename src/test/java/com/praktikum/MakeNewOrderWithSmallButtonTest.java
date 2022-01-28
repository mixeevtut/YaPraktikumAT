package com.praktikum;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.screenshot;

public class MakeNewOrderWithSmallButtonTest {

    @Test

    public void makeNewOrderScenario() {

        MainPage mainPage = Selenide.open(MainPage.URL, MainPage.class);
        mainPage.clickMakeNewOrderButton();
        NewOrderPage orderPage1 = Selenide.page(NewOrderPage.class);
        orderPage1.fillOrderName("Павел")
                .fillOrderSurname("Ковидов")
                .fillOrderAddress("ул. Багратиона, д. 10")
                .selectOrderSubway("Крас")
                .fillOrderPhone("89111111111")
                .clickNextButton();
        NewOrderPage orderPage2 = Selenide.page(NewOrderPage.class);
        orderPage2.selectRentDuration("двое суток");


    }
}
