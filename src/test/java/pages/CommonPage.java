package pages;

import runner.RunTest;

public class CommonPage extends RunTest {

    public void accessApplication() {
        String browser = System.getProperty("browser");
        getDriver(browser).get("http://sampleapp.tricentis.com/101/app.php");
    }
}
