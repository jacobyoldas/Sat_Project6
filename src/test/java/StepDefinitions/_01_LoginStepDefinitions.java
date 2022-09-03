package StepDefinitions;

import POM.LoginPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginStepDefinitions {
  LoginPageElements lp= new LoginPageElements();

  @Given("User navigate to website")
  public void userNavigateToWebsite() {
    lp.userNavigateToWebsite();
  }

  @When("User enter valid {string} and {string}")
  public void userEnterValidAnd(String email, String password) {
    lp.userEnterValidInfo(email,password);
  }

  @Then("User should login successfully")
  public void userShouldLoginSuccessfully() {
    lp.userShouldLoginSuccessfully();
  }

  @When("User enter invalid {string} or invalid {string}")
  public void userEnterInvalidOrInvalid(String email, String password) {
    lp.userEnterInvalidInfo(email,password);
  }

  @Then("User should NOT login and receive error message")
  public void userShouldNOTLoginAndReceiveErrorMessage() {
    lp.userShouldNotLoginSuccessfully();
  }
}
