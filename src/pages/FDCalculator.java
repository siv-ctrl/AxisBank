package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {
	WebDriver driver;
	@FindBy(css="#nvpush_cross > svg")
	private WebElement closePopUp;
	@FindBy(xpath="//label[contains(text(),'Senior Citizen')]")
	private WebElement seniorCitizen;
	@FindBy(xpath="//select[@id='FdepType']")
	private WebElement typeOfFD;
	@FindBy(xpath="//input[@id='loan_amount']")
	private WebElement loanAmt;
	@FindBy(xpath="//span[contains(text(),'Maturity Value')]")
	private WebElement maturityValue;
	@FindBy(xpath="//span[@id='matIntRate']")
	private WebElement rateOfInterest;
	public FDCalculator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String fdCalculator(Double amount) throws InterruptedException {
		Thread.sleep(2000);
		closePopUp.click();
		Thread.sleep(1000);
		seniorCitizen.click();
		typeOfFD.click();
		Thread.sleep(1000);
		Select fdType=new Select(typeOfFD);
		fdType.selectByIndex(2);
		Thread.sleep(1000);
		String amt=Double.toString(amount);
		Thread.sleep(1000);
		loanAmt.click();
		loanAmt.clear();
		Thread.sleep(2000);
		loanAmt.sendKeys(amt);
		Thread.sleep(1000);
		maturityValue.click();
		Thread.sleep(1000);
		String rateofintrst=rateOfInterest.getText();
		Thread.sleep(1000);
		return rateofintrst;	
	}
}
