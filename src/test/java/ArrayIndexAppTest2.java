import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayIndexAppTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanumberindex.ccbp.tech/");
        WebElement descriptionel = driver.findElement(By.cssSelector("p[class*='default-array']"));
        String actualtext = descriptionel.getText();
        String expectedtext = "[ 17, 31, 77, 20, 63 ]";
        if(expectedtext.equals(actualtext)){
            System.out.println("Default Array Matched");
        }else{
            System.out.println("Mismatch in Default Array");
        }
        WebElement userinputel = driver.findElement(By.cssSelector("input[class*='user-input']"));
        userinputel.sendKeys("48");
        WebElement findbtnel = driver.findElement(By.cssSelector("button[id*='Btn']"));
        findbtnel.click();
        WebElement spanel = driver.findElement(By.cssSelector("span[class*='number']"));
        String spanelementtext = spanel.getText();
        String expectedtext2 = "-1";
        if(expectedtext2.equals(spanelementtext)){
            System.out.println("Index matched for the number 48");
        }else{
            System.out.println("Index mismatched for the number 48");
        }
        userinputel.clear();
        userinputel.sendKeys("17");
        findbtnel.click();
        String spanelementtext2 = spanel.getText();
        String expectedtest3 = "0";
        if(expectedtest3.equals(spanelementtext2)){
            System.out.println("Index matched for the number 17");
        }else{
            System.out.println("Index mismatched for the number 17");
        }
        userinputel.clear();
        userinputel.sendKeys("77");
        findbtnel.click();
        String spanelementtext3 = spanel.getText();
        String expectedtest4 = "2";
        if(expectedtest4.equals(spanelementtext3)){
            System.out.println("Index matched for the number 77");
        }else{
            System.out.println("Index mismatched for the number 77");
        }
        userinputel.clear();
        userinputel.sendKeys("63");
        findbtnel.click();
        String spanelementtext4 = spanel.getText();
        String expectedtest5 = "4";
        if(expectedtest5.equals(spanelementtext4)){
            System.out.println("Index matched for the number 63");
        }else{
            System.out.println("Index mismatched for the number 63");
        }
        driver.quit();
    }
}
