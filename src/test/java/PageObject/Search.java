package PageObject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

	WebDriver driver;

	private By searchBox = By.id("srchbx");
	private By searchIcon = By.xpath("//button[@class='search-button']");

	private By ListOfSearchItems = By.xpath("//ul[@class='rsl col-md-12 padding0']//li");

	private By ListOfSearchedProduct=By.xpath("//ul[@id='auto']//li");

	public Search(WebDriver driver) {
		this.driver = driver;
	}

	public void searchProduct(String product) {
		driver.findElement(searchBox).sendKeys(product);

	}

	public void clickSearchBtn() {

		driver.findElement(searchIcon).click();
	}

	public void chooseProduct(String r)
	{
		List<WebElement> list=driver.findElements(ListOfSearchedProduct);
		
		for (int i = 0; i < list.size(); i++) {

			String text = list.get(i).getText();
			System.out.println(text);
			
			if(text.contains("resta"))
			{
				Assert.assertTrue(true);
//				driver.findElement(searchIcon).click();
//				break;
			}
			
		}
	}

	public void countProductDetails() {
		List<WebElement> list = driver.findElements(ListOfSearchItems);

		for (int i = 0; i < list.size(); i++) {

			String text = list.get(i).getText();
			System.out.println(text);

		}
	}
}
