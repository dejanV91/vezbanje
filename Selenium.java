import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) {
		WebDriver wb = new ChromeDriver();
		String url = "http://newtours.demoaut.com/";
		wb.get(url);

		WebElement register = wb.findElement(By.linkText("REGISTER"));
		register.click();

		WebElement nameBar = wb.findElement(By.name("firstName"));
		nameBar.click();
		nameBar.sendKeys("Dejan");

		WebElement lastBar = wb.findElement(By.name("lastName"));
		lastBar.click();
		lastBar.sendKeys("Vukoicic");

		WebElement phoneBar = wb.findElement(By.name("phone"));
		phoneBar.click();
		phoneBar.sendKeys("05492843848");

		WebElement emailBar = wb.findElement(By.name("userName"));
		emailBar.click();
		emailBar.sendKeys("djen@32424");

		WebElement addressBar = wb.findElement(By.name("address1"));
		addressBar.click();
		addressBar.sendKeys("akdkafa");

		WebElement cityBar = wb.findElement(By.name("city"));
		cityBar.click();
		cityBar.sendKeys("Beograd");

		WebElement stateBar = wb.findElement(By.name("state"));
		stateBar.click();
		stateBar.sendKeys("Akjwkfj");

		WebElement postalCodeBar = wb.findElement(By.name("postalCode"));
		postalCodeBar.click();
		postalCodeBar.sendKeys("0113424");

		Select country = new Select(wb.findElement(By.name("country")));
		country.selectByVisibleText("SERBIA");

		WebElement email = wb.findElement(By.name("email"));
		email.click();
		email.sendKeys("ssdknsk@osjd");

		WebElement password = wb.findElement(By.name("password"));
		password.click();
		password.sendKeys("Akjwkfj");

		WebElement confirmPassword = wb.findElement(By.name("confirmPassword"));
		confirmPassword.click();
		confirmPassword.sendKeys("24ssfsq12");

		WebElement registerButt = wb.findElement(By.name("register"));
		registerButt.click();

	}

}
