package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//Id= departDate
public class PageElement extends HomePage {

	public PageElement(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="fromCity_chosen")
	WebElement fromCityChosen;
	@FindBy(xpath  ="//div[@class='chosen-drop']//div[@class='chosen-search']//input")
     List<WebElement> cityChose;
	@FindBy(className = "active-result")
	List<WebElement> activeResults;
	
	@FindBy(id="toCity_chosen")
	WebElement cityChosen;
	
	@FindBy(id="departDate")
	WebElement departDate;
	@FindBy(xpath ="//td[a]")
	List<WebElement> allowedDates;
	
	
	@FindBy(className="selectbutton")
	List<WebElement> selectButton;
	
	
	@FindBy(id="submitSearch")
	WebElement submitSearch;
	
	@FindBy(className="points")
	List<WebElement> points;
	
	@FindBy(className="btnPassDetails")
	WebElement passengerDetails;
	
	@FindBy(xpath ="//input[@name='paxName[0]']")
	WebElement yourName;
	@FindBy(xpath ="//input[@name='paxAge[0]']")
	WebElement yourAge;
	
	
	@FindBy(xpath ="(//input[@name='mobileNo'])")
	WebElement mobilNumber;
	
	@FindBy(xpath ="//div[@class='navswitchbtn flex-all-c' and contains(text(), 'PROCEED TO passenger detail')]")
	WebElement proceedPassengerDateils;
	
	
	@FindBy(xpath ="(//input[@name='email'])")
	WebElement email;
	
	@FindBy(className="col-time")
	WebElement selectPoint;
	
	@FindBy(xpath ="//div[@class='seatlook' and contains(@style, 'cursor: pointer')]")
	List<WebElement> availbaleSeat;
	
	
	@FindBy(xpath ="//input[@name='paxGender[0]']")
	WebElement paxGender;
	
	@FindBy(xpath ="//div[@class='pass--inp--drop onward_gender']/div[1]")
	WebElement onwardGender;
	
	
	@FindBy(xpath ="//input[@name='paxConcessionType[0]']")
	WebElement paxConcessionType;
	
	@FindBy(xpath ="//div[@class='pass--inp--drop onward_idCardType']/div[2]")
	WebElement onwardidCardType;
	
	@FindBy(xpath ="//input[@name='paxIDCardType[0]']")
	WebElement idCardType;
	
	
	@FindBy(xpath ="//input[@name='paxIDCardNo[0]']")
	WebElement randomNumber;
	
	
	@FindBy(xpath ="//div[@class='pass--inp--drop onward_concession']/div[1]")
	WebElement concessionType;
	
	@FindBy(xpath ="//div[@class='navswitchbtn flex-all-c'and contains(text(), 'Proceed to Checkout')]")
	WebElement ProceedToCheckout;
	
	public void clickProceedToCheckout()
	{
		ClickButton(ProceedToCheckout);
		
	
	}
	
	public void clickRandomNumber()
	{
		ClickButton(randomNumber);
		SendTextToElemebt(randomNumber, "123456");
		
		
	}
	
	
	
	
	public void clickPaxConcessionTypeAndOnwardidCardType()
	{
		ClickButton(paxConcessionType);
		ClickButton(concessionType);
		ClickButton(idCardType);
		
		ClickButton(onwardidCardType);
	}
	
	
	
	
	public void clickPaxGenderAndOnwardGender()
	{
		ClickButton(paxGender);
		
		ClickButton(onwardGender);
	}
	
	public void sendCitychosen(String city)
	{
		ClickButton(fromCityChosen);
		SendTextToElemebt(cityChose.get(0), city);
		ClickButton(activeResults.get(0));
	}
	
	public void sendcityChosenchosen(String city)
	{
		ClickButton(cityChosen);
		SendTextToElemebt(cityChose.get(1), city);
		ClickButton(activeResults.get(1));
	}
	public void senddepartDate()
	{
		ClickButton(departDate);
		ClickButton(allowedDates.get(1));
		
	}
	public void clickSearchBtn()
	{
		ClickButton(submitSearch);
			
	}
	
	public void clickSelectionBtn()
	{
		ClickButton(selectButton.get(0));
	
	}
	
	public void clickBoardingPoint()
	{
		ClickButton(points.get(0));
		ClickButton(selectPoint);
	
	}
	
	public void clickDroppingPoint()
	{
		ClickButton(points.get(1));
		ClickButton(selectPoint);
	
	}
	
	public void clickSelectionPoint()
	{
		ClickButton(selectPoint);
	
	}
	public void clickAvailabeSeat()
	{
		ClickButton(availbaleSeat.get(0));
	
	}
	public void clickPassengerDetails()
	{
		ClickButton(passengerDetails);
	
	}
	
	
	
	public void sendMoblilNmber(String number,String mail)
	{
		
		ClickButton(mobilNumber);
		SendTextToElemebt(mobilNumber, number);
		ClickButton(email);
		SendTextToElemebt(email, mail);
		
	}
	public void sendNameAndAge(String name,String age)
	{
		
		ClickButton(yourName);
		SendTextToElemebt(yourName, name);
		ClickButton(yourAge);
		SendTextToElemebt(yourAge, age);
		
	}
	
	
	public void clickProceedPassengerDateils()
	{
		ClickButton(proceedPassengerDateils);
	
	}
	

}



