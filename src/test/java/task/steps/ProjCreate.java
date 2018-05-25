package task.steps;

import com.codeborne.selenide.Condition;
import task.pages.CreateProject;

/**
 * Created by alexeya on 16.05.2018.
 */
public class ProjCreate extends CreateProject {

    public static void projCreation(String projName) {
        projDomain.waitUntil(Condition.appear, 5000);
        projDomain.setValue(projName);
        projCreation.click();
        loadPage.waitUntil(Condition.appear, 15000);

    }
}
