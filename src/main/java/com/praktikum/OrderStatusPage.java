package com.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderStatusPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/track";

    @FindBy(how = How.CLASS_NAME, using = "Input_InputContainer__3NykH")
    private SelenideElement orderNumberField;

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement searchOrderButton;
}
