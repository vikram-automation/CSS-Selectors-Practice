import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FeaturesPageTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qafeaturesect.ccbp.tech/");
        List<WebElement> Titlesel = driver.findElements(By.cssSelector("div[class*='feature-card']>h1"));
        ArrayList<String> Titletextlist = new ArrayList<String>();
        for (WebElement list : Titlesel) {
            String option = list.getText();
            Titletextlist.add(option);
        }
        String[] expectedorder = {"Easy to connect", "VR Capability", "Video games", "Interaction", "Easy to play", "Awesome Experience"};
        int i = 0;
        for (i = 0; i < Titlesel.size(); i++) {
            if (!expectedorder[i].equals(Titletextlist.get(i))) {
                System.out.println("Mismatch found in titles");
                break;
            }
        }
        if (i == Titlesel.size()) {
            System.out.println("All titles are as expected:" + Titletextlist);
        }
        // features page description
        List<WebElement> Descriptionel = driver.findElements(By.cssSelector("div[class*='feature-card']>p"));
        ArrayList<String> DescriptionTextlist = new ArrayList<String>();
        for (WebElement list2 : Descriptionel) {
            String option2 = list2.getText();
            DescriptionTextlist.add(option2);
        }
        String[] expectedorder2 = {"Instead of viewing a screen in front of them, users are immersed and able to interact with 3D worlds.", "Virtual reality (VR) can create an environment similar to or completely different from the real world.", "Ability to recognize hand motion, evolving interactions and gameplay in VR.", "Interaction refers to the natural interaction between the user and the virtual scene.", "In 360-degree video, the locations of viewers are fixed, viewers are limited to the angles captured by the cameras.", "Virtual reality (VR) is a simulated experience that can be similar to or completely different from the real world."};
        int j = 0;
        for (j = 0; j < Descriptionel.size(); j++) {
            if (!expectedorder2[j].equals(DescriptionTextlist.get(j))) {
                System.out.println("Mismatch found in descriptions");
                break;
            }
        }
        if (j== Descriptionel.size()) {
            System.out.println("All descriptions are as expected");
        }
        //highlighted text
        WebElement spanelText = driver.findElement(By.cssSelector("img[src*='interaction']~p>span"));
        String expectedText = "natural interaction";
        if(expectedText.equals(spanelText.getText())){
            System.out.println("Highlighted text found");
        }else{
            System.out.println("Mismatch in highlighted text");
        }
    }
}

