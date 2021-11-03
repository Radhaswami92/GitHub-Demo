import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium1 {
	
	static WebDriver driver;

	@BeforeClass
	public void selenium1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromenewx\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		

	}
	
	@Test
	public void openbrowser() throws InterruptedException 
	{
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
	}
	
/*	@Test
	public void typesearchkeyword1() throws InterruptedException 
	{
		String[] s= {"Selenium","Java","Mavaen"};
		 for(String i: s) {
				driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys(i);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
				//Thread.sleep(3000);
				//driver.get("https://www.google.com/");
				 Selenium1 obj=new Selenium1();
					obj.openbrowser();
						
		 }
		
		
		
	}
		 
	*/
	
	
	
	

	/*@Test(dataProvider="dataset")
	public void typesearchkeyword(String[] s) throws InterruptedException 
	
	{
        for(String i: s) {
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys(i);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		Selenium1 obj=new Selenium1();
		obj.openbrowser();
		
        }*/
        
		
		
		
	
	/*@Test(dependsOnMethods= {"typesearchkeyword"})
	public void searchclick() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();	
		
	}
	*/
	
	@DataProvider
	public Object[] dataset() 
	{
		Object[] data=new Object[3];
		data[0]="Selenium";
		data[1]="Maven";
		data[2]="Java";
		return data;
		
	}
	

}