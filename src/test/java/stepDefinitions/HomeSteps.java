package stepDefinitions;

import hudl.project.pageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class HomeSteps {
    private HomePage homePage;

    public HomeSteps(){
       homePage = new HomePage();
    }

    @Given("I am on the {string} page")
    public void iAmOnThePage(String page) {
        homePage.open();
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {
        homePage.clickLoginButton();
    }
}
