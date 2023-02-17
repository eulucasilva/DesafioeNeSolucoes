package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjetcs.RemoverCarrinhoPage;

public class RemoverProdutoCarrinhoSteps {

    @Quando("^o usuario clica no carrinho$")
    public void o_usuario_clica_no_carrinho() throws Throwable {
        RemoverCarrinhoPage removerProduto = new RemoverCarrinhoPage(Hooks.getDriver());
        removerProduto.clicarSacola();
    }

    @E("^clica em excluir no produto$")
    public void clica_em_excluir_no_produto() throws Throwable {
        RemoverCarrinhoPage removerProduto = new RemoverCarrinhoPage(Hooks.getDriver());
        removerProduto.excluirItem();
    }

    @Entao("^o sistema devera excluir o produto do carrinho$")
    public void o_sistema_devera_excluir_o_produto_do_carrinho() throws Throwable {
        RemoverCarrinhoPage removerProduto = new RemoverCarrinhoPage(Hooks.getDriver());
        removerProduto.validarExclusao();
    }
}
