package com.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewOrderPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/order";

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
    private SelenideElement orderNameInput; //локатор поля "Имя"

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement orderSurnameInput; //локатор поля "Фамилия"

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement orderAddressInput; //локатор поля "Адрес"

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Станция метро']")
    private SelenideElement orderSubwayInput; //локатор поля "Станция метро"

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement orderPhoneInput; //локатор поля "Телефон"

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderNextButton; //локатор поля "Далее/заказать"

}
