package NopCommerceTest;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    Loadprops loadprops = new Loadprops();
    private By _clickOnRegistration = (By.xpath("//a[@class='ico-register']"));
    private By _bookCategory = By.linkText("Books");
    private By _ComputerCategory = (By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]"));


    public void clickOnRegistration()
    {
        clickButton(_clickOnRegistration);
    }

    public void clickOnBooksCategory()
    {
        clickButton(_bookCategory);
    }

    public void ClickonComputers(){
        clickButton(_ComputerCategory);

    }
    public void assertHomepage(){
        assertURL("nopcommerce");
    }


}

