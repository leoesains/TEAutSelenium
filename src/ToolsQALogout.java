import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQALogout {

	private WebDriver driver;
	
	public ToolsQALogout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		WebElement logoutBtn = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"submit\"]")));
		logoutBtn.click();
	}
	
}
