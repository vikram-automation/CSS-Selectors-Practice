import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AboutMePageTest {
    public static void main (String[]args){
     System.setProperty("webdriver.chrome.driver","C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://qaaboutme.ccbp.tech/");
        WebElement aboutmeel = driver.findElement(By.cssSelector("h1[class*='about-me']"));
        String aboutmeText = aboutmeel.getText();
        if(aboutmeText.equals("Facts")){
            System.out.println("Sub-heading is as expected");
        }else{
            System.out.println("Mismatch found in sub-heading");
        }
        // main heading
        WebElement mainheadingel = driver.findElement(By.cssSelector("h1[class*='about-me']+h1"));
        String mainheadText = mainheadingel.getText();
        if(mainheadText.equals("About me")){
            System.out.println("Main heading is as expected");
        }else{
            System.out.println("Mismatch found in main heading");
        }
        // four title
        List<WebElement> skillTitles = driver.findElements(By.cssSelector("div[class ^= 'skills'] h1.skills-card-title"));
        for(WebElement list:skillTitles){
            System.out.println(list.getText());
        }
        driver.quit();
}
}
