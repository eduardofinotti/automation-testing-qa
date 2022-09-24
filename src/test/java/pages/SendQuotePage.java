package pages;

import org.openqa.selenium.By;
import runner.RunTest;

import static support.Commands.*;

public class SendQuotePage extends RunTest {

    // elements
    private By fieldEmail = By.id("email");
    private By fieldUsername = By.id("username");
    private By fieldPassword = By.id("password");
    private By fieldConfirmPassword = By.id("confirmpassword");
    private By btnSend = By.id("sendemail");
    private By successMEssage = By.cssSelector(".sweet-alert > h2");

    // actions
    public void fillEmail(String value){
        fillField(fieldEmail, value);
    }

    public void fillUsername(String value){
        fillField(fieldUsername, value);
    }

    public void fillPassword(String value){
        fillField(fieldPassword, value);
    }

    public void fillConfirnPassword(String value){
        fillField(fieldConfirmPassword, value);
    }

    public void sendEmail() {
        click(btnSend);
    }

    public void checkMessageEmailSuccess(String expectedMessage){
        checkMessage(successMEssage, expectedMessage);
    }

}
