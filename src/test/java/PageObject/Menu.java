package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {

	WebDriver driver;

	private By sideMenu = By.xpath("//ul[@id='sidebarnavleft']//li");

	private By menu1 = By.xpath("//a[@id='ContextualHotkey_10']");
	private By menu2 = By.xpath("//a[@id='ContextualHotkey_15']");
	private By menu3=By.xpath("//a[@id='ContextualHotkey_45']");
	private By menu4=By.xpath("//a[@id='ContextualHotkey_54']");
	private By menu5=By.xpath("//a[@id='ContextualHotkey_65']");
	private By menu6=By.xpath("//a[@id='ContextualHotkey_66']");

	public Menu(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSideMenu(String items) {
		List<WebElement> l = driver.findElements(sideMenu);

		for (int i = 0; i < l.size(); i++) {
			String text = l.get(i).getText();

			if (items.equals("Baby Care")) {
				if (text.equals(items)) {

					try {
						driver.findElement(menu1).click();
					//	driver.navigate().back();
						break;
					} catch (Exception e) {
						sideMenu = By.xpath("//ul[@id='sidebarnavleft']//li");
					}

				}
			}

			if (items.equals("Bus")) {
				if (text.equals(items)) {
					try {
						driver.findElement(menu2).click();
						//driver.navigate().back();
						break;
					} catch (Exception e) {
						sideMenu = By.xpath("//ul[@id='sidebarnavleft']//li");
					}
				}
			}
			
			
			
			if (items.equals("Medical")) {
				if (text.equals(items)) {
					try {
						driver.findElement(menu3).click();
						//driver.navigate().back();
						break;
					} catch (Exception e) {
						sideMenu = By.xpath("//ul[@id='sidebarnavleft']//li");
					}
				}
			}
			
			
			if (items.equals("Real Estate")) {
				if (text.equals(items)) {
					try {
						driver.findElement(menu4).click();
						//driver.navigate().back();
						break;
					} catch (Exception e) {
						sideMenu = By.xpath("//ul[@id='sidebarnavleft']//li");
					}
				}
			}
			
			if (items.equals("Travel")) {
				if (text.equals(items)) {
					try {
						driver.findElement(menu5).click();
						//driver.navigate().back();
						break;
					} catch (Exception e) {
						sideMenu = By.xpath("//ul[@id='sidebarnavleft']//li");
					}
				}
			}
			
			if (items.equals("Wedding")) {
				if (text.equals(items)) {
					try {
						driver.findElement(menu6).click();
					//	driver.navigate().back();
					} catch (Exception e) {
						//sideMenu = By.xpath("//ul[@id='sidebarnavleft']//li");
					}
				}
			}
			
		}
	}
}
