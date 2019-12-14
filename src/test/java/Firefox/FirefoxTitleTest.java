package Firefox;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTitleTest {

    public WebDriver driver;


    @Test
    public void firefoxTitleTest() {
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://comaqa.by");
        Assert.assertEquals(driver.getTitle(), "COMAQA.BY — QA Automation Community Belarus");
        driver.quit();
    }


}
