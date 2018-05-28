package task.steps;

import task.pages.RegEnterPage;

/**
 * Created by alexeya on 16.05.2018.
 */
public class EnterForm extends RegEnterPage {

    public static void entering() {
        mail.setValue("test.aleksey01@gmail.com");
        pass.setValue("testpp00--");
        if (reCaptcha.isDisplayed()) {
            reCaptcha.click();
        }
        submitButton.click();
    }
}
