package pageobjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RemoverCarrinhoPage extends Utils {

    protected WebDriver driver;

    public RemoverCarrinhoPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#__next > div > main > section:nth-child(2) > div.sc-jIkldg.koMvmm > header > div > div.sc-iiNlcH.kpQrTo > a:nth-child(5) > div > button > div.sc-eAeVAz.jMCVxP > svg > use")
    private WebElement btnSacola;

    @FindBy(how = How.CSS, using = "#root > div > div.App.clearfix > div > div:nth-child(2) > div > div.BasketTable > div.BasketTable-items > div > div.BasketItem-productContainer > div.BasketItemProduct-quantity > button > span")
    private WebElement btnExcluir;

    @FindBy(how = How.XPATH, using = "//div[@class='EmptyBasket-title']")
    private WebElement txtSacolaVazia;



    public void clicarSacola(){
        esperarElemento(btnSacola);
        btnSacola.click();
    }

    public void excluirItem(){
        esperarElemento(btnExcluir);
        btnExcluir.click();
    }
    public void validarExclusao(){
        esperarElemento(txtSacolaVazia);
        assertEquals("Sua sacola está vazia", txtSacolaVazia.getText());
    }

}
