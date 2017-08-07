package src.stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_AutomationPractice {

    WebDriver driver = new FirefoxDriver();
    @Given("^User in on Home Page$")
    public void user_in_on_Home_Page() throws Throwable {

        driver.get("http://automationpractice.com/index.php");
    }

    @When("^user goes to login page$")
    public void user_goes_to_login_page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
    }

    @When("^user enters credentials$")
    public void user_enters_credentials() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("tester1@onet.com.pl");
        driver.findElement(By.id("passwd")).sendKeys("Qwerty1");
    }

    @Then("^user will be logged in to app$")
    public void user_will_be_logged_in_to_app() throws Throwable {
        driver.findElement(By.id("SubmitLogin")).click();
    }
}
