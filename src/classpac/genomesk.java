package classpac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class genomesk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\biren\\eclipse-workspace\\class2\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(8000);
		
		
		driver.get("https://admin.v-site.xyz/sign-in");
		System.out.println("launch url");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("dhara.sculptsoft@gmail.com");
		System.out.println("mail");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Demo@123");
		System.out.println("password");
		Thread.sleep(2000);
		
			driver.findElement(By.xpath("//*[text()=\"Sign In\"]")).click();
			
		
	System.out.println("sine in");
	
	
	
	
	Thread.sleep(8000);
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/nav/div[1]/ul/li[1]/a/button/span[2]"));
	System.out.println("user managment");
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	
	executor. executeScript("arguments[0]. click();",findElement ); 

	driver.findElement(By.xpath("//*[text()=\"RemoteVal Appraiser\"]")).click();
	System.out.println("Appraiser");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[text()=\"Add Appraiser\"]")).click();
	System.out.println("Add Appraiser");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@name=\"firstName\"]")).sendKeys("nisha");
	System.out.println("firstName");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@name=\"lastName\"]")).sendKeys("misha");
	System.out.println("lastName");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@name=\"emailAddress\"]")).sendKeys("nisha.sculptssofft@gmail.com");
	System.out.println("emailAddress");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@placeholder=\"Cell Phone\"]")).sendKeys("8839070874");
	System.out.println("phone no");
	
	Thread.sleep(2000);
	//name="city"
	driver.findElement(By.xpath("//*[@name=\"address\"]")).sendKeys("gandhinagar");
	System.out.println("address");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys("kalol");
	System.out.println("city");
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//*[@name=\"state\" v   

	WebElement findElement1 = driver.findElement(By.xpath("//*[@name=\"state\"]"));
	Select sc=new Select(findElement1);
	sc.selectByIndex(3);
	System.out.println("country");
	
	driver.findElement(By.xpath("//*[@name=\"countryName\"]")).sendKeys("kalol");
	System.out.println("countryName");
	Thread.sleep(2000);		
			
	driver.findElement(By.xpath("//*[@name=\"zip\"]")).sendKeys("12345");
	System.out.println("ZIP");
	Thread.sleep(2000);	

	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	System.out.println("Create");
	Thread.sleep(5000);	
	
	//*[@id="kj61ns5ru"]/div[1]
	if(driver.findElements(By.xpath("//*[text()=\"Appraiser(s) Added Successfully\"]")).size()>0) {
	System.out.println("Appraiser(s) Added Successfully");
	}
	else if(driver.findElement(By.xpath("//*[text()=\"Email already in use.\"]")).isDisplayed()) {
		System.out.println("Email already in use");
		}
	} 
	}
//*[text()='User Name or Password Is Not Valid']
	