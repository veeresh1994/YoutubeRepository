package Qspiderdemoapps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shadowrootelements {
	@Test
	public void shadowelement() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Thread.sleep(4);
	    //WebElement host=(WebElement)driver.findElement(By.xpath("//div[@class='my-3'][1]"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement username=(WebElement)js.executeScript("return document.querySelector('#my-3')"+".shadowRoot.querySelector('input[type=text]')");
	    WebElement password=(WebElement)js.executeScript("return document.querySelector('#my-3')"+".shadowRoot.querySelector('input[type=text]')");
	    String js1="arguments[0].setAttribute('value','username')";
	    js.executeScript(js1, username);
	    String js2="arguments[0].setAttribute('value','password')";
	    js.executeScript(js2, password);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2);
	}
	@Test
	public void shadowdom() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	    Thread.sleep(5);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement host=driver.findElement(By.xpath("//div[@class='my-3'][1]"));
	    SearchContext shadoroot=(SearchContext)host.getShadowRoot();
	    shadoroot.findElement(By.cssSelector("input[type='text']")).sendKeys("username");
	}
	
	@Test
	public void shadow() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	    Thread.sleep(5);
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    WebElement username=(WebElement)jse.executeScript("return document.selectquery('.my-3').shadowRoot.selectquery('input')");
		username.sendKeys("username");
	}
	
	
}
