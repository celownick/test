package src.stepdefinition;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import cucumber.api.DataTable;

public class login_otodom_Test_Data_Tables {
    FirefoxDriver driver = new FirefoxDriver();

    @Given("^User is on HP$")
    public void user_is_on_Home_Page() throws Throwable {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.otodom.pl");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='my_account']/span[1]")).click();
    }

        @When("^User enters Credentials and LogIn$")
        public void user_enters_Login_and_Password (DataTable usercredentials) throws Throwable {

            //Write the code to handle Data Table
            List<List<String>> data = usercredentials.raw();

            //This is to get the first data of the set (First Row + First Column)
            driver.findElement(By.xpath(".//*[@id='login']")).sendKeys(data.get(0).get(0));

            //This is to get the first data of the set (First Row + Second Column)
            driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(data.get(0).get(1));
            driver.findElement(By.xpath(".//*[@id='loginForm']/div[4]/div/button")).click();
        }

        /*driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("tester1@onet.com.pl");
        driver.findElement(By.id("password")).sendKeys("Qwerty1");
        driver.findElement(By.xpath(".//*[@id='loginForm']/div[4]/div/button")).click(); */


        @Then("^Message displayed Login Successfully$")
        public void message_displayed_Login_Successfully () throws Throwable {
            System.out.println("Login Successfully");
        }

        @When("^User LogOut from the App$")
        public void user_LogOut_from_the_App () throws Throwable {
            driver.findElement(By.xpath(".//*[@id='user_items']/a")).click();
            driver.findElement(By.xpath(".//*[@id='logout']")).click();
        }

        @Then("^Message displayed LogOut Success$")
        public void message_displayed_LogOut_Success () throws Throwable {
            System.out.println("Logout succesfully");
            driver.close();

        }
    }
