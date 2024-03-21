package Page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class Rishiherbalpage
	{
			
		WebDriver driver;
		
		By health=By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");
		By rishiinstock=By.xpath("//*[@id=\"filterForm\"]/div[2]/div[2]/div[2]/ul/li/label");
		By rishiproduct=By.xpath("//*[@id='filterForm']/div[3]/div[2]/div[2]/ul/li/label");
		By rishidrop=By.xpath("//*[@id='input-sort']");
		By rishiaz=By.xpath("//*[@id='input-sort']/option[2]");
		By rishiprod=By.xpath("//*[@id='content']/div[3]/div[1]/div/div/div[1]/div/a/img");
		By rishiwishlist=By.xpath("//*[@id='prod_cont']/div/div[4]/button[1]/span");
		public Rishiherbalpage(WebDriver driver)
		{
		this.driver=driver;
		}
		public void herbal()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div[2]/div[2]/div[2]/ul/li/label")).click();
			driver.findElement(By.xpath("//*[@id='filterForm']/div[3]/div[2]/div[2]/ul/li/label")).click();
			driver.findElement(By.xpath("//*[@id='input-sort']")).click();
			driver.findElement(By.xpath("//*[@id='input-sort']/option[2]")).click();
			driver.findElement(By.xpath("//*[@id='content']/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
			driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
			
		}

}
