package amazonselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\new chrom\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		WebDriver driver=new ChromeDriver();
       
       
       driver.get("https://www.google.com/");
       Thread.sleep(3000);
       
       WebElement jj=driver.findElement(By.name("q"));
       jj.sendKeys("jj");
       
    WebElement search =driver.findElement(By.xpath("//div[@class=\"aajZCb\"]//input[@role=\"button\"]"));
      Thread.sleep(3000);
      search.sendKeys(Keys.ENTER);
      
//
//       
//    List<WebElement> gg=  driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
//    Thread.sleep(3000);
//
//    int w=gg.size();
//    System.out.println(w);
//    
    
    
//   for(WebElement b:gg) {
//	 String h=  b.getText();
//	 System.out.println(h);
//   }
//	  
	
	}
       
       
       
	

}
