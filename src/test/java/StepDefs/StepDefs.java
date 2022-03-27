package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefs {
	WebDriver driver;

	@Given("^User is at sign-in page$")
	public void user_is_at_sign_in_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		String ActialTitle = driver.getTitle();
		String ExpectedTitle = "Gmail";
		Assert.assertEquals(ActialTitle, ExpectedTitle);
		System.out.println(ActialTitle + " True");

	}

	@When("^user provides the credentials and clicks on next$")
	public void she_provides_the_credentials_and_clicks_on_next() throws Throwable {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sakshi.demotest");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);

	}

	@When("^user clicks on compose button$")
	public void user_clicks_on_compose_button() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();

	}

	@When("^enters the email id of receiver person$")
	public void enters_the_email_id_of_receiver_person() throws Throwable {
		driver.findElement(By.name("to")).sendKeys("sakshijagtap914@gmail.com");
	}

	@When("^enters the subject and email body$")
	public void enters_the_subject_and_email_body() throws Throwable {
		driver.findElement(By.name("subjectbox")).sendKeys("Incubyte");
		driver.findElement(By.xpath("/html[1]/body[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]")).sendKeys("Automation QA test for Incubyte");
	}

	@When("^clicks on sent button$")
	public void clicks_on_sent_button() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(5000);

	}

	@When("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		driver.close();

	}

}
