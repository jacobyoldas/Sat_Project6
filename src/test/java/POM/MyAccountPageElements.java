package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPageElements extends BasePOM {

  public MyAccountPageElements() {
    PageFactory.initElements(driver, this);
  }
  @FindBy(css = "button[class='action switch']")
  private WebElement myAccountDropdown;
  @FindBy(xpath = "//a[text()='My Account']")
  private WebElement myAccountButton;
  @FindBy(xpath = "//span[text()='Manage Addresses']")
  private WebElement manageAddressButton;

  @FindBy(css = "input[id='street_1']")
  private WebElement inputStreetAddress;

  @FindBy(css = "input[id='city']")
  private WebElement inputCity;

  @FindBy(css = "select[id='region_id']")
  private WebElement stateDropdown;

  @FindBy(css = "input[id='zip']")
  private WebElement inputZipCode;

  @FindBy(css = "select[id='country']")
  private WebElement countryDropdown;

  @FindBy(css = "input[id='telephone']")
  private WebElement inputPhoneNumber;

  @FindBy(css = "button[title='Save Address']")
  private WebElement saveButton;

  @FindBy(css = "div[role='alert']")
  private WebElement addNewAddressSuccessMsg;

  @FindBy(xpath = "//span[text()='Welcome, Yoldas Yoldas!']")
  private WebElement successMessage;

  @FindBy(xpath = "//span[text()='Add New Address']")
  private WebElement addNewAddressButton;


  public void userShouldLoginSuccessfully(){
    Assert.assertTrue(successMessage.isDisplayed());
  }
  public void clickOnManageAddresses() {
    myAccountDropdown.click();
    myAccountButton.click();
    manageAddressButton.click();
  }
  public void addNewAddress(String phone, String address, String city, String state, String zipCode, String country) {
    addNewAddressButton.click();
    inputPhoneNumber.sendKeys(phone);
    inputStreetAddress.sendKeys(address);
    inputCity.sendKeys(city);
    selectFunction(stateDropdown,state);
    inputZipCode.sendKeys(zipCode);
    selectFunction(countryDropdown,country);
    saveButton.click();
  }
  public void validateAddressCreatedSuccessfully() {
    waitUntilVisibleAndClickable(addNewAddressSuccessMsg);
    Assert.assertTrue(addNewAddressSuccessMsg.isDisplayed());
  }
}


