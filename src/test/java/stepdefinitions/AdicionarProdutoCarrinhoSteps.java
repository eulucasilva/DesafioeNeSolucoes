package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pageobjetcs.AdicionarCarrinhoPage;

public class AdicionarProdutoCarrinhoSteps {

    @Quando("^o usuario seleciona o produto desejado$")
    public void o_usuario_seleciona_o_produto_desejado() throws Throwable {
        AdicionarCarrinhoPage adicionarProduto = new AdicionarCarrinhoPage(Hooks.getDriver());
        adicionarProduto.rolarPagina(250);
        adicionarProduto.clicarProduto();
    }

    @E("^adiciona ao carrinho$")
    public void adiciona_ao_carrinho() throws Throwable {
        AdicionarCarrinhoPage adicionarProduto = new AdicionarCarrinhoPage(Hooks.getDriver());
        adicionarProduto.rolarPagina(600);
        adicionarProduto.adicionarProduto();
    }

    @Entao("^o sistema devera inserir o produto no carrinho$")
    public void o_sistema_devera_inserir_o_produto_no_carrinho() throws Throwable {
        AdicionarCarrinhoPage adicionarProduto = new AdicionarCarrinhoPage(Hooks.getDriver());
        adicionarProduto.verificarProdutoCarrinho();
    }


}
