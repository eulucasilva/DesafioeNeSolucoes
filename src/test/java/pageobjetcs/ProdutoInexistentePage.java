package pageobjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import static org.junit.Assert.assertEquals;

public class ProdutoInexistentePage extends Utils {

    protected WebDriver driver;

    public ProdutoInexistentePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#__next > div > main > section:nth-child(6) > div:nth-child(1) > div > h1")
    private WebElement txtProdutoInexistente;

    @FindBy(how = How.CSS, using = "#search-container > div.sc-jrcTuL.bgNHmD.sc-caPbAK.OyJzl > svg")
    private WebElement lupa;

    @FindBy(how = How.ID, using = "input-search")
    private WebElement campoBuscar;

    @FindBy(how = How.CSS, using = "#__next > div > main > div > div.sc-jrcTuL.cRiqUS > button")
    private WebElement btnFechar;
    public void fechaJanelaCookies () {
        esperarElemento(btnFechar);
        btnFechar.click();
    }

    public void digitarProduto (String nomeproduto) {
        esperarElemento(campoBuscar);
        campoBuscar.sendKeys(nomeproduto);
    }

    public void buscarProduto () {
        esperarElemento(lupa);
        lupa.click();
    }
    public void validaTelaProdutoInexistente (String produto){
        String txt = "Sua busca por " + "\"" + produto + "\"" + " não encontrou resultado algum :(";
        esperarElemento(txtProdutoInexistente);
        assertEquals(txt, txtProdutoInexistente.getText());
    }


}
