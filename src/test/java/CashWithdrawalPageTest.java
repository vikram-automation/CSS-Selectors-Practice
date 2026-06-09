import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CashWithdrawalPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qawithdrawal.ccbp.tech/");
        WebElement usernameel = driver.findElement(By.cssSelector("div[class*='details']>p.name"));
        String actualName = usernameel.getText();
        if (actualName.equals("Sarah Williams")) {
            System.out.println("Username is correct");
        } else {
            System.out.println("Incorrect username");
        }
        WebElement balanceel = driver.findElement(By.cssSelector("div[class='balance-card']>p.balance"));
        String actualamount = balanceel.getText();
        if (actualamount.equals("2000")) {
            System.out.println("Initial balance is correct");
        } else {
            System.out.println("Incorrect initial balance");
        }
        List<WebElement> buttonlist = driver.findElements(By.cssSelector("ul[class^='denominations'] button.denomination-button"));
        boolean workingfine = true;
        String startText = driver.findElement(By.cssSelector("p.balance")).getText();//total amount text
        int totalBalance = Integer.parseInt(startText);// convert total amount into int
        for (int i = 0; i < buttonlist.size(); i++) { // Find button elements
            WebElement currentButton = buttonlist.get(i); // get the first buttton element
            int buttonValue = Integer.parseInt(currentButton.getText()); // convert first button element into number
            for (int j = 1; j <= 2; j++) {
                currentButton.click();
                String newamountValue = driver.findElement(By.cssSelector("p.balance")).getText();
                int actualbalance = Integer.parseInt(newamountValue);
                int expectedamount = totalBalance - buttonValue;
                if (actualbalance == expectedamount) {
                    totalBalance = actualbalance;
                } else {
                    workingfine = false;
                    System.out.println("Mismatch found in balance");
                    break;
                }
            }
            if (!workingfine) {
                break;
            }
        }
        if (workingfine) {
            System.out.println("Withdrawal App working as expected");
        }
    }
}


