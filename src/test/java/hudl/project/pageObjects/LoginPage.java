package hudl.project.pageObjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By title = By.xpath("//title");

    public String getTitle(){
        return getText(title);
    }
}
