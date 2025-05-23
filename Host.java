package ArousrGirls;

import java.io.ObjectInputStream.GetField;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Host {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
				driver.get("https://testchat.arousr.com/");
				WebElement wb=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/form/div[1]/input"));
						wb.sendKeys("Aprilho");
						WebElement B=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/form/div[2]/input"));
						B.sendKeys("hostpass2");
						WebElement Wc=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/form/div[3]/button"));
						Wc.click();
					Thread.sleep(2000);
						WebElement Wd=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/button"));
						Wd.click();
					
	}

}
