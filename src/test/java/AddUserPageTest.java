import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddUserPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qausersignup.ccbp.tech/");
        WebElement nameInputel = driver.findElement(By.cssSelector("input#name"));
        nameInputel.sendKeys("rahul");
        WebElement emailInputel = driver.findElement(By.cssSelector("input#email"));
        emailInputel.sendKeys("rahul@example.com");
        WebElement submitbtnel = driver.findElement(By.cssSelector("button[type='submit']"));
        submitbtnel.click();
        WebElement descEl = driver.findElement(By.cssSelector("p[id^='success']"));
        String descText = descEl.getText();
        if(descText.equals("New user added successfully!")){
            System.out.println("Success Message Displayed");
        }else{
            System.out.println("Success Message Missing");
        }
        WebElement clearmsgel = driver.findElement(By.cssSelector("span[id^='clearSuccess']"));
        clearmsgel.click();
        List<WebElement> errormsgel = driver.findElements(By.cssSelector("p[class^='error']"));
        for(WebElement count:errormsgel){
            String errorText = count.getText();
            if(errorText.equals("Required*")){
                System.out.println("Errors displayed correctly");
            }else{
                System.out.println("Errors not displayed correctly");
            }
        }
     driver.quit();
    }
}