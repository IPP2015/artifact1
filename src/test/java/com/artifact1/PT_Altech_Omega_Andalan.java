package com.artifact1;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.qameta.allure.Step;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class PT_Altech_Omega_Andalan {
	@Test
    @Description("Description of the test")
    @Severity(SeverityLevel.CRITICAL)
  public void test() {
	ChromeOptions options = new ChromeOptions();
  	options.addArguments("--disable-application-cache");
  	options.addArguments("start-maximized");
    WebDriver dr = new ChromeDriver();
    dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    dr.manage().window().maximize();
    Actions a = new Actions(dr);


          dr.get("https://www.saucedemo.com/");
          System.out.println("Navigate to Google");

          String windowTitle = dr.getTitle();
          System.out.println("Title: " + windowTitle + " 1");
          
          dr.findElement(By.name("user-name")).sendKeys("standard_user");
          System.out.println("Username");
          
          dr.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
          System.out.println("Password");
          
          logStep("Input Username");
          dr.findElement(By.name("login-button")).click();
          System.out.println("Login");
          
          String windowTitle1 = dr.getTitle(); 
          System.out.println("Title: " + windowTitle1 + " 2");
          
          String name=dr.findElement(By.xpath("(//*[@class=\"inventory_item_name \"])[1]")).getText();
          dr.findElement(By.xpath("(//*[@class=\"inventory_item_name \"])[1]")).click();
          System.out.println("Select Product");
          System.out.println(name);
          
          logStep("Add to Cart");
          dr.findElement(By.name("add-to-cart")).click();
          System.out.println("Add to Cart");
          
          dr.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
          System.out.println("Shopping Cart");
          
          dr.findElement(By.xpath("//*[@class='inventory_item_name']")).equals(name);
          dr.findElement(By.name("checkout")).click();
          System.out.println("Checkout");
          
          dr.findElement(By.name("firstName")).sendKeys("Ilham");
          System.out.println("first Name");
          
          dr.findElement(By.name("lastName")).sendKeys("Pandu");
          System.out.println("last Name");
          
          dr.findElement(By.name("postalCode")).sendKeys("12870");
          System.out.println("postal Code");
          
          dr.findElement(By.name("postalCode")).sendKeys("12870");
          System.out.println("postal Code");
          
//          dr.findElement(By.xpath("//*[@class='title']")).click();
//          a.sendKeys(Keys.SPACE);

          JavascriptExecutor js = (JavascriptExecutor) dr;
          js.executeScript("window.scrollBy(0,850)", "");
          System.out.println("Page Down");
          
          dr.findElement(By.name("continue")).click();
          System.out.println("Continue");
          
          dr.findElement(By.name("finish")).click();
          System.out.println("Finish");
          
          String satu =dr.findElement(By.xpath("//*[@class='complete-header']")).getText();
          String dua =dr.findElement(By.xpath("//*[@class='complete-text']")).getText();
          System.out.println(satu);
          System.out.println(dua);
          dr.findElement(By.name("back-to-products")).click();




	}

	
	@Step("{step}")
    public static void logStep(String step) {
        System.out.println(step);
    }
}
