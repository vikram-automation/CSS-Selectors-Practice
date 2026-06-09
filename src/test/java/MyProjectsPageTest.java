import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyProjectsPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        WebElement imageel = driver.findElement(By.cssSelector("div.my-projects-home-page>div:first-of-type>img:first-child"));
        imageel.click();
        WebElement headingel = driver.findElement(By.cssSelector("div.advanced-technologies-card>h1:first-child"));
        System.out.println(headingel.getText());
        WebElement descriptionel = driver.findElement(By.cssSelector("div.advanced-technologies-card>p:nth-child(2)"));
        System.out.println(descriptionel.getText());
        WebElement buttonel = driver.findElement(By.cssSelector("div.advanced-technologies-card>button:last-of-type"));
        buttonel.click();
        //second image project detailes
        WebElement imageel2 = driver.findElement(By.cssSelector("div.my-projects-home-page>div:first-of-type :last-child"));
        imageel2.click();
        List<WebElement> diwaliItems = driver.findElements(By.cssSelector("div.diwali-card-item"));
        for(WebElement list:diwaliItems){
            String namesEl = list.findElement(By.cssSelector("h1:nth-child(2)")).getText();
            String priceEl = list.findElement(By.cssSelector("p:nth-child(3)")).getText();
            System.out.println("The price of" + namesEl + "is" + priceEl);
        }
        WebElement butttonel2 = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:last-child>button"));
        butttonel2.click();
        // third image project detailes
        WebElement imageel3 = driver.findElement(By.cssSelector("div.my-projects-home-page>div:last-of-type>img:first-child"));
        imageel3.click();
        WebElement descriptionel2 = driver.findElement(By.cssSelector("div.order-card > h1 + p"));
        System.out.println(descriptionel2.getText());
        WebElement headingel2 = driver.findElement(By.cssSelector("div.order-card :nth-child(1)"));
        System.out.println(headingel2.getText());
        WebElement descriptionel3 = driver.findElement(By.cssSelector("div.order-card p:nth-of-type(1)"));
        System.out.println(descriptionel3.getText());
        WebElement buttonel3 = driver.findElement(By.cssSelector("div.order-card button:last-of-type"));
        buttonel3.click();
        //fourth image project detailes
        WebElement imageel4 = driver.findElement(By.cssSelector("div.my-projects-home-page>div:last-of-type :last-child"));
        imageel4.click();
        WebElement catogeryel = driver.findElement(By.cssSelector("div.news-card>p:first-child"));
        System.out.println(catogeryel.getText());
        WebElement descriptionel4 = driver.findElement(By.cssSelector("div.news-card>p:nth-of-type(2)"));
        System.out.println(descriptionel4.getText());
        WebElement button4 = driver.findElement(By.cssSelector("div.news-card button:last-of-type"));
        button4.click();
        driver.quit();









    }
}
