package src.main.Exercises;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTrainingSelectors {
    public static void main (String[] args) {
        WebDriver driver = new FirefoxDriver();
        /*driver.get("https://www.google.com");
        WebElement element_google = driver.findElement(By.id("lst-ib"));
        element_google.sendKeys("Hello World");
       /element_google.submit();*/
        driver.get("https://www.facebook.com");
        WebElement elementFB = driver.findElement(By.xpath(".//*[@id='social-media']/ul/li[3]/a"));
        elementFB.sendKeys("1234");
        System.out.println("Page title is: " + driver.getTitle());
    }
}
