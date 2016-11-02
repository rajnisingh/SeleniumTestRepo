package com.rodandfields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class RodanandFieldsHomePage {
	WebDriver driver;
	public static final By BECOME_A_CONSULTANT= By.xpath("html/body/main/header/div[1]/nav/div/div[1]/ul[2]/li[2]/a");
	public static final By ENROLL_NOW=By.xpath("html/body/main/header/div[1]/nav/div/div[1]/ul[2]/li[2]/ul/li[2]/div/a");
	public static final By CONSULTANT_NAME=By.xpath("//input[@id='sponserparam']");
	public static final By SEARCH_BUTTON=By.xpath("//button[@id='search-sponsor-button']");
	public static final By RIGHT_ARROW=By.xpath("//a[@class='next']");
	public static final By SECOND_INDEX=By.xpath("//span[@class='btn btn-primary current']");
	public RodanandFieldsHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void mousehover(){
	 WebElement element=driver.findElement(BECOME_A_CONSULTANT);
	  Actions action = new Actions(driver);
	  action.moveToElement(element).build().perform();
		
	}
	public void findElement(By locator)
	{
		driver.findElement(locator);
	}
	public void clickOnElement(By locator)
	{
		driver.findElement(locator).click();
	}
	public void editInTextBox(By locator,String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	public boolean isNavigationPage(By locator)
	{
		if(locator==SECOND_INDEX)
		{
		return true;
		}
		else{
		return false;
		}
	}
	

}
