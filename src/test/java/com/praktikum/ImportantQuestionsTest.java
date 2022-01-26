package com.praktikum;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class ImportantQuestionsTest {

    @Test
    public void checkFirstQuestionFilledCorrect() {

        MainPage firstQuestion = Selenide.open(MainPage.URL, MainPage.class);
        firstQuestion.clickFirstImportantQuestionElement();

    }




}
