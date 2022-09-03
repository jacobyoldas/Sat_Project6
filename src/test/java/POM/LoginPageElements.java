package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPageElements extends BasePOM {
  public LoginPageElements() {
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//li//a")
  private WebElement sigInButton;

  @FindBy(xpath = "(//input[@class='input-text'])[2]")
  private WebElement emailInput;

  @FindBy(xpath = "//input[@type='password']")
  private WebElement passwordInput;

  @FindBy(id = "send2")
  private WebElement sigInButton2; //span[text()='Welcome, Yoldas Yoldas!']


  @FindBy(xpath = "//strong[text()='Try Demo Customer Access']")
  private WebElement unSuccessMessage;



  public void userNavigateToWebsite(){
    sigInButton.click();
  }

  public void userEnterValidInfo(String data1, String data2){
    emailInput.sendKeys(data1);
    passwordInput.sendKeys(data2);
    sigInButton2.click();
  }

  public void userEnterInvalidInfo(String email, String password){
    emailInput.sendKeys(email);
    passwordInput.sendKeys(password);
    sigInButton2.click();
  }
  public void userShouldNotLoginSuccessfully(){
    Assert.assertTrue(unSuccessMessage.isDisplayed());
  }



















}
