package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver driver;
	
	public static void ChromerBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	public static String LaunchUrl(String Url) {
		driver.get(Url);
		return Url;
	}
		
	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static String fillText(WebElement searchbox, String value) {
		searchbox.sendKeys(value);
		return value;
	}
	public static void btnClick(WebElement search) {
		search.click();
	}
	
}
