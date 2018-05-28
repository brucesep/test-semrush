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



    protected static SelenideElement setupButt = Selenide.$(".s-project__tool.-tracking.-open.js-tracking").$(".s-widget__bottom-left");
    protected static ElementsCollection buttonsColl = Selenide.$$(By.cssSelector(".s-widgets-list.js-project-tools > div"));
    protected static SelenideElement nextStep = Selenide.$(".w-navigation_footer-next");
    protected static SelenideElement selectionMenu = Selenide.$$(".select2-choice.select2-default").get(0);
    protected static SelenideElement regionSelection = Selenide.$(new Selectors.ByText("Select region (optional)"));
    protected static ElementsCollection inputText = Selenide.$$(".select2-input");
    protected static SelenideElement rusChoise = Selenide.$(new Selectors.ByText("Russ"));
    protected static SelenideElement spbChoise = Selenide.$(new Selectors.ByText("Saint"));
    protected static SelenideElement inputSandbox = Selenide.$(".wizard-textarea.js-keywords");
    protected static SelenideElement addToProject = Selenide.$(".wizard-btn.-overall.-blue.js-add-keywords");
    protected static SelenideElement weekleUpds = Selenide.$(".w-pt-weekly-notification_description");
    protected static SelenideElement startTracking = Selenide.$(".tr-wizard-layout-save.js-wizard-layout-save");
    protected static ElementsCollection projectList = Selenide.$$(".s-mshead-breadcrumbs-link");
    protected static SelenideElement ranckingsOver = Selenide.$(".tracking_report-title");

}
