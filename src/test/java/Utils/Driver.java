package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Driver {
  private static WebDriver driver;

  public static WebDriver getDriver() {

    if (driver == null) {
      Logger.getLogger("").setLevel(Level.SEVERE);
      System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
      System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }
    return driver;

  }
  public static void quitDriver() {
    if (driver != null) {
      driver.quit();
      driver=null;
    }
  }
}
