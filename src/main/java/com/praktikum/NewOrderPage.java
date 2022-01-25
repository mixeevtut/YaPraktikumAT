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

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement orderRentStartDate; //локатор поля даты начала аренды

    @FindBy(how = How.CLASS_NAME, using = "Dropdown-root")
    private SelenideElement orderRentDuration; //локатор списка с продолжительностью аренды в днях

    @FindBy(how = How.ID, using = "black")
    private SelenideElement orderBlackColorCheckbox; //локатор чекбокса с черным цветом

    @FindBy(how = How.ID, using = "grey")
    private SelenideElement orderGreyColorCheckbox; //локатор чекбокса с серым цветом

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement orderDeliveryComment; //локатор поля с комментарием курьеру

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderNextButton; //локатор кнопки "Далее/заказать"

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']")
    private SelenideElement orderBackButton; //локатор кнопки "Назад"

}
