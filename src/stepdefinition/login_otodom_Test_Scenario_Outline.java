package src.stepdefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class login_otodom_Test_Scenario_Outline {
    FirefoxDriver driver = new FirefoxDriver();

   @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.otodom.pl");
    }

    @When("^User Navigate to LogIn P.$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='my_account']/span[1]")).click();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")

        public void user_enters_UserName_and_Password (String username, String password) throws Throwable {
            driver.findElement(By.xpath(".//*[@id='login']")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.xpath(".//*[@id='loginForm']/div[4]/div/button")).click();
        }

        /*driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("tester1@onet.com.pl");
        driver.findElement(By.id("password")).sendKeys("Qwerty1");
        driver.findElement(By.xpath(".//*[@id='loginForm']/div[4]/div/button")).click(); */

    @Then("^Message displayed Login Success")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='user_items']/a")).click();
        driver.findElement(By.xpath(".//*[@id='logout']")).click();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() throws Throwable {
        System.out.println("Logout succesfully");
        driver.close();

    }
}

