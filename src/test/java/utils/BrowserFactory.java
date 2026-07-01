package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver startBrowser(String browserType, String URL){

        if(browserType.equalsIgnoreCase("edge")){
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--incognito");
            driver = new EdgeDriver(options);

        }else if(browserType.equalsIgnoreCase("Chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);

        }else if(browserType.equalsIgnoreCase("Safari")){
            driver = new SafariDriver();

        }else {
            driver = new FirefoxDriver();
        }
        driver.get(URL);
        driver.manage().window().maximize();

        return driver;
    }

}
