package testJavaTrainingPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stringcount {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nihal\\Desktop\\Ammie\\Ammie Data Study\\Shammi Automation\\Software\\Chromedriver Version 134\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/iPhone-16-Pro-Max-256/dp/B0DGHYDZR9/ref=mp_s_a_1_1_sspa?crid=3MRW0PPZ9VXG5&dib=eyJ2IjoiMSJ9._2x8IUpCs9yuvr42V7LJnlVMaIJg7lT5DDgtSgUNEBe6GFGdGRByZm0QTQvN0taBPId3aVy-A6mVo5QQVE9aIO3BEBKtu4CFaSlZb3M7hloFhljT6-JSP8esclE0Y2pmDdll-42uR09M0k8q86r1OO0UT_M3bAy8_lxUjpKUSu2VlQumNrYDxpzvbZQ7irYOstmGnCZ0YmfzdmHom3MQsg.bGy9HJUEGndPRHZ_qzKkxNnDqK1MEbcECu-7GthoKhU&dib_tag=se&keywords=iphone+16pro+max&nsdOptOutParam=true&qid=1742458568&sprefix=iphone%2Caps%2C206&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9waG9uZV9zZWFyY2hfYXRm&psc=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//*[@id=\"nav-orders\"]")).click();
		
		driver.close();

	}

}

/*
WebElement dropdownelement = Driver.findElement(By.xpath(null))
Select dropdown = new Select()

*/