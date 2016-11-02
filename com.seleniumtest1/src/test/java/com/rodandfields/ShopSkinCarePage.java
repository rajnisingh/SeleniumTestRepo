package com.rodandfields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ShopSkinCarePage {
	WebDriver driver;
	public static final By SHOP_SKINCARE=By.xpath("html/body/main/header/div[1]/nav/div/div[1]/ul[2]/li[1]/a");
	public static final By ALL_PRODUCTS=By.xpath("html/body/main/header/div[1]/nav/div/div[1]/ul[2]/li[1]/ul/li[7]/div/a");
	public static final By PRICE=By.xpath("//input[@tabindex='2']");
	 public void selectPrice(String price) 
	 {
	  
	  Select select=new Select(driver.findElement(PRICE));
	  select.selectByIndex(1); 
	 }

}
