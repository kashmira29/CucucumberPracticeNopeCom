package NopCommerceTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static NopCommerceTest.Utils.randomDate;

public class Hooks extends Basepage {


    BrowserSelector browserSelector = new BrowserSelector();

    @Before

    public void setUpBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com");
    }

    @After


    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...

            // final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File("C:\\Dev\\CucumberPractice\\src\\test\\Resources\\ScreenShots" + randomDate() + ".png");

            //Copy file at destination
            try {
                FileUtils.copyFile(SrcFile, DestFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // embed it in the report.
            // scenario.embed(screenshot, "image/png");

           }

            driver.quit();
    }
}






