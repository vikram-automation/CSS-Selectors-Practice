import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VRBlogospherePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qavrblog.ccbp.tech/");
        WebElement headingel = driver.findElement(By.cssSelector("div.row>:nth-child(2) h1:first-of-type"));
        String actuaText = headingel.getText();
        if(actuaText.equals("Amazon")){
            System.out.println("Title 1: Verified");
        }else{
            System.out.println("Title 1: Verification failed");
        }
        // advertising heading
        WebElement headingel2 = driver.findElement(By.cssSelector("div.row>:nth-child(3) h1:first-of-type"));
        String actuaText2 = headingel2.getText();
        if(actuaText2.equals("Advertising")){
            System.out.println("Title 2: Verified");
        }else{
            System.out.println("Title 2: Verification failed");
        }
        //first blog description
        WebElement descriptionel = driver.findElement(By.cssSelector("div.row>:nth-child(2) p:first-of-type"));
        String expectedText = "New Way to See the World. It is a simulated experience that can be completely different from the real world.";
        if(expectedText.equals(descriptionel.getText())){
            System.out.println("Description 1: Verified");
        }else{
            System.out.println("Description 1: Verification failed");
        }
        //second blog description
        WebElement descriptionel2 = driver.findElement(By.cssSelector("div.row>:nth-child(3) p:first-of-type"));
        String expectedText2 = "The best one for you. Come experience the wonder of Google Earth in virtual reality.";
        if(expectedText2.equals(descriptionel2.getText())){
            System.out.println("Description 2: Verified");
        }else{
            System.out.println("Description 2: Verification failed");
        }
        driver.quit();

    }
}
