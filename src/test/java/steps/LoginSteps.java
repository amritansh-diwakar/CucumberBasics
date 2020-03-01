package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps extends BaseUtil {
    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() {
        System.out.println("Login page visible");
        base.driver.navigate().to("http://executeautomation.com/demosite/Login.html");
//        base.driver.navigate().to("http://www.google.co.in/");
    }

    @When("^I enter username and password$")
    public void iEnterUsernameAndPassword(DataTable dt) {
        List <User> users = new ArrayList<User>();
        users  =  dt.asList(User.class);
        LoginPage loginPage = new LoginPage(base.driver);
        for (User user:users) {
            loginPage.enterUserDetails(user.username,user.password);
        }
    }

    @And("^Click Submit$")
    public void clickSubmit() {
        LoginPage loginPage = new LoginPage(base.driver);
        loginPage.clickLogin();
    }

    @Then("^Login is successful$")
    public void loginIsSuccessful() {
        Assert.assertEquals(base.driver.findElement(By.id("Initial")).isDisplayed(),true);
    }

    public class User{
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
