package youtube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Youtubesearchsong {
	
	@Test
	public void searchsong() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3);
		driver.get("https://www.youtube.com");
		Thread.sleep(3);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//input[@id='search']"));//.sendKeys("kannada");
		ele.sendKeys("k");
		ele.sendKeys("a");
		ele.sendKeys("n");
		ele.sendKeys("n");
		ele.sendKeys("a");
		ele.sendKeys("d");
		ele.sendKeys("a");
		Thread.sleep(4);
		driver.findElement(By.xpath("//ul[@class='sbsb_b']/li[3]")).click();
	}

}
