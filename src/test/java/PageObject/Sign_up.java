package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sign_up {

	WebDriver driver;
	
	private  By signup=By.id("h_sin_up");
	private By Name=By.id("lgn_name");
	private By phNo=By.id("lgn_mob");
	private By submitMe=By.id("lgn_smtn");
	private By EnterPin1=By.xpath("//div[@class='otp-input wrapper']//input[1]");
	private By EnterPin2=By.xpath("//div[@class='otp-input wrapper']//input[2]");
	private By EnterPin3=By.xpath("//div[@class='otp-input wrapper']//input[3]");
	private By EnterPin4=By.xpath("//div[@class='otp-input wrapper']//input[4]");
	private By EnterPin5=By.xpath("//div[@class='otp-input wrapper']//input[5]");
	private By EnterPin6=By.xpath("//div[@class='otp-input wrapper']//input[6]");
	
	private By msg=By.xpath("//div[text()='OTP is sent on number']");	
	
	private By proceed=By.id("otp_submit");
	
	
	public Sign_up(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void SignUp()
	{
		driver.findElement(signup).click();
	}
	
	public void name(String n)
	{
		driver.findElement(Name).sendKeys(n);
	}
	public void Phone_Number(String num)
	{
		driver.findElement(phNo).sendKeys(num);
	}
	public void Submit()
	{
		driver.findElement(submitMe).click();
	}
	
	public void PinNumner(String pin)
	{
		String spl[]=pin.split(" ");
		driver.findElement(EnterPin1).sendKeys(spl[0]);
		driver.findElement(EnterPin2).sendKeys(spl[1]);
		driver.findElement(EnterPin3).sendKeys(spl[2]);
		driver.findElement(EnterPin4).sendKeys(spl[3]);
		driver.findElement(EnterPin5).sendKeys(spl[4]);
		driver.findElement(EnterPin6).sendKeys(spl[5]);
	}
	
	public void SubmitPinCode()
	{
		driver.findElement(proceed).click();
	}
	
	
	public void confirmMes()
	{
		String text=driver.findElement(msg).getText();
		System.out.println(text);
	}
}
