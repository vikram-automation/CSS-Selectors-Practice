import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlyBuyHelpDeskPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qafbhelpdesk.ccbp.tech/");
        WebElement desel = driver.findElement(By.cssSelector("div.row>:first-child p"));
        String expectedText = "37, Ayur Vigyan Nagar, New Delhi, India.";
        if (expectedText.equals(desel.getText())) {
            System.out.println("Address: Verified");
        } else {
            System.out.println("Address: Verification Failed");
        }
        // heading section testing
        WebElement heading1El = driver.findElement(By.cssSelector("div.row>div:nth-child(2)>h1"));
        String actualText2 = heading1El.getText();
        if (actualText2.equals("Get to know us")) {
            System.out.println("Heading 1: Verified");
        } else {
            System.out.println("Heading 1: Verification Failed");
        }
        //2nd heading section
        WebElement heading2El = driver.findElement(By.cssSelector("div.row>div:nth-child(3) h1"));
        String expectedText2 = "Contact with Us";
        String actualText3 = heading2El.getText();
        if (expectedText2.equals(actualText3)) {
            System.out.println("Heading 2: Verified");
        } else {
            System.out.println("Heading 2: Verification Failed");
        }
        //3rd heading section
        WebElement heading3El = driver.findElement(By.cssSelector("div[class='row']>div:nth-child(4) h1"));
        String expectedText3 = "Let Us Help You";
        String actualText4 = heading3El.getText();
        if (expectedText3.equals(actualText4)) {
            System.out.println("Heading 3: Verified");
        } else {
            System.out.println("Heading 3: Verification Failed");
        }
        //span element finding
        WebElement spanel = driver.findElement(By.cssSelector("div.row~div>:last-child"));
        String spanText = spanel.getText();
        if (spanText.equals("2020 by Rahul. Created with Bootstrap.")) {
            System.out.println("Copyright: Verified");
        } else {
            System.out.println("Copyright: Verification Failed");
        }
        driver.quit();
    }
}
