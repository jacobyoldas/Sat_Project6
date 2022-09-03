package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageElements extends BasePOM{
  public HomePageElements() {
    PageFactory.initElements(driver, this);
  }

  @FindBy(css = "input[id='search']")
  private WebElement searchButton;
  @FindBy(css = "img[class='product-image-photo']")
  private WebElement chooseItemPic;
  @FindBy(css = "div[class='swatch-option text']")
  private WebElement chooseSize;
  @FindBy(css = "div[class='swatch-option color']")
  private WebElement chooseColor;
  @FindBy(css = "button[class='action primary tocart']")
  private WebElement addButton;
//  @FindBy(css = "div[class='messages']")
//  private WebElement addSuccessMessage;
  @FindBy(xpath = "//a[text()='shopping cart']")
  private WebElement clickShoppingCart;
  @FindBy(xpath = "//button[@title='Proceed to Checkout']//span")
  private WebElement proceedToButton;
  @FindBy(css = "input[type='radio']")
  private WebElement shippingMethod;
  @FindBy(xpath = "//button[@data-role='opc-continue']//span")
  private WebElement nextButton;
  @FindBy(xpath = "(//button[@type='submit'])[3]")
  private WebElement placeOrder;
  @FindBy(xpath = "//span[@data-ui-id='page-title-wrapper']")
  private WebElement orderedSuccess;

public void selectAnItemToPurchase(){
  searchButton.sendKeys("coat");
  chooseItemPic.click();
  chooseSize.click();
  chooseColor.click();
  addButton.click();
  //Assert.assertTrue(addSuccessMessage.isDisplayed());
  clickShoppingCart.click();
  waitUntilVisibleAndClickable(proceedToButton);
  shippingMethod.click();
  nextButton.click();
  waitUntilVisibleAndClickable(placeOrder);
}
  public void validateSuccessfullyPurchaseProduct() {
    Assert.assertTrue(orderedSuccess.isDisplayed());
  }















}
