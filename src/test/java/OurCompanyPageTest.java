import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurCompanyPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacompany.ccbp.tech/");
        WebElement Heading1 = driver.findElement(By.cssSelector("div.services-container>h3:first-of-type"));
        System.out.println(Heading1.getText());
        WebElement Heading2 = driver.findElement(By.cssSelector("div.services-container>h3:nth-of-type(2)"));
        System.out.println(Heading2.getText());
        WebElement Heading3 = driver.findElement(By.cssSelector("div.services-container>h3:last-of-type"));
        System.out.println(Heading3.getText());
        WebElement description1 = driver.findElement(By.cssSelector("div.services-container>p:first-of-type"));
        System.out.println(description1.getText());
        WebElement description2 = driver.findElement(By.cssSelector("div.services-container>p:nth-of-type(2)"));
        System.out.println(description2.getText());
        WebElement description3 = driver.findElement(By.cssSelector("div.services-container>p:last-of-type"));
        System.out.println(description3.getText());


driver.quit();

    }
}
