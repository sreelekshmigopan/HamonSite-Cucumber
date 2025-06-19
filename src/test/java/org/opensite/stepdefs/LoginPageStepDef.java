package org.opensite.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.opensite.pages.LoginPage;
import org.testng.Assert;

public class LoginPageStepDef {

       private WebDriver driver;
       private LoginPage loginPage;

      @Before
      public void setup(){
          driver = new ChromeDriver();
      }

      @After
      public void tearDown(){
          if(driver!=null){
              driver.quit();
          }
      }

      @Given("I am on Hamon Site")
      public void i_am_on_hamon_site() {
          driver.get("https://hamon.in/");
          loginPage = new LoginPage(driver);
      }

      @Then("Verify Hamon Home Page Elements Check")
      public void verify_hamon_home_page(){
          Assert.assertTrue(loginPage.hamonTitleCheck());
          Assert.assertTrue(loginPage.menuCheck());
          Assert.assertTrue(loginPage.getInTouchBtnCheck());
      }

      @When("I click on the Case Studies")
      public void i_click_on_the_caseStudies(){
          loginPage.clickCaseStudiesMenu();
      }
      @When("I click on the Services")
      public void i_click_on_the_services(){
        loginPage.clickServicesMenu();
      }
      @When("I click on the Blog")
      public void i_click_on_the_blog(){
          loginPage.clickBlogMenu();
     }
      @When("I click on the Careers")
      public void i_click_on_the_careers(){
        loginPage.clickCareersMenu();
     }

}
