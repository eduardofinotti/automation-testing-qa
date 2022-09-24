package pages;

import org.openqa.selenium.By;
import runner.RunTest;

import static support.Commands.*;

public class InsurantDataPage extends RunTest {

    // elements
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By dateOfBirthField = By.id("birthdate");
    private By countrySelect = By.id("country");
    private By fieldZipcode = By.id("zipcode");
    private By fieldOccupation = By.id("occupation");
    private By btnNext = By.id("nextenterproductdata");

    // actions
    public void fillFirstName(String value){
       fillField(firstNameField, value);
    }

    public void fillLastName(String value){
        fillField(lastNameField, value);
    }

    public void fillBirthDay(String value){
        fillField(dateOfBirthField, value);
    }

    public void selectCountry(String value){
        select(countrySelect, value);
    }

    public void fillZipcode(String value){
        fillField(fieldZipcode, value);
    }

    public void fillOccupation(String value){
        fillField(fieldOccupation, value);
    }

    public void selectHobbies(String value) {
        getDriver().findElement(By.xpath("//input[@type='checkbox' and @value= '"+ value +"']/parent::label[@class='ideal-radiocheck-label']")).click();
    }

    public void next() {
        click(btnNext);
    }

}
