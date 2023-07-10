package stepDefinition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefinition {

    @Given("user is on Banking landing page")
    public void userIsOnBankingLandingPage(){
        /* code */
        System.out.println("Landing on login page");
    }


    @Then("homepage is populated")
    public void homepageIsPopulated(){
        /* code */
        System.out.println("Homepage displayed");
    }


    @Given("test one")
    public void testOne() {
        System.out.println("test one");
    }

    @When("test two")
    public void testTwo() {
        System.out.println("test two");
    }

    @Then("test three")
    public void testThree() {
        System.out.println("test three");
    }

    @And("test four")
    public void testFour() {
        System.out.println("test four");
    }

    @When("user login into app with username {string} and password {string}")
    public void userLoginIntoAppWithUsernameAndPassword(String arg0, String arg1) {
        System.out.println("Login in with:");
        System.out.println("Name: " + arg0);
        System.out.println("Pass: " + arg1);
    }


    @And("cards displayed {string}")
    public void cardsDisplayed(String arg0) {

        System.out.println(arg0.equals("true") ? "Cards are displayed" : "Cards are not displayed");

    }

    @When("user sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable data) {
        List<List<String>> obj = data.asLists();

        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));

    }


    @When("^user login into application with username (.*) and password (.*)$")
    public void a_user_with_username_and_password(String username, String password) {

        System.out.println(username + " : " + password);

    }

    @Given("validate the browser")
    public void validateTheBrowser() {
        System.out.println("setting driver");
    }

    @When("browser is triggered")
    public void browserIsTriggered() {
        System.out.println("invoking browser");
    }

    @Then("check if browser appeared")
    public void checkIfBrowserAppeared() {
        System.out.println("checking if browser was invoked");
    }
}
