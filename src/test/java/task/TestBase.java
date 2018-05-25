package task;


import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by alexeya on 16.05.2018.
 */
public class TestBase {

    static String url = "https://www.semrush.com/";
    static SelenideElement language = $(".header-dropdown__toggle.uppercase");
    static SelenideElement rusChoise = $(new Selectors.ByText("Русский"));
    static SelenideElement entering = $(new Selectors.ByText("Войти"));
    static ElementsCollection iconLogout = $$(".header-dropdown__toggle");
    static SelenideElement exiting = $(new Selectors.ByText("Выйти"));
    public static SelenideElement toolsCollection = $(".s-project__tools.js-project-tools");
    public static SelenideElement tollExist = $(".tracking_report-title");
    public static SelenideElement neededTool = $(".js-tracking.widget-tracking-wrapper").$(new Selectors.ByText("0%"));

    public static void openUrl() {

        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "D:/JAVA/webdrvs/chromedriver.exe");

        open(url);
        language.click();
        rusChoise.click();
        entering.click();
    }

    public static void logOut(){
        $$(iconLogout).last().click();
        exiting.waitUntil(Condition.appear, 5000);
        exiting.click();

    }
}
