package taskgroup.taskart; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class testNG {
		WebDriver drive ;


	@BeforeTest
	public void openURL ()
	{
		
    
		System.setProperty("webdriver.chrome.driver",".//resouces//chromedriver.exe");
		 drive = new ChromeDriver();
		drive.navigate().to("https://opensource-demo.orangehrmlive.com");
	//System.out.print(true);
	}
	@Test 
	public void login () {
		WebElement username = drive.findElement(By.id("txtUsername"));	
		WebElement password = drive.findElement(By.id("txtPassword"));
		WebElement submit = drive.findElement(By.id("btnLogin"));  
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	    submit.click();
	//	System.out.print(true);

		WebElement management = drive.findElement(By.id("menu_admin_viewAdminModule"));
		management.click();
	}
	@Test
	public void addUser()   {
		 
		WebElement adduser = drive.findElement(By.name("btnAdd"));
		adduser.click();
		Select drop = new Select(drive.findElement(By.id("systemUser_userType")));
		drop.selectByVisibleText("Admin");
		WebElement employeename = drive.findElement(By.id("systemUser_employeeName_empName"));	
		employeename.sendKeys("David Morris");
		WebElement userEmployeename = drive.findElement(By.id("systemUser_userName"));	
		userEmployeename.sendKeys("alyy Rayan");
		Select drop2 = new Select(drive.findElement(By.id("systemUser_status")));
		drop2.selectByValue("0");
		WebElement systemUser_password =drive.findElement(By.id("systemUser_password"));
		systemUser_password.sendKeys("name1name1jM");
		WebElement systemUser_confirmPassword =drive.findElement(By.id("systemUser_confirmPassword"));
		systemUser_confirmPassword.sendKeys("name1name1jM");

		WebElement Save = drive.findElement(By.id("btnSave"));
		Save.click(); 
		//drive.findElement(By.id("btnSave")).click();
		//Thread.sleep(10000);

	}
	@Test
	public void search() {
		

		WebElement search = drive.findElement(By.id("searchSystemUser_userName"));	
		search.sendKeys("aly Rayan");
		WebElement searchButton = drive.findElement(By.id("searchBtn"));  
		searchButton.click();
		WebElement user = drive.findElement(By.linkText("aly Rayan"));  
		user.click();
		} 
	@AfterTest 
	public void close() {
		drive.close();
		//System.out.print(true);

	}
	

}
