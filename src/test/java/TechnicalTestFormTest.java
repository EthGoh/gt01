package test.java;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import govtech01.TechnicalTestForm;

public class TechnicalTestFormTest {

	private WebDriver driver;
	private TechnicalTestForm testPage;

	@BeforeClass
	public void setUp() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");

		// Initialize WebDriver
		driver = new ChromeDriver(options);
		new WebDriverWait(driver, Duration.ofSeconds(10));

		// Initialize Page Objects
		testPage = new TechnicalTestForm(driver);

		// Open the test form
		driver.get("https://form.gov.sg/64532b2493ceeb0012c6354f");

		System.out.println("Test Setup");
	}

	@Test
	public void testEmptyForm() {
		// enter no values
		testPage.clickSubmit();

		// Locate the elements containing text (could be body or specific sections)
		WebElement body = driver.findElement(By.tagName("body")); // Adjust if needed
		String pageText = body.getText();
		// Define the string to search for
		String searchString = "This field is required"; // Replace with the actual string
		int count = countOccurrences(pageText, searchString);

		// Add assertions to verify the result
		Assert.assertTrue(count == 7);
	}

	@Test
	public void testForm() {
		// enter all required values
		testPage.enterFirstname("testFirstName");
		testPage.enterLastname("testLastName");
		testPage.enterEmail("testemail@somerandomsite123321.com");
		testPage.selectGender("male");
		testPage.enterMobile("81234567");
		testPage.enterDoB("12/01/1986");
		testPage.selectHobby("sports");
		testPage.selectHobby("music");
		testPage.selectHobby("reading");
		testPage.clickSubmit();

		// Add assertions to verify the result
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

	// Method to count occurrences of a substring in a string
	public static int countOccurrences(String text, String searchString) {
		int count = 0;
		int index = 0;

		while ((index = text.indexOf(searchString, index)) != -1) {
			count++;
			index += searchString.length();
		}

		return count;
	}
}
