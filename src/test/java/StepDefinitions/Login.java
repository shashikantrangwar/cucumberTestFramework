package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    @Given("Login page is open")
    public void login_page_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is a test");
    }
    @When("user enters info")
    public void user_enters_info() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is a test");
    }
    @Then("login should be successful")
    public void login_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is a test");
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_password()
    {
        System.out.println("This is invalid username and password");
    }
    @Then("login should not be successful")
    public void login_not_success()
    {
        System.out.println("Login not successful");
    }

}
