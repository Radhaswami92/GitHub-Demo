import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class Selenium2 extends Selenium1 {
	
	
	@Test
	public static void main() throws InterruptedException 
	{
		String[] s= {"Selenium","Java","Mavaen"};
		 for(String i: s) {
				driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys(i);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
				 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//driver.get("https://www.google.com/");
				 Selenium1 obj=new Selenium1();
				 obj.openbrowser();
						
				
		 }
		 
	}
	@Test
	public void SecondThirdndTest() {
		
		System.out.println("I am still the person A");
		
	}
	
	
	
}

	
	

