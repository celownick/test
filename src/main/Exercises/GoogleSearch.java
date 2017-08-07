package src.main.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.otodom.pl");

        WebElement login = driver.findElement(By.xpath(".//*[@id='my_account']/span[1]"));
        login.click();

        WebElement email = driver.findElement(By.xpath(".//*[@id='login']"));
        email.sendKeys("krzysiekcabaj@gmail.com");

        WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
        password.sendKeys("k***n");

        password.submit();

        System.out.println("Page title is: " + driver.getTitle());
    }
}
