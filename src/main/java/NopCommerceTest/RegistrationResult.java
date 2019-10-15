package NopCommerceTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResult extends Utils {

    Loadprops loadprops = new Loadprops();

    public void registratonAssert()

    {
        String expectedMessage = loadprops.getProperty("expectedMessageRegistraion");
        String actualMessage = getText(By.xpath("//div[@class='result']"));
        Assert.assertEquals(expectedMessage,actualMessage);

    }
}

