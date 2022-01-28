package com.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderStatusPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/track";

    @FindBy(how = How.CLASS_NAME, using = "Input_InputContainer__3NykH")
    private SelenideElement orderNumberField; //локатор поля ввода номера заказа

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement searchOrderButton; //локатор кнопки поиска заказа

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']")
    private SelenideElement cancelOrderButton; //локатор кнопки отмены заказа

    public OrderStatusPage fillOrderNumberField(String orderNumber) {
        orderNumberField.sendKeys(orderNumber);
        return this;
    }

    public OrderStatusPage clickSearchOrderButton() {
        searchOrderButton.click();
        return this;
    }

    public OrderStatusPage clickCancelOrderButton() {
        cancelOrderButton.click();
        return this;
    }
}
