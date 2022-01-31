package com.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Objects;

import static com.codeborne.selenide.Selectors.withText;

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

    @FindBy(how = How.CLASS_NAME, using = "select-search__select")
    private SelenideElement orderSubwayDropdown; //локатор выпадающего списка станций метро

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement orderPhoneInput; //локатор поля "Телефон"

    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement orderRentStartDate; //локатор поля даты начала аренды

    @FindBy(how = How.CSS, using = ".Dropdown-root")
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

    @FindBy(how = How.XPATH, using = ".//button[text()='Да']")
    private SelenideElement confirmOrderButton; //локатор кнопки подтверждения заказа

    @FindBy(how = How.XPATH, using = ".//button[text()='Посмотреть статус']")
    private SelenideElement checkOrderStatus; //локатор кнопки статуса заказа

    public NewOrderPage fillOrderName(String name) {
        orderNameInput.sendKeys(name);
        return this;
    }

    public NewOrderPage fillOrderSurname(String surname) {
        orderSurnameInput.sendKeys(surname);
        return this;
    }

    public NewOrderPage fillOrderAddress(String address) {
        orderAddressInput.sendKeys(address);
        return this;
    }

    public NewOrderPage selectOrderSubway(String Subway) {
        orderSubwayInput.sendKeys(Subway);
        orderSubwayDropdown
                .shouldBe(Condition.visible)
                .find(withText(Subway))
                .click();
        return this;
    }

    public NewOrderPage fillOrderPhone(String number) {
        orderPhoneInput.sendKeys(number);
        return this;
    }

    public NewOrderPage clickNextButton() {
        orderNextButton.click();
        return this;
    }

    public NewOrderPage selectRentStartDate(String date) {
        orderRentStartDate
                .setValue(date)
                .pressEnter();
        return this;
    }

    public NewOrderPage selectRentDuration(String days) {
        orderRentDuration.click();
        orderRentDuration
                .shouldBe(Condition.visible)
                .find(withText(days))
                .click();
        return this;
    }

    public NewOrderPage selectColorCheckbox(String color) {
        if (Objects.equals(color, "чёрный жемчуг")) {
            orderBlackColorCheckbox
                    .shouldBe(Condition.visible)
                    .click();
        } else if (Objects.equals(color, "серая безысходность")) {
            orderGreyColorCheckbox
                    .shouldBe(Condition.visible)
                    .click();
        } else throw new RuntimeException("Не найден валидный цвет");
        return this;
    }

    public NewOrderPage fillDeliveryComment(String comment) {
        orderDeliveryComment.sendKeys(comment);
        return this;
    }

    public NewOrderPage clickConfirmOrderButton() {
        confirmOrderButton
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    public String buttonTextCheckOrderStatus(String buttonText) {
        return checkOrderStatus
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(buttonText))
                .getText();
    }
}
