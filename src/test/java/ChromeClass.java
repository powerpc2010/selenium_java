import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeClass {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        System.out.println("test status");
    }

    @Test
    public void ChromeClass() {
        driver.get("https://selenium.dev");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("SeleniumHQ Browser Automation"));
        driver.quit();
    }

    @After
    public void close() {
        System.out.println("test close");
        driver.quit();
    }

}
