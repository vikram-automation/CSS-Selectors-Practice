import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabsTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatabs.ccbp.tech/\n");
        WebElement AboutbtnEl = driver.findElement(By.cssSelector("button[id^='about']"));
        AboutbtnEl.click();
        WebElement AboutdescriptionEl = driver.findElement(By.cssSelector("p[id^='about']"));
        String ActualText = AboutdescriptionEl.getText();
        String ExpectedText = "Varanasi is one of the oldest living cities in the world. Its Prominence in Hindu mythology is virtually unrevealed. Mark Twain, the English author and literature, who was enthralled by the legend and sanctity of Benaras, once wrote, \"Benaras is older than history, older than tradition, older even than legend and looks twice as old as all of them put together\".";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id^='about']")));
        if(ExpectedText.equals(ActualText)){
            System.out.println("About Content Matched");
        }else{
            System.out.println("Mismatch in the 'About' Content");
        }
        WebElement  TimeToVisitEl = driver.findElement(By.cssSelector("button[id^='timeToVisit']"));
        TimeToVisitEl.click();
        WebElement TimeToVisitdescriptionEl = driver.findElement(By.cssSelector("p[id^='timeToVisit']"));
        String ActualText2 = TimeToVisitdescriptionEl.getText();
        String ExpectedText2 = "October to March is the best time to visit Varanasi because most of the fairs here are held during this time of the year. Festivities begin with Diwali and continue to Dev Diwali celebrated on the 15th day from Diwali. In between, there is also Annakut. During this time, the ghats are lit with lights and diyas. Earthen lamps adorn the staircase of the ghats and are also afloat in the river. Firecrackers burn through the night, and it's a sight no one should miss.";
        if(ExpectedText2.equals(ActualText2)){
            System.out.println("Time to Visit Content Matched");
        }else{
            System.out.println("Mismatch in the 'Time to Visit' Content");
        }
        WebElement  AttractionEl = driver.findElement(By.cssSelector("button[id^='attractions']"));
        AttractionEl.click();
        WebElement AttractiondescriptionEl = driver.findElement(By.cssSelector("p[id^='attractions']"));
        String ActualText3 = AttractiondescriptionEl.getText();
        String ExpectedText3 = "When visiting Varanasi, one comes across plenty of ghats, but among them, Dashashwamedh Ghat is said to be one of the oldest and most important. This ghat, leading to the Ganges, is located close to the famous old Vishwanath temple in Kashi (today’s Banaras). Another famous attraction is River Ganges which is the holiest river by the Hindus and many more.";
        if(ExpectedText3.equals(ActualText3)){
            System.out.println("Attractions Content Matched");
        }else{
            System.out.println("Mismatch in the 'Attractions' Content");
        }

     driver.quit();
    }
}
