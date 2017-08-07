package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    private static WebElement element = null;

    public static WebElement email (WebDriver driver){
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static WebElement password (WebDriver driver){
        element  = driver.findElement(By.id("passwd"));
        return element;
    }

    public static WebElement sign_in (WebDriver driver){
        element = driver.findElement(By.id("SubmitLogin"));
        return element;
    }

}

