package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	WebDriver driver = null;
	
	
	@Given("User enters home page")
	public void user_enters_home_page() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is :" +projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--lang=en");
		    driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com");
			System.out.println("Page name and Slogan"+"\n" +  driver.getTitle());
	   
	}

	@When("User enters search criteria")
	public void user_enters_search_criteria() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone case");
		WebElement valsch = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div"));
		
	    
		System.out.println("");
	}

	@And("User clicks the search button")
	public void user_clicks_the_search_button() {
	    
		System.out.println("hello");
	}

	@Then("User is taken to searched items")
	public void user_is_taken_to_searched_items() {
	
		System.out.println("hello");
	}
}
