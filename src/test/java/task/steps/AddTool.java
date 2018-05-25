package task.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.ui.Wait;
import task.pages.SetupToolPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 17.05.2018.
 */
public class AddTool extends SetupToolPage {

    public static void setupingTool() {
        sleepTime(7000);
        setupButt.waitUntil(Condition.appear, 10000);
        setupButt.click();
        nextStep.waitUntil(Condition.appear, 10000);
        nextStep.click();
        sleepTime(3000);
        selectionMenu.click();
        $$(inputText).last().setValue("russ");
        rusChoise.click();
        sleepTime(3000);
        regionSelection.click();
        $$(inputText).last().setValue("saint");
        spbChoise.click();
        nextStep.click();
        nextStep.click();
        inputSandbox.click();
        inputSandbox.setValue("keyword1, keyword2");
        addToProject.click();
        weekleUpds.click();
        startTracking.click();
        sleepTime(3000);
        ranckingsOver.waitUntil(Condition.appear, 5000);
    }

    public static void checkToolAdds() {
        $$(projectList).get(1).click();
        sleepTime(5000);
        buttonsColl.shouldHaveSize(12);
    }

    public static void sleepTime(Integer mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
