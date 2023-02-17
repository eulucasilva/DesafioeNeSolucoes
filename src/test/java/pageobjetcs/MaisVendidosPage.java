package pageobjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Utils;

import static org.junit.Assert.assertEquals;

public class MaisVendidosPage extends Utils {
    protected WebDriver driver;
    public MaisVendidosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "select-desktop-with-label")
    private WebElement campoOrdenar;


    public void preencherOpcaoOrdenar(String opcao) {
        esperarElemento(campoOrdenar);
        selecionar(campoOrdenar, opcao);
    }

    public void validarOrdenacao() {
        Select comboBox = new Select(campoOrdenar);
        String selectedComboValue = comboBox.getFirstSelectedOption().getText();
        esperarElemento(campoOrdenar);
        assertEquals("Mais Vendidos", selectedComboValue);
    }

}
