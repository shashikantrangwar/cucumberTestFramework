package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.testng.Assert;

public class addNumbers {
    private int intx1=0;
    private int intx2=0;
    private int intx3=0;
    private double d3=0;
    @Given("I have a calculator")
    public void i_have_a_calculator() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
         System.out.println("int1="+int1+ " int2="+int2);
         intx3 = int1+int2;
    }
    @Then("The result of addition is {int}")
    public void the_result_of_addition_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Total is"+int1);
        Assert.assertEquals(int1.intValue(),intx3);
    }

    @When("I add double numbers {double} and {double}")
    public void iAddDoubleNumAndNum(Double arg0, Double arg1) {
      d3=arg0.doubleValue()+arg1.doubleValue();
    }

    @Then("The result of double number addition is {double}")
    public void double_addition(Double d)
    {
        Assert.assertEquals(d3,d.doubleValue());
    }

}
