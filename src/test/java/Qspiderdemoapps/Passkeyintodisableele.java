package Qspiderdemoapps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Passkeyintodisableele {
	
	@Test
	public void keyintodisableele() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Dimension dim=new Dimension(1200,700);
		driver.manage().window().setSize(dim);
		driver.get("https://demoapps.qspiders.com/ui?scenario=3");
		Thread.sleep(2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value='qwertasdfgg';", ele);
		Thread.sleep(2);
		WebElement ele2=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='email';", ele2);
		Thread.sleep(2);
		WebElement ele3=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].value='pasword';", ele3);
		Thread.sleep(2);
		System.out.println(ele.getAttribute("value"));
	}	
		//to open a link in new tab
		@Test
		public void openlinkinnewtab() throws InterruptedException
		{
			WebDriver driver1=new ChromeDriver();
			Dimension d=new Dimension(1000,600);
			driver1.manage().window().maximize();
			driver1.get("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1");
			Thread.sleep(3);
			driver1.findElement(By.xpath("//img[@src='/assets/light-vhD827oU.jpg']")).click();
			JavascriptExecutor js=(JavascriptExecutor)driver1;
			WebElement link=driver1.findElement(By.xpath("//a[@href='/ui/link/linkNew/policy']"));
			js.executeScript("arguments[0].scrollIntoView();", link);
			//Actions act=new Actions(driver1);
			link.sendKeys(Keys.CONTROL,Keys.RETURN);
			Thread.sleep(3);
			//link.click();
			Thread.sleep(3);
		}

	

}
