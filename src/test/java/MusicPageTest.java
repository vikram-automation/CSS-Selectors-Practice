import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.List;

public class MusicPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamusicpage.ccbp.tech/");
        WebElement heading1 = driver.findElement(By.cssSelector("div.music-header-bg-container>:first-child"));
        System.out.println(heading1.getText());
        // description element finding
        WebElement descriptionel =driver.findElement(By.cssSelector("div.music-header-bg-container>p:first-of-type"));
        System.out.println(descriptionel.getText());
        // 2nd description element
        WebElement descriptionel2 = driver.findElement(By.cssSelector("div.music-header-bg-container>p:last-of-type"));
        System.out.println(descriptionel2.getText());
        // 2nd card first heading
        WebElement heading2 = driver.findElement(By.cssSelector("div.night-island-card>div>:first-child"));
        System.out.println(heading2.getText());
        // night iceland 1st description
        WebElement descriptionel3 = driver.findElement(By.cssSelector("div.night-island-card>p:first-of-type"));
        System.out.println(descriptionel3.getText());
        // night iceland 2nd description
        WebElement descriptionel4 = driver.findElement(By.cssSelector("div.night-island-card>p:last-of-type"));
        System.out.println(descriptionel4.getText());
        //button element
        WebElement buttonel = driver.findElement(By.cssSelector("div.night-island-card>:last-child"));
        buttonel.click();
        //music detailes container
        WebElement heading3 = driver.findElement(By.cssSelector("div.music-details-container>h1:first-child"));
        System.out.println(heading3.getText());
        // music container 1st description
        WebElement descriptionel5 = driver.findElement(By.cssSelector("div.music-details-container p:first-of-type"));
        System.out.println(descriptionel5.getText());
        // rest of the descriptions
        List<WebElement> restofdescriptionel = driver.findElements(By.cssSelector("div.music-details-container p:nth-of-type(n+2)"));
        for(WebElement list:restofdescriptionel){
            String descText = list.getText();
            System.out.println(descText);
        }
        driver.quit();

    }
}
