import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ConferencePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaconference.ccbp.tech/");
        WebElement desEl = driver.findElement(By.cssSelector("h1.conference-title+p"));
        String desText = desEl.getText();
        if(desText.equals("Redefining the future of IoT with LoRaWAN")){
            System.out.println("Description is as expected");
        }else{
            System.out.println("Mismatch found in description");
        }
        //button element
        WebElement buttonel = driver.findElement(By.cssSelector("p.conference-description+button"));
        buttonel.click();
        //conference description
        WebElement conferencedesel = driver.findElement(By.cssSelector("h1.conference-details-title+p"));
        String conferenceText = conferencedesel.getText();
        if(conferenceText.equals("Join Asia’s Largest Conference on LoRaWAN")){
            System.out.println("Description is as expected");
        }else{
            System.out.println("Mismatch found in description");
        }
        List<WebElement> labelsEl = driver.findElements(By.cssSelector("h1.conference-stats-count+p"));
        for(WebElement list:labelsEl){
            System.out.println("conference stats label is :"+list.getText());
        }
        driver.quit();
    }
}
