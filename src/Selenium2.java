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
				 System.out.println("1 A");
				 System.out.println("2 A");
				 System.out.println("3 A");
				 System.out.println("4 A");
				 System.out.println("1 B");
				 System.out.println("2 B");
				 System.out.println("3 B");
				 System.out.println("4 B");
						
				
		 }
		 
	}
	@Test
	public void SecondThirdndTest() {
		
		System.out.println("I am still the person A");
		
		
	}
	
	@Test
	public void BTest() {
		
		System.out.println("I am BTest");
		
		
	}
	
	
	
}

	
	

