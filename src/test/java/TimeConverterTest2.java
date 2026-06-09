import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeConverterTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatimeconverter.ccbp.tech/");
        WebElement hoursinputfeildel = driver.findElement(By.cssSelector("input[id$='Hours']"));
        hoursinputfeildel.sendKeys("2");
        WebElement miniutsinputfeiledel = driver.findElement(By.cssSelector("input[id$='Minutes']"));
        miniutsinputfeiledel.sendKeys("30");
        WebElement convertbtnel = driver.findElement(By.cssSelector("button#convertBtn"));
        convertbtnel.click();
        WebElement converteddescriptionel = driver.findElement(By.cssSelector("p[class^='converted']"));
        String actualcontent = converteddescriptionel.getText();
        String expectedtext = "9000s";
        if (expectedtext.equals(actualcontent)) {
            System.out.println("Conversion Successful");
        } else {
            System.out.println("Conversion Failed");
        }
        hoursinputfeildel.clear();
        miniutsinputfeiledel.clear();
        convertbtnel.click();
        WebElement errormsgel = driver.findElement(By.cssSelector("p[class^='error']"));
        String errormsgtext = errormsgel.getText();
        String expectedtext2 = "Please enter a valid number of hours.";
        if (expectedtext2.equals(errormsgtext)) {
            System.out.println("Expected Error Message Shown");
        } else {
            System.out.println("Unexpected Error Message Shown");
        }
        hoursinputfeildel.sendKeys("1");
        convertbtnel.click();
        String errormsgtext2 = errormsgel.getText();
        String expectedtext3 = "Please enter a valid number of minutes.";
        if (expectedtext3.equals(errormsgtext2)) {
            System.out.println("Expected Error Message Shown");
        } else {
            System.out.println("Unexpected Error Message Shown");
        }
        miniutsinputfeiledel.sendKeys("15");
        convertbtnel.click();
        String actualcontent2 = converteddescriptionel.getText();
        String expectedtext4 = "4500s";
        if (expectedtext4.equals(actualcontent2)) {
            System.out.println("Conversion Successful");
        } else {
            System.out.println("Conversion Failed");
        }
        driver.quit();
    }
}
