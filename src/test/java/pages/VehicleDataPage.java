package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunTest;

import static support.Commands.*;

public class VehicleDataPage extends RunTest {

    // elements
    private By makeSelect = By.id("make");
    private By modelSelect = By.id("model");
    private By numberofseatsSelect = By.id("numberofseats");
    private By numberofseatsMotorcycleSelect = By.id("numberofseatsmotorcycle");
    private By fuelTypeSelect = By.id("fuel");

    private By fieldCylinderCapacity = By.id("cylindercapacity");
    private By fieldPerformance = By.id("engineperformance");
    private By fieldDateOfManufacture = By.id("dateofmanufacture");
    private By fieldPayload = By.id("payload");
    private By fieldTotalWeight = By.id("totalweight");
    private By fieldListPrice = By.id("listprice");
    private By fieldAnnualMileage = By.id("annualmileage");

    private By btnNext = By.id("nextenterinsurantdata");

    // actions
    public void selectMake(String value){
       select(makeSelect, value);
    }

    public void selectModel(String value){
        select(modelSelect, value);
    }

    public void fillCylinderCapacity(String value){
        fillField(fieldCylinderCapacity, value);
    }

    public void fillEnginePerformance(String value){
        fillField(fieldPerformance, value);
    }

    public void fillDateOfManufacture(String value){
        fillField(fieldDateOfManufacture, value);
    }

    public void selectNumberOfSeats(String value){
        select(numberofseatsSelect, value);
    }

    public void selectNumberOfSeatsMotorcycle(String value){
        select(numberofseatsMotorcycleSelect, value);
    }

    public void selectFuelType(String value){
        fillField(fuelTypeSelect, value);
    }

    public void fillPayload(String value){
        fillField(fieldPayload, value);
    }

    public void fillTotalWeight(String value){
        fillField(fieldTotalWeight, value);
    }

    public void fillListPrice(String value){
        fillField(fieldListPrice, value);
    }

    public void fillAnnualMileage(String value){
        fillField(fieldAnnualMileage, value);
    }

    public void next() {
        click(btnNext);
    }

}
