package task.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by alexeya on 16.05.2018.
 */
public class CreateProject {

    protected static SelenideElement projDomain = Selenide.$(".s-no-projects__input.s-input__control");
    protected static SelenideElement projCreation = Selenide.$(".s-no-projects__btn.s-btn.-success.-m");
    protected static SelenideElement loadPage = Selenide.$(".pr-page__dashboard__project.clearfix");

}
