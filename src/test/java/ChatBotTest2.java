import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChatBotTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qachatbot.ccbp.tech/");
        WebElement inputfeiledel = driver.findElement(By.cssSelector("input.user-input"));
        inputfeiledel.sendKeys("Hi");
        WebElement buttonel = driver.findElement(By.cssSelector("button#sendMsgBtn"));
        buttonel.click();
        inputfeiledel.clear();
        inputfeiledel.sendKeys("Good Morning");
        buttonel.click();
        inputfeiledel.clear();
        inputfeiledel.sendKeys("Help!!!");
        buttonel.click();
        List<WebElement> descText = driver.findElements(By.cssSelector("div[id='chatContainer'] span"));
        for(WebElement list:descText){
            String option = list.getText();
            System.out.println(option);
        }
        driver.quit();
    }
}
