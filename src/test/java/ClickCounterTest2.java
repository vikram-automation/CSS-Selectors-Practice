import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCounterTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickcounter.ccbp.tech/");
        WebElement clickmebtnel = driver.findElement(By.cssSelector("button.button"));
        WebElement spanel = driver.findElement(By.cssSelector("span[class*='counter']"));
        for (int counter = 1; counter <=100; counter = counter + 1) {
            clickmebtnel.click();
            String spancount = spanel.getText();
            int count = Integer.parseInt(spancount);
            if(count != counter){
                System.out.println("count mismatch");
                break;
            }if(counter == 100) {
                System.out.println("Click Counter App: Working as expected");
            }
        }
        driver.quit();
    }
}
