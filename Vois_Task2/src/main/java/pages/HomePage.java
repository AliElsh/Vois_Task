package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	PageBase homeObject;
	public HomePage(WebDriver Driver) {
		
		super(Driver);
		//PageBase homeObject= new PageBase(Driver);
		
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement searchElment;
	
	@FindBy(id="nav-search-submit-text")
	WebElement searchButton;
	
	public void searchForIteam(String iteamName)
	{
		
		SendTextToElemebt(searchElment, iteamName);
	}
	
	
	public void searchButtonClick()
	{
		
		ClickButton(searchButton);
	}
	

}
