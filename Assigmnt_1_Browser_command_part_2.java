//developed as part of browser command
package selenium_assignmnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigmnt_1_Browser_command_part_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");

		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@id='menu-item-8247']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://selectorshub.com/donate/']")).click();
		//driver.findElement(By.xpath("(//*[@class='menu-link'])[9]']")).click();
		
		String title=driver.getTitle();
		System.out.println("--get title--"+ title);
		
		String pagesource=driver.getPageSource();
		System.out.println("--get pagesource--" +pagesource);
		
		driver.quit();
	}

}
