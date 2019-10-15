package NopCommerceTest;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@register,@emailAFriend,@nonRegisteredUser," +
        "@RegisteredUserCheckout,@GuestuserCheckout")


public class RunTest

{

}
