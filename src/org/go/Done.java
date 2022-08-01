package org.go;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Done {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kragu\\eclipse-workspace\\Don\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("facebook.com");
		driver.manage().window().maximize();
		driver.close();
		
	}

}
