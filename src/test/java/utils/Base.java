package utils;

import org.openqa.selenium.WebDriver;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    public final WebDriver driver = browserFactory.startBrowser("edger","https://ndosisimplifiedautomation.vercel.app/");
}
