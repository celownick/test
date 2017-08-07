package src.main.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisteringUser {
    public static void main (String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.otodom.pl");
        WebElement moje_konto = driver.findElement(By.xpath(".//*[@id='my_account']/span[1]"));
        moje_konto.click();
        WebElement zarejestruj = driver.findElement(By.xpath("html/body/section/div/div/div[2]/div/div/a"));
        zarejestruj.click();
        WebElement rejestracja = driver.findElement(By.xpath(".//*[@id='uzytkownicy-indywidualni']/div/div[2]/div/div/div/a"));
        rejestracja.click();

        WebElement email_address = driver.findElement(By.xpath(".//*[@id='userEmail']"));
        email_address.sendKeys("tester1@onet.com.pl");
        WebElement password = driver.findElement(By.id("userPass"));
        password.sendKeys("Qwerty1");
        WebElement repeat_password = driver.findElement(By.id("userPass-repeat"));
        repeat_password.sendKeys("Qwerty1");
        WebElement statement = driver.findElement(By.xpath(".//*[@id='mainForm']/div[4]/div/div/div/label"));
        statement.click();
        WebElement register = driver.findElement(By.xpath(".//*[@id='mainForm']/div[6]/div/button"));
        register.click();

        //Actions builder = new Actions(driver);
          //  builder.tick(driver.findElement(By.xpath(".//*[@id='mainForm']/div[4]/div/div/div/label")));

    }
}