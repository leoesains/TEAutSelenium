import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQAAlerts {

	private WebDriver driver;
	
	public ToolsQAAlerts(WebDriver driver) {
		this.driver = driver;
	}

	public void alerts() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		WebElement alertsFrameWindows = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")));
		alertsFrameWindows.click();
		
		WebElement alertsFrameWindowsUL = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul")));
		
		WebElement alerts = alertsFrameWindowsUL.findElement(By.id("item-1"));
		alerts.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 4000);
		WebElement btnAlert = (WebElement) wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"alertButton\"]")));
		btnAlert.click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
	}

	
	
	
	

}
