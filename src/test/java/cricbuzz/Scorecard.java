package cricbuzz;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Scorecard {
	
	@Test
	public void scorecard() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.cricbuzz.com");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Live Scores']")).click();
		Thread.sleep(3000);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		/*WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Live Score']")));
		ele.click();*/
		driver.findElement(By.xpath("//a[@href='/live-cricket-scores/89689/csk-vs-gt-7th-match-indian-premier-league-2024' and contains(text(),'Live Score')]")).click();
		/*WebElement ele=driver.findElement(By.xpath("//a[@href='/live-cricket-scorecard/89689/csk-vs-gt-7th-match-indian-premier-league-2024']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;",ele);
		ele.click();*/
		driver.findElement(By.xpath("//a[@href='/live-cricket-scorecard/89689/csk-vs-gt-7th-match-indian-premier-league-2024']")).click();
		Thread.sleep(3000);
		List<WebElement> batterrow=driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		for(WebElement e:batterrow)
		{
			String batsman=e.findElement(By.xpath("//div[@class='cb-col cb-col-25 ']")).getText();
			String runs=e.findElement(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']")).getText();
			System.out.println(batsman+"--------->"+runs);
			Thread.sleep(2);
		}
		
	}

	private WebDriverWait WebDriverWait(WebDriver driver, Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

}
