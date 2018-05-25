package task.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 17.05.2018.
 */
public class SetupToolPage {



    public static SelenideElement setupButt = $(".s-project__tool.-tracking.-open.js-tracking").$(".s-widget__bottom-left");
    public static ElementsCollection buttonsColl = $$(By.cssSelector(".s-widgets-list.js-project-tools > div"));
    public static SelenideElement nextStep = $(".w-navigation_footer-next");
    public static SelenideElement selectionMenu = $$(".select2-choice.select2-default").get(0);
    public static SelenideElement regionSelection = $(new Selectors.ByText("Select region (optional)"));
    public static ElementsCollection inputText = $$(".select2-input");
    public static SelenideElement rusChoise = $(new Selectors.ByText("Russ"));
    public static SelenideElement spbChoise = $(new Selectors.ByText("Saint"));
    public static SelenideElement inputSandbox = $(".wizard-textarea.js-keywords");
    public static SelenideElement addToProject = $(".wizard-btn.-overall.-blue.js-add-keywords");
    public static SelenideElement weekleUpds = $(".w-pt-weekly-notification_description");
    public static SelenideElement startTracking = $(".tr-wizard-layout-save.js-wizard-layout-save");
    public static ElementsCollection projectList = $$(".s-mshead-breadcrumbs-link");
    public static SelenideElement ranckingsOver = $(".tracking_report-title");

}
