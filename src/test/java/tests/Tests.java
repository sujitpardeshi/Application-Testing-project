package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tests extends Baseclass{
	@Test
	public void testone(){
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("Automation");
	driver.findElement(By.name("q")).sendKeys("Keys.Enter");
	System.out.println("Complete Test One...");
	}

}
