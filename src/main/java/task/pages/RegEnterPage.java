package task.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by alexeya on 16.05.2018.
 */
public class RegEnterPage {

    protected static SelenideElement mail = $(By.name("email"));
    protected static SelenideElement pass = $(By.name("password"));
    protected static SelenideElement reCaptcha = $(".recaptcha-checkbox-checkmark");
    protected static SelenideElement submitButton = $(".s-btn.-m.-success.auth-form__button");

}
