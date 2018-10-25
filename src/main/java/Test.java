import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver_win32/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Cheese!");

        element.submit();

        System.out.println("Page title is: " + driver.getTitle());


        driver.quit();

    }

}
