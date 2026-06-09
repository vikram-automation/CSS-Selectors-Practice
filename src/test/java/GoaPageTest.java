import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoaPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qagoapage.ccbp.tech/");
        WebElement heading1 = driver.findElement(By.cssSelector("div.row h1:first-child"));
        System.out.println(heading1.getText());
        WebElement descriptionel = driver.findElement(By.cssSelector("div.row>:nth-child(2)>p"));
        System.out.println(descriptionel.getText());
        WebElement heading2 = driver.findElement(By.cssSelector("div.row h1:nth-of-type(2)"));
        System.out.println(heading2.getText());
        WebElement heading3 = driver.findElement(By.cssSelector("div.row h1:nth-of-type(3)"));
        System.out.println(heading3.getText());

    }
}
