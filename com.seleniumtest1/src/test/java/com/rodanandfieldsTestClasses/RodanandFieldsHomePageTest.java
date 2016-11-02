package com.rodanandfieldsTestClasses;
import com.rodandfields.RodanandFieldsHomePage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RodanandFieldsHomePageTest extends RodanandFieldsHomePage{
	
	public RodanandFieldsHomePageTest() {
		super(driver);
		
	}
	static WebDriver driver;
	@BeforeMethod
	public void beforeTestMethod()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rodanandfields.com/ca");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public  void testHomePage()
	{
		
		RodanandFieldsHomePage homePage=new RodanandFieldsHomePage(driver);
		homePage.mousehover();
		homePage.clickOnElement(ENROLL_NOW);
		homePage.editInTextBox(CONSULTANT_NAME, "Mary");
		homePage.clickOnElement(SEARCH_BUTTON);
		Assert.assertTrue(isNavigationPage(SECOND_INDEX));
	}
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}
	
	
	

}
