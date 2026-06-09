import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TipCalculatorPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatipcalc.ccbp.tech/");
        WebElement billamountinputel = driver.findElement(By.cssSelector("input[id^='bill']"));
        billamountinputel.sendKeys("1000");
        WebElement percentageinputel = driver.findElement(By.cssSelector("input[id^='percentage']"));
        percentageinputel.sendKeys("12");
        WebElement calculatebtnel = driver.findElement(By.cssSelector("button[id*='calculate']"));
        calculatebtnel.click();
        List<WebElement> amountel = driver.findElements(By.cssSelector("p[id*='Amount']"));
        String tipamount = amountel.get(0).getText();
        String totalamount = amountel.get(1).getText();
        if(tipamount.contains("120.00") && totalamount.contains("1120.00")){
            System.out.println("Tip Calculated Correctly");
        }else{
            System.out.println("Tip Calculated Incorrectly");
        }
        percentageinputel.clear();
        calculatebtnel.click();
        WebElement errormsgel = driver.findElement(By.cssSelector("p#errorMessage"));
        String actualerrorText = errormsgel.getText();
        if(actualerrorText.equals("Please Enter a Valid Input.")){
            System.out.println("Error message displayed for no input");
        }else{
            System.out.println("Error message missing for no input");
        }
        percentageinputel.sendKeys("10f.");
        calculatebtnel.click();
        WebElement errormsgel2 = driver.findElement(By.cssSelector("p#errorMessage"));
        String actualerrorText2 = errormsgel2.getText();
        if(actualerrorText2.equals("Please Enter a Valid Input.")){
            System.out.println("Error message displayed for invalid input");
        }else{
            System.out.println("Error message missing for invalid input");
        }
        driver.quit();

    }
}
