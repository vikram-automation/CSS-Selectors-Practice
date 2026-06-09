import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OrderItemsPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaorderitems.ccbp.tech/");
        List<WebElement> orderItemsel = driver.findElements(By.cssSelector("li.ordered-item"));
        for (WebElement Item : orderItemsel) {
            String ItemText = Item.getText();
            System.out.println(ItemText);
        }
        if (orderItemsel.size() == 3) {
            System.out.println("Ordered Item count is correct");
        } else {
            System.out.println("Ordered Item count is Incorrect");
        }
       for(int i=1;i<=3;i++){
           String buttonelements = "#button" + i;
           WebElement cancelbuttonel = driver.findElement(By.cssSelector(buttonelements));
           cancelbuttonel.click();
           System.out.println(buttonelements + " cancel the button item");
       }
       WebElement emptycartel = driver.findElement(By.cssSelector("p.text-secondary"));
       String emptyCartText = emptycartel.getText();
       if(emptyCartText.equals("Cart is empty")){
           System.out.println("Empty Cart Text Displayed");
       }else{
           System.out.println("Empty Cart Text Missing");
       }
     driver.quit();

    }
}
