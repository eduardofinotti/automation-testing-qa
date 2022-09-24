package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;
import runner.RunTest;
import support.ScreenshotUtils;

public class SendEmailSteps extends RunTest {

    CommonPage commonPage = new CommonPage();
    VehicleDataPage vehicleDataPage = new VehicleDataPage();
    InsurantDataPage insurantDataPage = new InsurantDataPage();
    ProductDataPage productDataPage = new ProductDataPage();
    PriceOptionPage priceOptionPage = new PriceOptionPage();
    SendQuotePage sendQuotePage = new SendQuotePage();

    @Given("^I am on send e-mail page$")
    public void i_am_on_send_e_mail_page()  {
        commonPage.accessApplication();
    }

    @Given("^fill out the form Vehicle Data$")
    public void fill_out_the_form_Vehicle_Data() {
        vehicleDataPage.selectMake("Audi");
        vehicleDataPage.selectModel("Scooter");
        vehicleDataPage.fillCylinderCapacity("400");
        vehicleDataPage.fillEnginePerformance("360");
        vehicleDataPage.fillDateOfManufacture("09/01/2022");
        vehicleDataPage.selectNumberOfSeats("5");
        vehicleDataPage.selectNumberOfSeatsMotorcycle("1");
        vehicleDataPage.selectFuelType("Diesel");
        vehicleDataPage.fillPayload("200");
        vehicleDataPage.fillTotalWeight("3000");
        vehicleDataPage.fillListPrice("33300");
        vehicleDataPage.fillAnnualMileage("33000");
        vehicleDataPage.next();
    }

    @Given("^fill out the form Insurant Data$")
    public void fill_out_the_form_Insurant_Data() {
        insurantDataPage.fillFirstName("Eduardo");
        insurantDataPage.fillLastName("Finotti");
        insurantDataPage.fillBirthDay("05/23/1992");
        insurantDataPage.selectCountry("Brazil");
        insurantDataPage.fillZipcode("88000");
        insurantDataPage.fillOccupation("Software Developer");
        insurantDataPage.selectHobbies("Speeding");
        insurantDataPage.next();
    }

    @Given("^fill out the form Product Data$")
    public void fill_out_the_form_Product_Data() {
        productDataPage.fillStartDate("10/29/2022");
        productDataPage.selectInsuranceSum("3000000");
        productDataPage.selectMeritRating("Bonus 1");
        productDataPage.selectDamageInsurance("No Coverage");
        productDataPage.selectOptionalProduct("Yes");
        productDataPage.selectCourtesyCar("No");
        productDataPage.next();
    }

    @Given("^fill out the form Price Option$")
    public void fill_out_the_form_Price_Option() {
        priceOptionPage.selectPriceGold();
        priceOptionPage.next();
    }

    @Given("^fill out the form Send Quote$")
    public void fill_out_the_form_Send_Quote() {
        sendQuotePage.fillEmail("teste@teste.com");
        sendQuotePage.fillUsername("user");
        sendQuotePage.fillPassword("Teste@123");
        sendQuotePage.fillConfirnPassword("Teste@123");
    }

    @When("^send the form$")
    public void send_the_form() {
        sendQuotePage.sendEmail();
    }

    @Then("^see \"([^\"]*)\" on the screen$")
    public void see_on_the_screen(String message)  {
        sendQuotePage.checkMessageEmailSuccess(message);
    }

    @After
    public static void afterScenario(Scenario scenario) {
        ScreenshotUtils.addScreenshotOnScenario(scenario);
    }

}
