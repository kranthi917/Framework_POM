package test.java.com.oracle.tr.test.HomePageTest;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main.java.com.oracle.tr.pageActions.TirerackHomePage;
import main.java.com.oracle.tr.pageActions.AutomationPracticeLoginPage;
import test.java.com.oracle.tr.test.HomePageTest.TirerackVerifyNavigationMenu;
import main.java.com.oracle.tr.testBase.TestBase;

public class Dummy extends TestBase{
//http://bhanupratapcorejavaprogramming.blogspot.in/
	public static Logger log = Logger.getLogger(TirerackVerifyNavigationMenu.class.getName());

	@BeforeClass
	public void setUp() throws IOException{
      //init();

      
	}
	
	@Test
	public void testLoginToautomationpractice(){

	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}

}
