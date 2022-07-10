import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQANewUser {

	private WebDriver driver;
	
	public ToolsQANewUser(WebDriver driver) {
		this.driver = driver;
	}
	
	public void newUser(String name, String surname, String username, String password) {
		WebDriverWait wait1 = new WebDriverWait(driver, 20000);
		WebElement loginBtn = (WebElement) wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]")));
		loginBtn.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 20000);
		WebElement newUserBtn = (WebElement) wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"newUser\"]")));
		newUserBtn.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10000);
		WebElement nombre = (WebElement) wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"firstname\"]")));
		nombre.sendKeys(name);
		WebElement apellido = (WebElement) wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lastname\"]")));
		apellido.sendKeys(surname);
		WebElement usuario = (WebElement) wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"userName\"]")));
		usuario.sendKeys(username);
		WebElement clave = (WebElement) wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
		clave.sendKeys(password);
		
		WebDriverWait wait4 = new WebDriverWait(driver, 20000);
		WebElement buttonRegistrer = (WebElement) wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"register\"]")));
		buttonRegistrer.click();
	}
}
