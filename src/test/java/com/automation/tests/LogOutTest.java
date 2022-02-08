package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest{
    @Test
    public void clickOnBurgerMenu(){
        WebElement userNameEle = driver.findElement(By.id("user-name"));
        WebElement passwordEle = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        userNameEle.sendKeys("standard_user");
        passwordEle.sendKeys("secret_sauce");
        loginBtn.click();
        WebElement homepageLogo = driver.findElement(By.className("app_logo"));
        WebElement homePageTitle = driver.findElement(By.cssSelector(".title"));
        Assert.assertTrue(homepageLogo.isDisplayed(),"logo is missing from homePage");
        Assert.assertTrue(homePageTitle.isDisplayed(),"Title is missing from homePage");
        WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenu.click();
        WebElement logOutButn = driver.findElement(By.id("logout_sidebar_link"));
        logOutButn.click();
        WebElement loginBtn2 = driver.findElement(By.id("login-button"));
        Assert.assertTrue(loginBtn2.isDisplayed(),"login button is visible on home page");
    }

}
