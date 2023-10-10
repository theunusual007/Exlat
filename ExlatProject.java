package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExlatProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		WebElement usernameField = driver.findElement(By.id("login1")); 
		
        WebElement passwordField = driver.findElement(By.id("password"));
        
        WebElement loginButton = driver.findElement(By.id("signinbtn"));
        
        usernameField.sendKeys("shubhamrakhonde161@gmail.com");
        
        passwordField.sendKeys("Vaishu_@007");
        
        loginButton.click();
        
        WebElement logoutButton = driver.findElement(By.id("rd_logout")); 
        
        logoutButton.click();
        
        driver.quit();
		

	}

}
