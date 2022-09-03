package StepDefinitions;

import POM.LoginPageElements;
import POM.MyAccountPageElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class _01_LoginStepDefinitions {
  LoginPageElements lp= new LoginPageElements();
  MyAccountPageElements mp=  new MyAccountPageElements();

  @Given("User navigate to website")
  public void userNavigateToWebsite() {
    lp.userNavigateToWebsite();
  }

  @When("User enter valid username and password")
  public void userEnterValidUsernameAndPassword(DataTable dataTable) {
    List<List<String>> testData = dataTable.asLists();
    for (List<String> data : testData) {
    lp.userEnterValidInfo(data.get(0),data.get(1));
  }
 }
  @Then("User should login successfully")
  public void userShouldLoginSuccessfully() {
    mp.userShouldLoginSuccessfully();
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
