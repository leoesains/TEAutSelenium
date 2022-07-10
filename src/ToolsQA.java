import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolsQA {

	static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "chromedriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		driver = new ChromeDriver();
	}

	@Test (priority=1)
	// Cargar la página en el explorador
	public void loadPage() {
		driver.navigate().to("https://demoqa.com/books");
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "ToolsQA");
	}

	@Test (priority=2)
	// Crear un nuevo usuario sin verificar el captcha.
	// Esto es para probar que no se cree el usuario y que muestra mensaje de error.
	public void newUser() {
		ToolsQANewUser toolsNewUser = PageFactory.initElements(driver, ToolsQANewUser.class);
		toolsNewUser.newUser("Leo", "Esains", "user", "#Password-1973");

	}
	
	@Test (priority=3)
	// Volver a la pagina de login
	public void backToLogin() {
		ToolsQABackToLogin toolsBackToLogin = PageFactory.initElements(driver, ToolsQABackToLogin.class);
		toolsBackToLogin.back();

	}
	
	@Test (priority=4)
	// Se logea con datos de un usuario previamente registrado
	public void login() {
		ToolsQALogin toolsLogin = PageFactory.initElements(driver, ToolsQALogin.class);
		toolsLogin.login("user", "#Password-1973");

	}
	
	@Test (priority=5)
	// Termina sesión
	public void logout() {
		ToolsQALogout toolsLogout = PageFactory.initElements(driver, ToolsQALogout.class);
		toolsLogout.logout();

	}
	
	@Test (priority=6)
	// Navega el menú "Alerts, Frame & Windows", y prueba la primera opción de "Alerts"
	public void alerts() throws InterruptedException {
		ToolsQAAlerts toolsAlerts = PageFactory.initElements(driver, ToolsQAAlerts.class);
		toolsAlerts.alerts();

	}
	
	
	
}
