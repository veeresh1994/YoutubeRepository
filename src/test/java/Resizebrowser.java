import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Resizebrowser {
	
	@Test
	public void resize()
	{
		WebDriver driver=new ChromeDriver();
		Dimension dem= new Dimension(1200, 600);
		driver.manage().window().setSize(dem);
		driver.get("https://www.flipkart.com");
		driver.manage().window().minimize();
	}

}
