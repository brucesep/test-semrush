package task.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import task.TestBase;
import task.steps.EnterForm;
import task.steps.ProjCreate;
import task.steps.AddTool;

/**
 * Created by alexeya on 16.05.2018.
 */
public class TestMain extends TestBase {

    String projName = "comita.ru";

    @BeforeTest
    public void setUp() {
        openUrl();
    }

    @Test(priority = 1)
    public void logging() {
        EnterForm.entering();
        Assert.assertTrue(TestBase.consolEnables.isDisplayed());
    }
    @Test(dependsOnMethods = {"logging"})
    public void creatProj(){
        ProjCreate.projCreation(projName);
        Assert.assertTrue(TestBase.toolsCollection.isDisplayed());
    }
    @Test(dependsOnMethods = {"creatProj"})
    public void addTool(){
        AddTool.setupingTool();
        Assert.assertTrue(TestBase.tollExist.isDisplayed());
    }
    @Test(dependsOnMethods = {"addTool"})
    public void checkAddTool(){
        AddTool.checkToolAdds();
        Assert.assertTrue(TestBase.neededTool.isDisplayed());
    }

    @AfterTest
    public void tearDown() {
        logOut();
    }
}
