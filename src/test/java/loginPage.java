import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginPage {
    WebDriver driver; //Declaring a reference variable

    @BeforeTest
    public void launchBrowser() {
        driver = new EdgeDriver();//Launching a Browser
        driver.get("https://ndosisimplifiedautomation.vercel.app/"); //Launching the URL
        driver.manage().window().maximize(); //Maximizing the Window
    }

    @Test
    public void clickLoginButtonTest() throws InterruptedException {
        //Locating the login button
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
        //driver.findElement(By.xpath("/html/body/div/div/main/section/div[1]/div[1]/h2/span[3]")).isDisplayed();
        //Thread.sleep(2000);
    }
    //@Test(priority = 1)
    @Test(dependsOnMethods = "clickLoginButtonTest")
    public void enterEmailTest() {
        driver.findElement(By.id("login-email")).sendKeys("lava@gmail.com");
    }

    //@Test(priority = 2)
    @Test(dependsOnMethods = "enterEmailTest")
    public void enterPasswordTest() {
        driver.findElement(By.id("login-password")).sendKeys("Password@1");
    }

    //@Test(priority = 3)
    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickSubmitButtonTest() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        System.out.println("Successfully Logged in to Ndosi Automation Website ");
        Thread.sleep(5000);
    }

    //@Test(priority = 4)
    @Test(dependsOnMethods = "clickSubmitButtonTest")
    public void loginVerificationTest() {
        String welcomeText = driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[1]")).getText();
        Assert.assertEquals(welcomeText, "Welcome");
    }

    @Test(dependsOnMethods = "loginVerificationTest")
    public void clickLearnTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickLearnTest")
    public void selectLearningMaterialTest() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        System.out.println("Successfully selected the Learning Material");
    }

    @Test(dependsOnMethods = "selectLearningMaterialTest")
    public void navigateToBasicformTest() {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        System.out.println("Successfully Navigated to the Basic Form");
    }

    @Test(dependsOnMethods = "navigateToBasicformTest")
    public void formInstructionsTest() {
        driver.findElement(By.xpath("//*[@id=\"basic-form-requirements\"]/summary")).click();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit(); //Closing the Browser
    }

}
