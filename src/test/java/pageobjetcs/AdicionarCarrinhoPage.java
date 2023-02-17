package pageobjetcs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdicionarCarrinhoPage extends Utils {
    protected WebDriver driver;

    public AdicionarCarrinhoPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#__next > div > main > section:nth-child(5) > div.sc-eDvSVe.koHJnT > div > ul > li:nth-child(1)")
    private WebElement produto;

    @FindBy(how = How.CSS, using = "#__next > div > main > section:nth-child(7) > div.sc-jrcTuL.kQzMUn > div:nth-child(2) > button")
    private WebElement btnAdicionar;


    @FindBy(how = How.CSS, using = "#root > div > div.App.clearfix > div > div:nth-child(2) > div > div.BasketPriceBox > div.BasketContinue > div.BasketContinue-actions > button")
    private WebElement btnContinuar;

    @FindBy(how = How.CSS, using = "#__next > div > main > section:nth-child(3) > div.sc-eDvSVe.fldrdv > div > div.sc-hLBbgP.kkqpoF > div > div.sc-hLBbgP.gcxrmT.sc-bCfvAP.dMuOAr.sc-dGJyNR.isGRxK > div.sc-hLBbgP.gcxrmT.sc-bCfvAP.dHhozk > button")
    private WebElement btnIrSacola;

    @FindBy(how = How.CSS, using = "#root > div > div.App.clearfix > div > div:nth-child(2) > div > div.BasketPriceBox > div.BasketContinue > div.BasketContinue-actions > a")
    private WebElement btnMaisProdutos;

    //


    public void clicarProduto () {
        esperarElemento(produto);
        produto.click();
    }

    public void adicionarProduto () {
        esperarElemento(btnAdicionar);
        btnAdicionar.click();
//        esperarElemento(btnIrSacola);
//        if (btnIrSacola.isDisplayed()) {
//            btnIrSacola.click();
//        }
    }

    public void verificarProdutoCarrinho() throws InterruptedException {
        esperarElemento(btnContinuar);
        rolarPagina(700);
        Assert.assertTrue(btnContinuar.isDisplayed());
        btnMaisProdutos.click();
    }
}
