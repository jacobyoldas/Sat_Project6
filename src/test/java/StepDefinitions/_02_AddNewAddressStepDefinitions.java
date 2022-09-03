package StepDefinitions;

import POM.LoginPageElements;
import POM.MyAccountPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_AddNewAddressStepDefinitions {

  MyAccountPageElements mp = new MyAccountPageElements();
  @Given("Click on Manage Addresses")
  public void clickOnManageAddresses() {
    mp.clickOnManageAddresses();
  }

  @When("Add new address with {string},{string},{string},{string},{string},{string}")
  public void addNewAddressWith(String phone, String address, String city, String state, String zipCode, String country) {
    mp.addNewAddress(phone, address, city, state, zipCode, country);
  }
   @Then("Validate Address created successfully")
  public void validateAddressCreatedSuccessfully() {
    mp.validateAddressCreatedSuccessfully();
  }
}
