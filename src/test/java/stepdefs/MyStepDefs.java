package stepdefs;

import core.driverManager.DriverFactory;
import hudl.project.pageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepDefs {

    @Given("I navigate to the hudl home page")
    public void iNavigateToTheHudlHomePage() {
        HomePage homePage = new HomePage();
        homePage.open();
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {
        WebDriver driver = DriverFactory.getCurrentDriver();
        WebElement element = driver.findElement(By.xpath("//a[@class=\"btn__blue login\"]"));

        element.click();
    }

    @Then("I should be see the login page")
    public void iShouldBeSeeTheLoginPage() {
        WebDriver driver = DriverFactory.getCurrentDriver();

        Assert.assertEquals("Log In - Hudl", driver.getTitle());
    }
}
