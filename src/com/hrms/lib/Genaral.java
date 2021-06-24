package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.utility.Log;



public class Genaral extends Global {
//Functions/methods
	public void openApp() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
	    d =new ChromeDriver();
	    d.manage().window().maximize();
		d.navigate().to(url);
	                                //printed stmt
		 System.out.println("app open");//console
		 Reporter.log("app open");//html Report
		 Log.info("open app");//logfile
	}
	 public void closeApp() {
	  d.close();
		System.out.println("app close");
		 Log.info("close app");
	}
	 public void login() {
		d.findElement(By.name(txt_un)).sendKeys(un);
		d.findElement(By.name(txt_pw)).sendKeys(pw);
		d.findElement(By.name(btn_login)).click();
		  System.out.println("login compleated");	
			 Log.info("login");
	}
	 public void addemp() {
		 Actions ac= new Actions(d);
		 ac.moveToElement(d.findElement(By.linkText("PIM"))).perform();		 
		 d.findElement(By.linkText(el)).click();
		 d.findElement(By.id(namebtnAdd)).click();
		 d.findElement(By.name(F_Name)).sendKeys("selenium");
		 d.findElement(By.name(Lname)).sendKeys("naveen");
		 d.findElement(By.id("btnSave")).click();
		 Log.info("add emp");
	 }	 
	 public void logout() throws Exception {
		d.findElement(By.id(btn_welcome)).click();
		Thread.sleep(500);
		d.findElement(By.linkText(link_logout)).click();
		System.out.println("logout compleated");
		 Log.info("logout");		
	 }
  }