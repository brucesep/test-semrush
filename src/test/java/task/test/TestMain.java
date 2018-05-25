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
    }
    @Test(priority = 2)
    public void creatProj(){
        ProjCreate.projCreation(projName);
        Assert.assertTrue(TestBase.toolsCollection.isDisplayed());
    }
    @Test(priority = 3)
    public void addTool(){
        AddTool.setupingTool();
        Assert.assertTrue(TestBase.tollExist.isDisplayed());
    }
    @Test(priority = 4)
    public void checkAddTool(){
        AddTool.checkToolAdds();
        Assert.assertTrue(TestBase.neededTool.isDisplayed());
    }

    @AfterTest
    public void tearDown() {
        logOut();
    }
}
