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

}
