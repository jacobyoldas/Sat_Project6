package StepDefinitions;

import POM.HomePageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _03_PurchaseStepDefinitions {

  HomePageElements hp = new HomePageElements();

  @Given("Select any product and complete checkout process")
  public void selectAnyProductAndCompleteCheckoutProcess() {
    hp.selectAnItemToPurchase();
  }

  @Then("Validate you successfully purchase product")
  public void validateYouSuccessfullyPurchaseProduct() {
    hp.validateSuccessfullyPurchaseProduct();
  }
}
