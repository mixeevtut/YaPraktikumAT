package com.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusButton;

    @FindBy(how = How.XPATH, using = ".//input[@class='Input_InputContainer__3NykH']")
    private SelenideElement orderNumberInput;

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement searchOrderButton;

    public MainPage clickOrderStatusButton() {
        orderStatusButton.click();
        return this;
    }

    public MainPage fillOrderNumberInput(String orderNumber) {
        orderNumberInput.sendKeys(orderNumber);
        return this;
    }

    public OrderStatusPage clickSearchOrderButton() {
        searchOrderButton.click();
        return page(OrderStatusPage.class);
    }
}
