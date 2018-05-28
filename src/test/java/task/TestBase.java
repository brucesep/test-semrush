package task;


import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by alexeya on 16.05.2018.
 */
public class TestBase {

    private static String url = "https://www.semrush.com/";
    private static SelenideElement language = $(".header-dropdown__toggle.uppercase");
    private static SelenideElement rusChoise = $(new Selectors.ByText("Русский"));
    private static SelenideElement entering = $(new Selectors.ByText("Войти"));
    private static ElementsCollection iconLogout = $$(".header-dropdown__toggle");
    private static SelenideElement exiting = $(new Selectors.ByText("Выйти"));
    protected static SelenideElement toolsCollection = $(".s-project__tools.js-project-tools");
    protected static SelenideElement consolEnables = $(".srf-report-sidebar-all-tools__link.srf-report-sidebar-all-tools__link--active.js-sidebar-link");
    protected static SelenideElement tollExist = $(".tracking_report-title");
    protected static SelenideElement neededTool = $(".js-tracking.widget-tracking-wrapper").$(new Selectors.ByText("0%"));

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
