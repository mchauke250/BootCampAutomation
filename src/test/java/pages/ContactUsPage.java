package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage {

    WebDriver driver;

    By contactUs_xpath = By.xpath("//button[@class='nav-item ']/span[contains(text(),'Contact Us')]");

    public ContactUsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickContactUsButton() {
        //new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(contactUs_xpath));
        driver.findElement(contactUs_xpath).click();
    }
}
