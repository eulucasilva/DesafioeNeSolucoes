package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.Hooks;

public class Utils {
	protected WebDriver driver;

	public void esperarElemento(WebElement elemento) { // espera explicita elemento
		driver = Hooks.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	public void selecionar (WebElement elemento, String texto) {
		driver = Hooks.getDriver();
		Select dropDown = new Select(elemento);
		dropDown.selectByVisibleText(texto);
	}

	public void rolarPagina (int y) throws InterruptedException {
		driver = Hooks.getDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0," + y + ")");
		Thread.sleep(1500);
	}
}
