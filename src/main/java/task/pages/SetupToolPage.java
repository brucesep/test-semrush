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



    protected static SelenideElement setupButt = $(".s-project__tool.-tracking.-open.js-tracking").$(".s-widget__bottom-left");
    protected static ElementsCollection buttonsColl = $$(By.cssSelector(".s-widgets-list.js-project-tools > div"));
    protected static SelenideElement nextStep = $(".w-navigation_footer-next");
    protected static SelenideElement selectionMenu = $$(".select2-choice.select2-default").get(0);
    protected static SelenideElement regionSelection = $(new Selectors.ByText("Select region (optional)"));
    protected static ElementsCollection inputText = $$(".select2-input");
    protected static SelenideElement rusChoise = $(new Selectors.ByText("Russ"));
    protected static SelenideElement spbChoise = $(new Selectors.ByText("Saint"));
    protected static SelenideElement inputSandbox = $(".wizard-textarea.js-keywords");
    protected static SelenideElement addToProject = $(".wizard-btn.-overall.-blue.js-add-keywords");
    protected static SelenideElement weekleUpds = $(".w-pt-weekly-notification_description");
    protected static SelenideElement startTracking = $(".tr-wizard-layout-save.js-wizard-layout-save");
    protected static ElementsCollection projectList = $$(".s-mshead-breadcrumbs-link");
    protected static SelenideElement ranckingsOver = $(".tracking_report-title");

}
