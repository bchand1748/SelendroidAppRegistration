package github;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SelendroidRegistration {

	public static AndroidDriver driver;
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
         
		File app = new File("C:\\Users\\bkbc011\\Desktop\\apk\\selendroid-test-app-0.13.0.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("automationName","appium");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	     driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	     driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
	 	
	   WebElement username= driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
	   username.sendKeys("test");
		driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("testuser");
		driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("testpassword");
		driver.findElement(By.id("io.selendroid.testapp:id/inputName")).clear();
		
		driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys("This is a Test");
		
		/*Thread.sleep(3000);
		driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")));
	       driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
		*/
	
	}
	
	}


