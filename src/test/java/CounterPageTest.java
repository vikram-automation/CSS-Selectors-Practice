import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CounterPageTest {
    public static void main (String[]args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacounter.ccbp.tech/");
        WebElement countel = driver.findElement(By.cssSelector("h1.count"));
        String expectedText = countel.getText();
        if(expectedText.equals("Count 0")){
            System.out.println("Initial Count Value Checked");
        }else{
            System.out.println("Mismatch Found in Initial Count Value");
        }
        List<WebElement> buttonel = driver.findElements(By.cssSelector("h1.count~button"));
        boolean workingFine = true;
        int i=1;
        for(i=1;i<=5;i++){
            buttonel.get(0).click();
            String countText = driver.findElement(By.cssSelector("h1.count")).getText();
            if(!countText.equals("Count " + i)){
                workingFine = false;
                System.out.println("Mismatch found in counter value");
                break;
            }
        }
        if(workingFine){
            buttonel.get(1).click();
            String countText = driver.findElement(By.cssSelector("h1.count")).getText();
            if(countText.equals("Count 4")){
                System.out.println("Counter App working as expected");
            }else{
                System.out.println("Mismatch found in counter value");
            }

        }
    }
}
