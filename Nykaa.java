package assignment.week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-nodifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement hoverofBrand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);				
		builder.moveToElement(hoverofBrand).perform();
		driver.findElement(By.xpath("(//a[text()=\"L'Oreal Paris\"])[1]")).click();
		String text = driver.findElement(By.xpath("(//h1[@class='css-mrgb7e'])[1]")).getText();
		System.out.println(text);
		
		
		
	}

}
