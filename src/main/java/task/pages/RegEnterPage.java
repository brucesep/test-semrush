package task.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by alexeya on 16.05.2018.
 */
public class RegEnterPage {

    protected static SelenideElement mail = Selenide.$(By.name("email"));
    protected static SelenideElement pass = Selenide.$(By.name("password"));
    protected static SelenideElement reCaptcha = Selenide.$(".recaptcha-checkbox-checkmark");
    protected static SelenideElement submitButton = Selenide.$(".s-btn.-m.-success.auth-form__button");

}
