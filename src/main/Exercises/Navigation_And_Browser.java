package src.main.Exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_And_Browser {
    public static void main(String[] args) {
        String url = "https://www.otodom.pl/";
        String path_oferty_developerow = "inwestycje/home/";


        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.get(url + path_oferty_developerow);


    }
}
