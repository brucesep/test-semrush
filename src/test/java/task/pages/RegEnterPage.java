package task.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by alexeya on 16.05.2018.
 */
public class RegEnterPage {

    public static SelenideElement regForm = $(".s-tab__el.js-tab");
    public static SelenideElement mail = $(By.name("email"));
    public static SelenideElement pass = $(By.name("password"));
    public static SelenideElement reCaptcha = $(".recaptcha-checkbox-checkmark");
    public static SelenideElement submitButton = $(".s-btn.-m.-success.auth-form__button");

}
