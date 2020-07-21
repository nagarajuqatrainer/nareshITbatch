package loginPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import baseClass.baseClass;



public class loginPage extends baseClass{
	public WebDriver driver;
	
	
	//PageObjects
	@FindBy(name="user") WebElement uname;
	@FindBy(name="pass") WebElement pword;
	@FindBy(name="btnSubmit") WebElement button;
	
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void verifyLoginPage(String un,String pw) throws Exception {
		
		
		uname.sendKeys(un);
		pword.sendKeys(pw);
		
	}
	
	public void verifyButton() throws Exception {
		if(button.isEnabled()) {
			button.click();
			
		}
	}
	
	
	
	
	
	
	
	
	
}
