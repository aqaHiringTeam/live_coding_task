package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

  protected WebDriver driver;

  public BasePage(WebDriver webdriver) {

    this.driver = webdriver;
    PageFactory.initElements(driver, this);
  }
}
