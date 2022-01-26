package com.praktikum;

import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

public class ImportantQuestionsTest {

    @Test
    public void checkFirstQuestionFilledCorrect() {

        String actual = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MainPage firstQuestion = Selenide.open(MainPage.URL, MainPage.class);
        firstQuestion.clickFirstImportantQuestionElement();

        Assert.assertEquals(actual,firstQuestion.textFirstAnswerElement());
    }

    @Test
    public void checkSecondQuestionFilledCorrect() {

        String actual = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        MainPage secondQuestion = Selenide.open(MainPage.URL, MainPage.class);
        secondQuestion.clickSecondImportantQuestionElement();

        Assert.assertEquals(actual,secondQuestion.textSecondAnswerElement());
    }
    @Test
    public void checkThirdQuestionFilledCorrect() {

        String actual = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MainPage thirdQuestion = Selenide.open(MainPage.URL, MainPage.class);
        thirdQuestion.clickThirdImportantQuestionElement();

        Assert.assertEquals(actual,thirdQuestion.textThirdAnswerElement());
    }
    @Test
    public void checkFourthQuestionFilledCorrect() {

        String actual = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MainPage fourthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        fourthQuestion.clickFourthImportantQuestionElement();

        Assert.assertEquals(actual,fourthQuestion.textFourthAnswerElement());
    }
    @Test
    public void checkFifthQuestionFilledCorrect() {

        String actual = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        MainPage fifthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        fifthQuestion.clickFifthImportantQuestionElement();

        Assert.assertEquals(actual,fifthQuestion.textFifthAnswerElement());
    }
    @Test
    public void checkSixthQuestionFilledCorrect() {

        String actual = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MainPage sixthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        sixthQuestion.clickSixthImportantQuestionElement();

        Assert.assertEquals(actual,sixthQuestion.textSixthAnswerElement());
    }
    @Test
    public void checkSeventhQuestionFilledCorrect() {

        String actual = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        MainPage seventhQuestion = Selenide.open(MainPage.URL, MainPage.class);
        seventhQuestion.clickSeventhImportantQuestionElement();

        Assert.assertEquals(actual,seventhQuestion.textSeventhAnswerElement());
    }
    @Test
    public void checkEighthQuestionFilledCorrect() {

        String actual = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MainPage eighthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        eighthQuestion.clickEighthImportantQuestionElement();

        Assert.assertEquals(actual,eighthQuestion.textEighthAnswerElement());
    }
}
