package src.main.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingApartament {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.otodom.pl");
        WebElement Ogloszenia = driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[1]/a"));
        Ogloszenia.click();
        WebElement forSale = driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[1]/ul/li[1]/a"));
        forSale.click();
        /*WebElement localization = driver.findElement(By.xpath(".//*[@id='mainTopSearch']/div[1]/div[1]/div/div[1]/div[1]/div[1]/span/span[1]/span")); //TUTAJ PRÓBA WYCIAGNIĘCIA ELEMENTU JAKIM JEST LISTA I ELEMENTY LISTY
        localization.click(); */
        //Select localization = new Select(driver.findElement(By.xpath("..//*[@id='mainTopSearch']/div[1]/div[1]/div/div[1]/div[1]/div[1]/span/span[1]/span")));
        //localization.selectByVisibleText("lubuskie");

    }
}

