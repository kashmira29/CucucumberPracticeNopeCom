package NopCommerceTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Utils {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResult registrationResult = new RegistrationResult();
    RefferedProduct refferedProduct = new RefferedProduct();
    ShoppingCart shoppingCart = new ShoppingCart();
    GuestUser guestUser = new GuestUser();
    CheckoutPage checkoutPage = new CheckoutPage();



    @Given("^user is on register page$")
    public void userIsOnRegisterPage()

    {
        homePage.clickOnRegistration();
    }

    @When("^user enter all registration details$")
    public void userEnterAllRegistrationDetails()

    {
        registrationPage.registrationPageDetails();
    }

    @Then("^user should be registerd successfully$")
    public void userShouldBeRegisterdSuccessfully()
    {
        registrationResult.registratonAssert();

    }

    @Given("^User is on Registered page$")
    public void userIsOnRegisteredPage()
    {
     homePage.clickOnRegistration();
    }

    @When("^User enter all registerd details$")
    public void userEnterAllRegisterdDetails() {
        registrationPage.registrationPageDetails();

    }

    @And("^navigate to Computer Category$")
    public void navigateToComputerCategory()
    {
        homePage.ClickonComputers();

    }

    @And("^Select the Notebook in Notebook Category$")
    public void selectTheNotebookInNotebookCategory()
    {
        refferedProduct.userSelectProduct();
    }

    @And("^navigate to Email a friend$")
    public void navigateToEmailAFriend()
    {
        refferedProduct.refferedAProductToFriendLink();
    }

    @And("^enter all details$")
    public void enterAllDetails() {
        refferedProduct.emailAFriendDetails();

    }

    @Then("^User should be able to send a link to friend and see the Success message$")
    public void userShouldBeAbleToSendALinkToFriendAndSeeTheSuccessMessage()
    {
        refferedProduct.refferedAProductAFriendAssert();
    }


    @Given("^user is on Homepage$")
    public void userIsOnHomepage()
    {
      homePage.assertHomepage();
    }

    @When("^User navigate to Computers category$")
    public void userNavigateToComputersCategory()
    {
       homePage.ClickonComputers();
    }

    @And("^Select the the Notebooks from Notebooks category$")
    public void selectTheTheNotebooksFromNotebooksCategory()
    {
        refferedProduct.userSelectProduct();
    }

    @And("^Navigate to Email a Friend page$")
    public void navigateToEmailAFriendPage()
    {
        refferedProduct.refferedAProductToFriendLink();
    }

    @And("^enter all details in Email A Friend$")
    public void enterAllDetailsInEmailAFriend()
    {
        refferedProduct.nonRegisteredUser();

    }

    @Then("^User should not be able to send a Link to friend and see Error Message$")
    public void userShouldNotBeAbleToSendALinkToFriendAndSeeErrorMessage()
    {
        refferedProduct.nonRegistereduserAssert();

    }

    @Given("^User is on Registration page$")
    public void userIsOnRegistrationPage()
    {
        homePage.clickOnRegistration();
        
    }

    @When("^user enter all details on Registration Page$")
    public void userEnterAllDetailsOnRegistrationPage()
    {
        registrationPage.registrationPageDetails();
    }

    @And("^Navigate to Books Category$")
    public void navigateToBooksCategory()
    {
        homePage.clickOnBooksCategory();
    }

    @And("^add item in to shopping cart$")
    public void addItemInToShoppingCart()
    {
        shoppingCart.buyaproduct();
    }

    @And("^Navigate to Checkout Page and fill checkout Details$")
    public void navigateToCheckoutPageAndFillCheckoutDetails()

    {
        checkoutPage.checkoutPagedetails();
    }

    @Then("^user should be able to buy the item and should see Success Message$")
    public void userShouldBeAbleToBuyTheItemAndShouldSeeSuccessMessage()

    {
        checkoutPage.checkoutassert();
    }

    @Given("^user navigate to Books category on Homepage$")
    public void userNavigateToBooksCategoryOnHomepage()
    {
        homePage.clickOnBooksCategory();

    }

    @When("^user add item in to Shopping Cart$")
    public void userAddItemInToShoppingCart()
    {
        shoppingCart.buyaproduct();

    }
    @And("^checkout As A guest user$")
    public void checkoutAsAGuestUser() {
        guestUser.chckoutAsaGuest();
    }

    @And("^Navigate to Checkout Page$")
    public void navigateToCheckoutPage()
    {
        checkoutPage.checkoutPagedetails();
    }

    @Then("^user should be able to buy the product and should see Success Message$")
    public void userShouldBeAbleToBuyTheProductAndShouldSeeSuccessMessage() {
        checkoutPage.checkoutassert();
    }


}
