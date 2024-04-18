package Qspiderdemoapps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamictable {
	
	@Test
	public void dynamictable() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/table/tablePagination");
		Thread.sleep(3);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>pages=driver.findElements(By.xpath("//ul[@class='flex space-x-2']/li"));
		
		for(WebElement page:pages)
		{
			page.click();
			System.out.println("list of product details in page "+page.getText());
			List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
			for(WebElement row:rows)
		    {
			    List<WebElement>cells=row.findElements(By.tagName("td"));
			    for(WebElement cell:cells)
			    { 
				    System.out.print(cell.getText()+"\t");
			    }
			    System.out.println();
		    }
	    }

   }
	
	@Test
	public void withoutimgtag()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/image/withoutTag?sublist=4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//div[@class='withoutTag h-80 w-[50%]']"));
		Rectangle imgrect=ele.getRect();
		System.out.println(imgrect.getHeight());
		System.out.println(imgrect.getWidth());
		System.out.println(imgrect.getX());
		System.out.println(imgrect.getY());
		
	}
	
	
	
	
}