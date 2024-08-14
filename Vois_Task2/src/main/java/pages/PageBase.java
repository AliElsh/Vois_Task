package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase 
{

	protected WebDriver driver;
	//Create Constructor
	public  PageBase(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}

	protected static void ClickButton(WebElement Element)
	{
		Element.click();

	}
	protected static void SendTextToElemebt(WebElement Element,String Text)
	{
		Element.sendKeys(Text);

	}


}
