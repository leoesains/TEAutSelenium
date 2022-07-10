import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQALogin {
	
	private WebDriver driver;
	
	public ToolsQALogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) {
		WebDriverWait wait1 = new WebDriverWait(driver, 4000);
		WebElement loginBtn = (WebElement) wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]")));
		loginBtn.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 4000);
		WebElement usuario = (WebElement) wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"userName\"]")));
		usuario.sendKeys(username);
		WebElement clave = (WebElement) wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
		clave.sendKeys(password);
		
		WebDriverWait wait3 = new WebDriverWait(driver, 2000);
		WebElement button = (WebElement) wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]")));
		button.click();
	}
}
