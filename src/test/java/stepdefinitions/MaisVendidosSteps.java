package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjetcs.MaisVendidosPage;

public class MaisVendidosSteps {

    @Quando("^o usuario clica no campo Ordenar e seleciona os produtos mais vendidos$")
    public void o_usuario_clica_no_campo_Ordenar_e_seleciona_os_produtos_mais_vendidos() throws Throwable {
        MaisVendidosPage mv = new MaisVendidosPage(Hooks.getDriver());
        mv.preencherOpcaoOrdenar("Mais Vendidos");
    }

    @Entao("^o sistema traz a lista de produtos ordenada$")
    public void o_sistema_traz_a_lista_de_produtos_ordenada() throws Throwable {
        MaisVendidosPage mv = new MaisVendidosPage(Hooks.getDriver());
        mv.validarOrdenacao();
    }
}
