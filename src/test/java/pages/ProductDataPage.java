package pages;

import org.openqa.selenium.By;
import runner.RunTest;

import static support.Commands.*;

public class ProductDataPage extends RunTest {

    // elements
    private By fieldStartDate = By.id("startdate");
    private By fieldInsuranceSum = By.id("insurancesum");
    private By fieldMeritRating = By.id("meritrating");
    private By fieldDamageInsurance = By.id("damageinsurance");
    private By fieldCourtesyCar = By.id("courtesycar");
    private By btnNext = By.id("nextselectpriceoption");

    // actions
    public void fillStartDate(String value){
       fillField(fieldStartDate, value);
    }

    public void selectInsuranceSum(String value){
        selectByValue(fieldInsuranceSum, value);
    }

    public void selectMeritRating(String value){
        select(fieldMeritRating, value);
    }

    public void selectDamageInsurance(String value){
        select(fieldDamageInsurance, value);
    }

    public void selectOptionalProduct(String value){
        getDriver().findElement(By.xpath("//input[@type='checkbox' and @value= '"+ value +"']/parent::label[@class='ideal-radiocheck-label']")).click();
//        selectCheckboxByLabel(value);
    }

    public void selectCourtesyCar(String value){
        select(fieldCourtesyCar, value);
    }


    public void next() {
        click(btnNext);
    }

}
