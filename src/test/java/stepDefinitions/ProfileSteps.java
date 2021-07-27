package stepDefinitions;

import hudl.project.pageObjects.ProfilePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProfileSteps {

    private ProfilePage profile;

    public ProfileSteps() {
        profile = new ProfilePage();
    }

    @Then("I expect to be on profile home page")
    public void iExpectToBeOnUserSHomePage() {
        Assert.assertTrue(profile.isDisplayNameVisible());
    }
}
