package govtech01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TechnicalTestForm {
	private WebDriver driver;

	// Define the locators
	private By firstnameField = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[1]/input");
	private By lastnameField = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[2]/input");
	private By emailField = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[3]/input");
	private By genderMaleRadio = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[4]/div[2]/label[1]/span[2]");
	private By genderFemaleRadio = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[4]/div[2]/label[2]/span[2]");
	private By mobileField = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[5]/div[2]/input");
	private By dobField = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[6]/div[2]/div/input");
	//private By calendarButton = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[6]/div[2]/div/div/button");
	//private By selectMonthDropList = By.xpath("/html/body/div[5]/div/section/div[3]/div/div/div[1]/div/div/div[1]/div[1]/select");
	//private By selectYearDropList = By.xpath("/html/body/div[5]/div/section/div[3]/div/div/div[1]/div/div/div[1]/div[2]/select");
	//private By selectDayButtton = By.xpath("\"//button[text()='" + $TODAY + "']\"");
	private By hobbySportsCheckbox = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[7]/div[2]/label[1]/span[1]");
	private By hobbyMusicCheckbox = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[7]/div[2]/label[2]/span[1]");
	private By hobbyReadingCheckbox = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[7]/div[2]/label[3]/span[1]");
	private By fileUploadBox = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[8]/div[2]/div");
	//accepts these .asc,.avi,.bmp,.cer,.class,.csv,.dat,.dgn,.doc,.docx,.dot,.dwf,.dwg,.dxf,.ent,.eps,.gif,.gz,.htm,.html,.jfif,.jpeg,.jpg,.log,.mov,.mpeg,.mpg,.mpp,.msg,.mso,.oa,.odb,.odf,.odg,.odp,.ods,.odt,.p7m,.p7s,.pcx,.pdf,.png,.pot,.pps,.ppsx,.ppt,.pptx,.psd,.pub,.rtf,.svg,.sxc,.sxd,.sxi,.sxw,.tar,.tif,.tiff,.txt,.vcf,.vsd,.wav,.wmv,.xls,.xlsx,.xml,.zip
	private By locationField = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[9]/div[2]/div/div/input");
	//private By locationDropList = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[9]/div[2]/div/div/button/svg");
	private By addressField = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[1]/div/div[10]/textarea");
	private By submitButton = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[1]/div[1]/form/div[2]/button");

	// Constructor
	public TechnicalTestForm(WebDriver driver) {
		this.driver = driver;
	}

	// Methods to interact with the elements
	public void enterFirstname(String firstname) {
		driver.findElement(firstnameField).sendKeys(firstname);
	}

	public void enterLastname(String lastname) {
		driver.findElement(lastnameField).sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male"))driver.findElement(genderMaleRadio).click();
		if(gender.equalsIgnoreCase("female"))driver.findElement(genderFemaleRadio).click();	
	}
	
	public void enterMobile(String mobile) {
		driver.findElement(mobileField).sendKeys(mobile);
	}
	
	public void enterDoB(String dob) {
		driver.findElement(dobField).click();
		driver.findElement(dobField).sendKeys(dob);
	}
	
	public void selectHobby(String Hobby) {
		if(Hobby.equalsIgnoreCase("sports"))driver.findElement(hobbySportsCheckbox).click();
		if(Hobby.equalsIgnoreCase("music"))driver.findElement(hobbyMusicCheckbox).click();
		if(Hobby.equalsIgnoreCase("reading"))driver.findElement(hobbyReadingCheckbox).click();
	}

	public void uploadFile(String path) {
		driver.findElement(fileUploadBox).sendKeys(path);	
	}
	
	public void enterLocation(String location) {
		driver.findElement(locationField).click();
		driver.findElement(locationField).sendKeys(location);
	}
	
	public void enterAddress(String address){
		driver.findElement(addressField).sendKeys(address);
	}
	
	public void clickSubmit() {
		driver.findElement(submitButton).click();
	}
}
