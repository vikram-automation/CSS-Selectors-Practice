import org.checkerframework.checker.lock.qual.EnsuresLockHeld;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CapitalAppTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacapitalsapp.ccbp.tech/");
        List<WebElement> optionlist = driver.findElements(By.cssSelector("select.capital-select *"));
        WebElement dropdownel = driver.findElement(By.cssSelector("select[class ^= 'capital']"));
        String[] expectedarray = {"India", "United Kingdom", "France", "Nepal", "Finland"};
        boolean isCorrrect = false;
        int i=0;
        for(i=0;i<5;i++){
           WebElement option = optionlist.get(i);
           String text = option.getText();
           Select dropdown = new Select(dropdownel);
           dropdown.selectByVisibleText(text);
           WebElement countryname = driver.findElement(By.cssSelector("div.question-container+p"));
           if(!expectedarray[i].equals(countryname.getText())){
               System.out.println("Mismatch found in country name");
               isCorrrect = true;
           }
           if(!isCorrrect){
               System.out.println("Capitals App working as expected");
           }

        }

    }
}
