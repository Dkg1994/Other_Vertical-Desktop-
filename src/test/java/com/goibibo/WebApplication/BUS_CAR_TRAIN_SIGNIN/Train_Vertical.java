package com.goibibo.WebApplication.BUS_CAR_TRAIN_SIGNIN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Train_Vertical {
	 @Test
	  public void f() throws InterruptedException {
		  
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Program Files (x86)\\Jenkins\\workspace\\Maven Project (Desktop)\\test-output\\Train_Vertical.html");
		    
	      // create ExtentReports and attach reporter(s)
	      ExtentReports extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	      
	      
	      ExtentTest test1 = extent.createTest("Goibibo Train ", "Check Flow of Train");
	      
		  

	System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();

	        test1.log(Status.INFO, "Starting test case");
	        driver.get("https://www.goibibo.com/trains/results?src=AGC&dst=DEC&date=20190801&class=All&srcname=Agra%20Cantt.%20Railway%20Station&dstname=Delhi%20Cantt.%20Railway%20Station");
	        test1.pass("Go To Train SRP");
	        
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/section/div[1]/div[3]/a/span")).click();
			test1.pass("Click on Check Availabilty From SRP");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/section/div[2]/div[2]/div[1]/div/div[2]/button")).click();
			test1.pass("Click on Book Now Button");
		
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div/div[2]/button")).click();
			test1.pass("CLick on Proceed button");
			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Devg");
		test1.pass("Enter IRCTC userid");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div[1]/div[2]/button")).click();
		test1.pass("Click on Proceed");
		Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div[1]/select/option[2]")).click();
			test1.pass("Selct Gender");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div[2]/input")).sendKeys("Test");
			test1.pass("Enter Name");
			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/input")).sendKeys("22");
		test1.pass("Enter Age");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[7]/div[2]/div[2]/div[1]/input")).sendKeys("testnoc009@gmail.com");
		test1.pass("Enter Email id");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[7]/div[3]/div[2]/div[1]/div[2]/input")).sendKeys("9999999999");
		test1.pass("Enter Mobile no.");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[8]/div[2]/input")).click();
		test1.pass("Review & Continue");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div[2]/input")).click();
			test1.pass("PayNow Button");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div/div[2]/button")).click();
		
		test1.pass("Click on YES button from IRCTC alert popup");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]")).click();
		test1.pass("Click on Netbanking");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[6]")).click();
		test1.pass("Select Bank");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
		test1.pass("Click on Pay Button");
		Thread.sleep(6000);
		
		driver.quit();
		test1.pass("Close browser");
		 
		 test1.info("Test Completed");
		 
		// calling flush writes everything to the log file
		 extent.flush();
		
		
		
		}
		

	}

