package tests;


import org.testng.annotations.Test;


import pages.PageElement;

public class HomePageTests extends TestBase{
	public HomePageTests() {
		// TODO Auto-generated constructor stub
	}
	
@Test
public void bookSeat() 
{
	String number="6789125987";
	String email="alielsheikh421@gmail.com";

	String homeCity="CHIKKAMAGALURU";
	String leavedCity="BENGALURU";
	PageElement elementObject=new PageElement(Driver);
	elementObject.sendCitychosen(homeCity);
	elementObject.sendcityChosenchosen(leavedCity);
	elementObject.senddepartDate();
	elementObject.clickSearchBtn();
	
	elementObject.clickSelectionBtn();
	elementObject.clickBoardingPoint();
	elementObject.clickDroppingPoint();
	elementObject.clickAvailabeSeat();
	elementObject.clickPassengerDetails();
	elementObject.sendMoblilNmber(number,email);
	
	elementObject.clickProceedPassengerDateils();
	elementObject.sendNameAndAge("ali", "23");
	elementObject.clickPaxGenderAndOnwardGender();
	elementObject.clickPaxConcessionTypeAndOnwardidCardType();
	elementObject.clickRandomNumber();
	elementObject.clickProceedToCheckout();

	
	
	
}
}
