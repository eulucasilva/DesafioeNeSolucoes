package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjetcs.BuscarProdutoPage;
import pageobjetcs.ProdutoInexistentePage;

public class ProdutoInexistenteSteps {

    private String nomeProduto = "xptoabcd";
    @Quando("^o usuario clica no campo Buscar e coloca produto inexistente$")
    public void o_usuario_clica_no_campo_Buscar_e_coloca_produto_inexistente() throws Throwable {
        ProdutoInexistentePage inexistente = new ProdutoInexistentePage(Hooks.getDriver());
        inexistente.fechaJanelaCookies();
        inexistente.digitarProduto(nomeProduto);
    }
    @E("^clica na lupa$$")
    public void clicar_na_lupa() throws Throwable {
        ProdutoInexistentePage inexistente = new ProdutoInexistentePage(Hooks.getDriver());
        inexistente.buscarProduto();
    }
    @Entao("^o sistema traz a lista de produtos vazia$")
    public void o_sistema_traz_a_lista_de_produtos_vazia() throws Throwable {
        ProdutoInexistentePage inexistente = new ProdutoInexistentePage(Hooks.getDriver());
        inexistente.validaTelaProdutoInexistente(nomeProduto);
    }
}
