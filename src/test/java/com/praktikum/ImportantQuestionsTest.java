package com.praktikum;

import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

public class ImportantQuestionsTest {

    @Test
    public void checkFirstQuestionFilledCorrect() {

        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MainPage firstQuestion = Selenide.open(MainPage.URL, MainPage.class);
        firstQuestion.clickFirstImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера первого вопроса некорректно!", expected, firstQuestion.textFirstAnswerElement());
    }

    @Test
    public void checkSecondQuestionFilledCorrect() {

        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        MainPage secondQuestion = Selenide.open(MainPage.URL, MainPage.class);
        secondQuestion.clickSecondImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера второго вопроса некорректно!", expected, secondQuestion.textSecondAnswerElement());
    }

    @Test
    public void checkThirdQuestionFilledCorrect() {

        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MainPage thirdQuestion = Selenide.open(MainPage.URL, MainPage.class);
        thirdQuestion.clickThirdImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера третьего вопроса некорректно!", expected, thirdQuestion.textThirdAnswerElement());
    }

    @Test
    public void checkFourthQuestionFilledCorrect() {

        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MainPage fourthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        fourthQuestion.clickFourthImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера четвертого вопроса некорректно!", expected, fourthQuestion.textFourthAnswerElement());
    }

    @Test
    public void checkFifthQuestionFilledCorrect() {

        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        MainPage fifthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        fifthQuestion.clickFifthImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера пятого вопроса некорректно!", expected, fifthQuestion.textFifthAnswerElement());
    }

    @Test
    public void checkSixthQuestionFilledCorrect() {

        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MainPage sixthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        sixthQuestion.clickSixthImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера шестого вопроса некорректно!", expected, sixthQuestion.textSixthAnswerElement());
    }

    @Test
    public void checkSeventhQuestionFilledCorrect() {

        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        MainPage seventhQuestion = Selenide.open(MainPage.URL, MainPage.class);
        seventhQuestion.clickSeventhImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера седьмого вопроса некорректно!", expected, seventhQuestion.textSeventhAnswerElement());
    }

    @Test
    public void checkEighthQuestionFilledCorrect() {

        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MainPage eighthQuestion = Selenide.open(MainPage.URL, MainPage.class);
        eighthQuestion.clickEighthImportantQuestionElement();

        Assert.assertEquals("Содержание спойлера восьмого вопроса некорректно!", expected, eighthQuestion.textEighthAnswerElement());
    }
}
