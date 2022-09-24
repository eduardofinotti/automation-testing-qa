package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunTest;

public class Commands extends RunTest {

    public static void select(By element, String value) {
        System.out.println("-----------------------");
        System.out.println("Vai selecionar o elemento: " + element);

        Select select = new Select(getDriver().findElement(element));
        select.selectByVisibleText(value);

        System.out.println("Selecionou o elemento: " + element);
        System.out.println("-----------------------");
    }

    public static void selectByValue(By element, String value) {
        System.out.println("-----------------------");
        System.out.println("Vai selecionar o elemento: " + element);

        Select select = new Select(getDriver().findElement(element));
        select.selectByValue(value);

        System.out.println("Selecionou o elemento: " + element);
        System.out.println("-----------------------");
    }

    public static void fillField(By element, String value) {
        System.out.println("-----------------------");
        System.out.println("Vai preencher o campo: " + element);

        getDriver().findElement(element).sendKeys(value);

        System.out.println("Preencheu o campo: " + element);
        System.out.println("-----------------------");
    }

    public static void click(By element) {
        System.out.println("-----------------------");
        System.out.println("Vai clicar no botão: " + element);

        getDriver().findElement(element).click();

        System.out.println("Clicou no botão: " + element);
        System.out.println("-----------------------");
    }

    public static void selectCheckboxByLabel(String value) {
        System.out.println("-----------------------");
        System.out.println("Vai selecionar o checkbox: " + value);

        getDriver().findElement(By.xpath("//label[@text() = '" + value + "']")).click();

        System.out.println("Preencheu o checkbox: " + value);
        System.out.println("-----------------------");
    }

    public static void checkMessage(By element, String expectedMessage) {
        System.out.println("##################################");
        System.out.println("Vai validar mensagem: " + expectedMessage);

        String textScreen = getDriver().findElement(element).getText();
        Assert.assertEquals(expectedMessage, textScreen);

        System.out.println("Validou mensagem: " + expectedMessage);
        System.out.println("##################################");
    }
}
