package assignment.week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-nodification-");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement hoverofMenFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverofMenFashion).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Total Sports Shoes:"+text);
		
		WebElement ele = driver.findElement(By.xpath("//h1[@class='category-name']"));
		String text2 = ele.getText();
		System.out.println("Title: "+text2);
		
		
		
	}

}
