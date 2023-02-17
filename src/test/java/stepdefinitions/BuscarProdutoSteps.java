package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pageobjetcs.BuscarProdutoPage;

public class BuscarProdutoSteps {

    WebDriver driver;
    private String nomeProduto = "Cama";

    @Dado("^que o usuario esteja na pagina principal do sistema$")
    public void que_o_usuario_esteja_na_pagina_principal_do_sistema() throws Throwable {
        Hooks.abrirUrl("https://www.magazineluiza.com.br/");
        driver = Hooks.getDriver();
    }

    @Quando("^o usuario clica no campo Buscar e coloca o nome do produto desejado$$")
    public void o_usuario_clicar_no_campo_Buscar() throws Throwable {
        BuscarProdutoPage bp = new BuscarProdutoPage(driver);
        bp.fechaJanelaCookies();
        bp.fechaJanelaEndereco();
        bp.digitarProduto(nomeProduto);
    }

    @E("^clicar na lupa$$")
    public void clicar_na_lupa() throws Throwable {
        BuscarProdutoPage bp = new BuscarProdutoPage(driver);
        bp.buscarProduto();
    }
    @Entao("^o sistema traz a lista de produtos$")
    public void o_sistema_deve_trazer_a_lista_de_produtos() throws Throwable {
        BuscarProdutoPage bp = new BuscarProdutoPage(driver);
        bp.validaTelaProdutoExistente(nomeProduto);
    }
}
