package com.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    @FindBy(how = How.XPATH, using = ".//img[@alt='Scooter']")
    private SelenideElement scooterLogoImage; //локатор картинки логотипа самоката

    @FindBy(how = How.XPATH, using = ".//a[@class='Header_LogoYandex__3TSOI']")
    private SelenideElement yandexLogo; //локатор логотипа Яндекса

    @FindBy(how = How.XPATH, using = ".//a[@class='Header_LogoScooter__3lsAR']")
    private SelenideElement scooterLogoElement; //локатор элемента логотипа самоката

    @FindBy(how = How.XPATH, using = ".//div[@class='Header_Disclaimer__3VEni']")
    private SelenideElement trainerLogo; //локатор логотипа "Учебный тренажер"

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']")
    private SelenideElement headerScooterForTwoDays; //локатор заголовка "Самокат на пару дней"

    @FindBy(how = How.XPATH, using = ".//div[text()='Привезём его прямо к вашей двери,']")
    private SelenideElement subtitleWillDeliverItToYou; //локатор подзаголовка "Привезём его прямо к вашей двери,а когда накатаетесь — заберём"

    @FindBy(how = How.XPATH, using = ".//div[text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']")
    private SelenideElement subtitleScooterLightAndHeavy; //локатор подзаголовка "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"

    @FindBy(how = How.XPATH, using = ".//img[@alt='Scooter blueprint']")
    private SelenideElement scooterBigImage; //локатор большой картинки самоката

    @FindBy(how = How.XPATH, using = ".//div[text()=' Модель Toxic PRO']")
    private SelenideElement scooterModelName; //локатор названия модели самоката

    @FindBy(how = How.XPATH, using = ".//div[text()='Максимальная скорость']")
    private SelenideElement scooterMaxSpeedTitle; //локатор заголовка максимальной скорости самоката

    @FindBy(how = How.XPATH, using = ".//div[text()='40 км/ч']")
    private SelenideElement scooterMaxSpeed; //локатор значения максимальной скорости самоката

    @FindBy(how = How.XPATH, using = ".//div[text()='Проедет без подзарядки']")
    private SelenideElement scooterMaxDistanceTitle; //локатор заголовка автономности самоката

    @FindBy(how = How.XPATH, using = ".//div[text()='80 км']")
    private SelenideElement scooterMaxDistance; //локатор значения максимальной дистанции на аккумуляторе

    @FindBy(how = How.XPATH, using = ".//div[text()='Выдерживает вес']")
    private SelenideElement scooterMaxWeightTitle; //локатор заголовка максимального веса на самокате

    @FindBy(how = How.XPATH, using = ".//div[text()='120 кг']")
    private SelenideElement scooterMaxWeight; //локатор значения максимального веса на самокате

    @FindBy(how = How.XPATH, using = ".//div[text()='Как это работает']")
    private SelenideElement subtitleHowItWorks; //локатор подзаголовка "Как это работает"

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusBrick__1PsW9']/div[text()='1']")
    private SelenideElement circleNumberOne; //локатор элемента "круг с цифрой 1"

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusBrick__1PsW9']/div[text()='2']")
    private SelenideElement circleNumberTwo; //локатор элемента "круг с цифрой 2"

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusBrick__1PsW9']/div[text()='3']")
    private SelenideElement circleNumberThree; //локатор элемента "круг с цифрой 3"

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusBrick__1PsW9']/div[text()='4']")
    private SelenideElement circleNumberFour; //локатор элемента "круг с цифрой 4"

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='Заказываете самокат']")
    private SelenideElement stepNumberOne; //локатор первого шага для заказа

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='Выбираете, когда и куда привезти']")
    private SelenideElement stepNumberOneDescription; //локатор описания первого шага для заказа

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='Курьер привозит самокат']")
    private SelenideElement stepNumberTwo; //локатор второго шага для заказа

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='А вы — оплачиваете аренду']")
    private SelenideElement stepNumberTwoDescription; //локатор описания второго шага для заказа

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='Катаетесь']")
    private SelenideElement stepNumberThree; //локатор третьего шага для заказа

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='Сколько часов аренды осталось — видно на сайте']")
    private SelenideElement stepNumberThreeDescription; //локатор описания третьего шага для заказа

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='Курьер забирает самокат']")
    private SelenideElement stepNumberFour; //локатор четвертого шага для заказа

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/div[text()='Когда аренда заканчивается']")
    private SelenideElement stepNumberFourDescription; //локатор описания четвертого шага для заказа

    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusButton; //локатор кнопки проверки статуса заказа

    @FindBy(how = How.XPATH, using = ".//input[@class='Input_InputContainer__3NykH']")
    private SelenideElement orderNumberInput; //локатор поля ввода номера заказа

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement searchOrderButton; //локатор кнопки поиска заказа

    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement acceptCookieButton; //локатор кнопки куки

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g']")
    private SelenideElement makeNewOrderButton; //локатор кнопки создания нового заказа

    @FindBy(how = How.CSS, using = ".Home_FinishButton__1_cWm")
    private SelenideElement makeNewOrderBigButton; //локатор большой кнопки создания нового заказа

    @FindBy(how = How.XPATH, using = ".//div[@id ='accordion__heading-0']")
    private SelenideElement firstImportantQuestionElement; // здесь и ниже локаторы элементов списка "Вопросы о важном"

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
        firstImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public MainPage clickSecondImportantQuestionElement() {
        secondImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public MainPage clickThirdImportantQuestionElement() {
        thirdImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public MainPage clickFourthImportantQuestionElement() {
        fourthImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public MainPage clickFifthImportantQuestionElement() {
        fifthImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public MainPage clickSixthImportantQuestionElement() {
        sixthImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public MainPage clickSeventhImportantQuestionElement() {
        seventhImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public MainPage clickEighthImportantQuestionElement() {
        eighthImportantQuestionElement
                .scrollTo()
                .click();
        return this;
    }

    public String textFirstAnswerElement() {
        return firstAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public String textSecondAnswerElement() {
        return secondAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public String textThirdAnswerElement() {
        return thirdAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public String textFourthAnswerElement() {
        return fourthAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public String textFifthAnswerElement() {
        return fifthAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public String textSixthAnswerElement() {
        return sixthAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public String textSeventhAnswerElement() {
        return seventhAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public String textEighthAnswerElement() {
        return eighthAnswerElement
                .shouldBe(Condition.visible)
                .getText();
    }

    public OrderStatusPage clickSearchOrderButton() {
        searchOrderButton.click();
        return page(OrderStatusPage.class);
    }

    public MainPage clickAcceptCookiesButton() {
        if (acceptCookieButton.exists()) {
            acceptCookieButton
                    .shouldBe(Condition.visible)
                    .click();
        }
        return this;
    }

    public NewOrderPage clickMakeNewOrderButton() {
        makeNewOrderButton.click();
        return page(NewOrderPage.class);
    }

    public NewOrderPage clickMakeNewOrderBigButton() {
        makeNewOrderBigButton
                .scrollIntoView(true)
                .shouldBe(Condition.visible)
                .click();
        return page(NewOrderPage.class);
    }
}
