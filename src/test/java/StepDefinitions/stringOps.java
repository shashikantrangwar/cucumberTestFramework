package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class stringOps {
     private String String3=null;
    @Given("I have a StringOpsClient")
    public void i_have_stringops_client()
    {

    }

    @When("I concatenate {string} and {string}")
    public void i_concatenate_strings(String String1,String String2)
    {
     String3 = String1.concat(String2);
    }
    
    @Then("The result of concatenation is {string}")
    public void concatenated_result(String String3x)        
    {
        Assert.assertEquals(String3x,String3);
    }



}
