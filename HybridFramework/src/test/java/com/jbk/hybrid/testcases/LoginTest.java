package com.jbk.hybrid.testcases;

import java.util.List;



import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbk.hybrid.utility.ExcelUtility;
import com.jbk.hybrid.utility.PropertiesUtility;


public class LoginTest extends TestBase{
	PropertiesUtility proputils=null;
	@BeforeSuite
	public void loadUrl() {
	proputils=new PropertiesUtility();
		log.info("starting before suite");
		log.info("calling initialization method from super class");
		initialization();
	}
	@Test
	public void loginUsingProperties() {
		log.info("enetring username");
		driver.findElement(By.id("email")).sendKeys(proputils.readAnyProperty("uname"));
		log.info("entering password");
		driver.findElement(By.id("password")).sendKeys(proputils.readAnyProperty("password"));
		log.info("clicking a login button");
		driver.findElement(By.xpath("//button")).click();
	}
	/*@Test
	public void loginUsingExcel() throws Exception {
		log.info("enetring username");
		
		String uname= ExcelUtility.getData("TestData.xls", "Login", 0, 0);
		
		String password=ExcelUtility.getData("TestData.xls", "Login", 0, 1);
		
		driver.findElement(By.id("email")).sendKeys(uname);
		log.info("entering password");
		driver.findElement(By.id("password")).sendKeys(password);
		log.info("clicking a login button");
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	*/
	
	

}
