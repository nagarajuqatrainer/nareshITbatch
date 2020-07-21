package baseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.narshProject.BrowserFactory;
import com.narshProject.configReader;

public class baseClass {
	
	public WebDriver driver;
	public configReader config1;
	public BrowserFactory browser;
	

	@BeforeSuite
	public void setUpSuite() {
		
		config1=new configReader();
		browser=new BrowserFactory();
		
	}
	
	}
	