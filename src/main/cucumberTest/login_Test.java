package src.main.cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_Test {

    public static void main(String[] args){

        FirefoxDriver driver = new FirefoxDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Website
        driver.get("https://www.otodom.pl");


        //Find element to start login
        driver.findElement(By.xpath(".//*[@id='my_account']/span[1]")).click();


        // Find the element that's xpath attribute is "login"(Email)
        driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("tester1@onet.com.pl");

        // Find the element that's ID attribute is 'password' (hasło)
        // Enter Password on the element found by the above desc.

        driver.findElement(By.id("password")).sendKeys("Qwerty1");

        // Now submit the form. WebDriver will find the form for us from the element

        driver.findElement(By.xpath(".//*[@id='loginForm']/div[4]/div/button")).click();

        // Print a Log In message to the screen

        System.out.println("Login Successfully");

        // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement(By.xpath(".//*[@id='user_items']/a")).click();
        driver.findElement(By.xpath(".//*[@id='logout']")).click();

        System.out.println("Logout succesfully");

        driver.close();


    }
}
