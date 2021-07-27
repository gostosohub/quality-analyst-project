package hudl.project.pageObjects;

import core.fileReader.ConfigReader;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private String pageUrl = ConfigReader.getProperty("baseUrl");
    private By loginButton = By.xpath("//a[@class=\"btn__blue login\"]");

    public void open() {
        System.out.println("Navigating to " + pageUrl);
        openPage(pageUrl);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
