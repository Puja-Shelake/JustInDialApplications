package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	private By login=By.id("h_login");
	private By Uname=By.id("lgn_name");
	private By phnNo=By.id("lgn_mob");
	private By submit=By.id("lgn_smtn");
	private By textErrorMSg=By.id("iup");
	private By maxDigit=By.id("lgn_mob");
	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public void UName(String u)
	{
		driver.findElement(Uname).sendKeys(u);
	}
	
	public void phnNo(String p) {
		driver.findElement(phnNo).sendKeys(p);
		
	}
	
	public void submitMe()
	{
		driver.findElement(submit).click();
		String text=driver.findElement(textErrorMSg).getText();
		System.out.println(text);
	}
	
	public String CountDigit()
	{
		String num=driver.findElement(maxDigit).getAttribute("maxlength");
		
//		int number=Integer.parseInt(num);
		return num;
		
	}

}
