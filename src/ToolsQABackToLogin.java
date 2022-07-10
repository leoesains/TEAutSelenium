import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQABackToLogin {

	private WebDriver driver;
	
	public ToolsQABackToLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void back() {
		WebDriverWait wait = new WebDriverWait(driver, 20000);
		WebElement backBtn = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gotologin\"]")));
		backBtn.click();
		
	}

}
