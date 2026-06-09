import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamarkskills.ccbp.tech/");
        WebElement checkboxel1 = driver.findElement(By.cssSelector("input[id*='box1']"));
        checkboxel1.click();
        WebElement checkboxTextel1 = driver.findElement(By.cssSelector("label[id$='el1']"));
        System.out.println("Selected:<Skill Name> " + checkboxTextel1.getText());
        WebElement checkboxel2 = driver.findElement(By.cssSelector("input[id*='box2']"));
        checkboxel2.click();
        WebElement checkboxTextel2 = driver.findElement(By.cssSelector("label[id$='bel2']"));
        System.out.println("Selected:<Skill Name> " + checkboxTextel2.getText());
        WebElement checkboxel3 = driver.findElement(By.cssSelector("input[id*='box3']"));
        checkboxel3.click();
        WebElement checkboxTextel3 = driver.findElement(By.cssSelector("label[id$='bel3']"));
        System.out.println("Selected:<Skill Name> " + checkboxTextel3.getText());
        driver.quit();
    }
}
