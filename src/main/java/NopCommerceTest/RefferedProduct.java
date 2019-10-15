package NopCommerceTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RefferedProduct extends Utils {

    Loadprops loadprops = new Loadprops();

    private By _SelectNotebook = By.xpath("//h2/a[@href=\"/notebooks\"]");
    private By _productSelect = By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]");
    private By _clickOnEmailAFriend = By.className("email-a-friend");
    private By _friendEmail = By.className("friend-email");
    private By _youremail = By.id("YourEmailAddress");
    private By _personalText = By.id("PersonalMessage");
    private By _clickOnSendEmail = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");

    public void userSelectProduct() {
        clickButton(_SelectNotebook);
        clickButton(_productSelect);

    }
    public void refferedAProductToFriendLink () {

        clickButton(_clickOnEmailAFriend);
    }

    public void emailAFriendDetails(){
        enterText(_friendEmail, loadprops.getProperty("friendemail"));
        enterText(_personalText, loadprops.getProperty("PersonalMessage"));
        clickButton(_clickOnSendEmail);

    }


    public void nonRegisteredUser(){

        //clickButton(_clickOnEmailAFriend);
        enterText(_friendEmail,loadprops.getProperty("friendemail"));
        enterText(_youremail,loadprops.getProperty("yourEmail"));
        enterText(_productSelect,loadprops.getProperty("PersonalMessage"));
        clickButton(_clickOnSendEmail);

    }

    public void refferedAProductAFriendAssert(){
        String expectedMessage = loadprops.getProperty("expectedMessagerefferedLink");
        String actualMessage = getText(By.className("result"));

        Assert.assertEquals(expectedMessage,actualMessage);
    }
    public void nonRegistereduserAssert(){
        String expectedResult = loadprops.getProperty("Nonregisterduser");
        String actualresult = getText(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));

        Assert.assertEquals(expectedResult,actualresult);
    }

}
