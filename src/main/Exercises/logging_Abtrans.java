package src.main.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logging_Abtrans {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        String url_address_test = "http://absolutetranslations-tst.pgs-soft.com/auth/login";
        String path_global_search = "/globalSearch";
        driver.get(url_address_test);
        WebElement login = driver.findElement(By.id("LoginForm_email"));
        login.sendKeys("admin@admin.com");
        login.click();
        WebElement password = driver.findElement(By.id("LoginForm_password"));
        password.sendKeys("admin");
        password.submit();

        //* sendKeys(password,"admin").click();


        //driver.navigate().to(url_address_test + path_global_search);
    }


    /*static WebElement sendKeys(WebElement webElement, String key){
        webElement.sendKeys("admin");

        return webElement; */
    }

