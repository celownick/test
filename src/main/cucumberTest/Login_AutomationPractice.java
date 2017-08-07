package src.main.cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_AutomationPractice {
        public static void main(String[] args) {
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
            driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("krzysiekcabaj@gmail.com");
            driver.findElement(By.id("passwd")).sendKeys("Qwerty1");
            driver.findElement(By.id("SubmitLogin")).click();
            driver.close();
        }
    }
