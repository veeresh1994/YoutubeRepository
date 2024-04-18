package flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dropdownhandle {
	
	@Test
	public void flipkart()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele);
		List<WebElement>list= driver.findElements(By.xpath("//div[@class='_16rZTH']/object/a"));
		for(WebElement ele1:list)
		{
			String text=ele1.getText();
			System.out.println("The options of link "+text+"are : ---->");
			act.moveToElement(ele1);
			List<WebElement>ilist=driver.findElements(By.xpath("//div[@class='_31z7R_']/object/a"));
			for(WebElement e:ilist)
			{
				System.out.println(e.getText());
			}
		}
	}

}
//div[@class='_16rZTH']/object/a