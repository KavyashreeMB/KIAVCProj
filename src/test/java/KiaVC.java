import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystemLoopException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class KiaVC {

	//WebDriver driver;
	static AppiumDriver<MobileElement> driver;
	//AndroidDriver driver;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		try {
			OpenKIAMySales();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

	}
	
	public static void OpenKIAMySales() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy A13");
		cap.setCapability("udid", "RZ8T415GXBM");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		
		
		cap.setCapability("appPackage", "com.kia.kiauntactlauncher");
		cap.setCapability("appActivity", "com.kia.kiauntactlauncher.views.DetailsScreen");
		//cap.setCapability("appPackage", false);
		//cap.setCapability("appActivity", false);
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
				driver =new AppiumDriver<MobileElement>(url,cap);
				
				System.out.println("Application Started.....");
				
				//Open the application and Enter the Sales Consultant details
				
				MobileElement Dealercode= driver.findElement(By.id("com.kia.kiauntactlauncher:id/dealer_code_ed"));
				Dealercode.click();
				Dealercode.sendKeys("2712");
				MobileElement Dealername= driver.findElement(By.id("com.kia.kiauntactlauncher:id/dealer_name_ed"));
				Dealername.click();
				Dealername.sendKeys("Kavya");
				MobileElement Dealerregion= driver.findElement(By.id("com.kia.kiauntactlauncher:id/dealer_region_ed"));
				Dealerregion.click();
				Dealerregion.sendKeys("Bengaluru");
				MobileElement KECname= driver.findElement(By.id("com.kia.kiauntactlauncher:id/kec_name_ed"));
				KECname.click();
				KECname.sendKeys("Test");
				MobileElement KECcode= driver.findElement(By.id("com.kia.kiauntactlauncher:id/kec_code_ed"));
				KECcode.click();
				KECcode.sendKeys("Test");
				MobileElement KECmobile= driver.findElement(By.id("com.kia.kiauntactlauncher:id/kec_mobile_ed"));
				KECmobile.click();
				KECmobile.sendKeys("8073451242");
				driver.navigate().back();
				MobileElement Savebtn= driver.findElement(By.id("com.kia.kiauntactlauncher:id/btn_save"));
				Savebtn.click();
				
				//Create VC
				
				MobileElement CreateVcbtn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.Button[1]"));
				CreateVcbtn.click();
				Thread.sleep(2000);
				
				//Enter VC details
				MobileElement Customerid= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText"));
				Customerid.click();
				Customerid.sendKeys("Test");
				Thread.sleep(2000);
				
				MobileElement InquiryNumber= driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText"));
				InquiryNumber.click();
				InquiryNumber.sendKeys("12345");
				Thread.sleep(2000);
				
//				driver.findElementById("android:id/text1").click();
				
//				//click on dropdown of product 
//			       
//		        List product=driver.findElementsById("android:id/text1");
//		       
//		        System.out.println("Total number of options available in dropdown:"+product.size());
//		       
//		       
//		       
//		        for(WebElement e:product)
//		        {
//		            String val=e.getText();
//		           
//		            if(val.equalsIgnoreCase("INDIA"))
//		            {
//		                e.click();
//		                break;
		            
//		        }
//		       
//		        Thread.sleep(8000);   
//		       
//		        driver.quit();
//				
				
				
		
		
		
		
		
		
		
	}

}
