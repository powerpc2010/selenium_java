import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver.get("https://yandex.ru");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));
        driver.quit();
    }
}
