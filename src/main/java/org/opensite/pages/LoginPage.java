package org.opensite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

     private WebDriver driver;

     //By Locators
    private By hamonTitle =By.className("hamon-logo");
    private By homeIcon =By.id("menu-item-139");
    private By getInTouchBTn =By.className("wp-block-button");
    private By caseStusiesIcon =By.id("menu-item-10");
    private By servicesIcon =By.id("menu-item-50");
    private By blogIcon =By.id("menu-item-145");
    private By careersIcon =By.id("menu-item-51");

   // Constructor
    public LoginPage(WebDriver driver) {
         this.driver = driver;
    }

    // Methods
     public boolean hamonTitleCheck(){
         return driver.findElement(hamonTitle).isDisplayed();
     }
    public boolean menuCheck(){
         driver.findElement(homeIcon).isDisplayed();
         driver.findElement(caseStusiesIcon).isDisplayed();
         driver.findElement(servicesIcon).isDisplayed();
        driver.findElement(blogIcon).isDisplayed();
        driver.findElement(careersIcon).isDisplayed();
        return true;
    }
    public boolean getInTouchBtnCheck(){
        return driver.findElement(getInTouchBTn).isDisplayed();
    }
    public  void clickCaseStudiesMenu(){
        WebElement caseStudiesBtn = driver.findElement(caseStusiesIcon);
         caseStudiesBtn.click();
    }
    public  void clickServicesMenu(){
        WebElement caseStudiesBtn = driver.findElement(servicesIcon);
        caseStudiesBtn.click();
    }
    public  void clickBlogMenu(){
        WebElement caseStudiesBtn = driver.findElement(blogIcon);
        caseStudiesBtn.click();
    }
    public  void clickCareersMenu(){
        WebElement caseStudiesBtn = driver.findElement(careersIcon);
        caseStudiesBtn.click();
    }

}
