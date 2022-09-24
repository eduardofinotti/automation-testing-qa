package pages;

import org.openqa.selenium.By;
import runner.RunTest;

import static support.Commands.*;

public class PriceOptionPage extends RunTest {

    // elements
    private By fieldStartDate = By.id("startdate");
    private By btnNext = By.id("nextsendquote");

    // actions
    public void selectPriceGold(){
        getDriver().findElement(By.xpath("//input[@type='radio' and @id= 'selectgold']/parent::label")).click();
    }

    public void next() {
        click(btnNext);
    }

}
