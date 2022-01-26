package com.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusButton; //локатор кнопки проверки статуса заказа

    @FindBy(how = How.XPATH, using = ".//input[@class='Input_InputContainer__3NykH']")
    private SelenideElement orderNumberInput; //локатор поля ввода номера заказа

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement searchOrderButton; //локатор кнопки поиска заказа

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g']")
    private SelenideElement makeNewOrderButton; //локатор кнопки создания нового заказа

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']")
    private SelenideElement makeNewOrderBigButton; //локатор большой кнопки создания нового заказа

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-0']")
    private SelenideElement firstImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-1']")
    private SelenideElement secondImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-2']")
    private SelenideElement thirdImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-3']")
    private SelenideElement fourthImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-4']")
    private SelenideElement fifthImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-5']")
    private SelenideElement sixthImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-6']")
    private SelenideElement seventhImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-7']")
    private SelenideElement eighthImportantQuestionElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-0']")
    private SelenideElement firstAnswerElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-1']")
    private SelenideElement secondAnswerElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-2']")
    private SelenideElement thirdAnswerElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-3']")
    private SelenideElement fourthAnswerElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-4']")
    private SelenideElement fifthAnswerElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-5']")
    private SelenideElement sixthAnswerElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-6']")
    private SelenideElement seventhAnswerElement;

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__panel-7']")
    private SelenideElement eighthAnswerElement;


    public MainPage clickOrderStatusButton() {
        orderStatusButton.click();
        return this;
    }

    public MainPage fillOrderNumberInput(String orderNumber) {
        orderNumberInput.sendKeys(orderNumber);
        return this;
    }

    public MainPage clickFirstImportantQuestionElement() {
        firstImportantQuestionElement.click();
        return this;
    }

    public MainPage clickSecondImportantQuestionElement() {
        secondImportantQuestionElement.click();
        return this;
    }

    public MainPage clickThirdImportantQuestionElement() {
        thirdImportantQuestionElement.click();
        return this;
    }

    public MainPage clickFourthImportantQuestionElement() {
        fourthImportantQuestionElement.click();
        return this;
    }

    public MainPage clickFifthImportantQuestionElement() {
        fifthImportantQuestionElement.click();
        return this;
    }

    public MainPage clickSixthImportantQuestionElement() {
        sixthImportantQuestionElement.click();
        return this;
    }

    public MainPage clickSeventhImportantQuestionElement() {
        seventhImportantQuestionElement.click();
        return this;
    }

    public MainPage clickEighthImportantQuestionElement() {
        eighthImportantQuestionElement.click();
        return this;
    }

    public String textFirstAnswerElement() {
        return firstAnswerElement.getText();
    }

    public String textSecondAnswerElement() {
        return secondAnswerElement.getText();
    }

    public String textThirdAnswerElement() {
        return thirdAnswerElement.getText();
    }

    public String textFourthAnswerElement() {
        return fourthAnswerElement.getText();
    }

    public String textFifthAnswerElement() {
        return fifthAnswerElement.getText();
    }

    public String textSixthAnswerElement() {
        return sixthAnswerElement.getText();
    }

    public String textSeventhAnswerElement() {
        return seventhAnswerElement.getText();
    }

    public String textEighthAnswerElement() {
        return eighthAnswerElement.getText();
    }

    public OrderStatusPage clickSearchOrderButton() {
        searchOrderButton.click();
        return page(OrderStatusPage.class);
    }

    public NewOrderPage clickMakeNewOrderButton() {
        makeNewOrderButton.click();
        return page(NewOrderPage.class);
    }

    public NewOrderPage clickMakeNewOrderBigButton() {
        makeNewOrderBigButton.click();
        return page(NewOrderPage.class);
    }
}
