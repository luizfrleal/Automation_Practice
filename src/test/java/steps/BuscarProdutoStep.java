package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class BuscarProdutoStep {
    @Dado("que esteja na pagina inicial: {string}")
    public void queEstejaNaPaginaInicial(String arg0) {
    }

    @Quando("o Usuário digitar no campo busca o item : {string}")
    public void oUsuárioDigitarNoCampoBuscaOItem(String arg0) {
    }

    @E("clica no botão buscar")
    public void clicaNoBotãoBuscar() {
    }

    @Entao("o sistema deve trazer no resultado da pesquisa todos os itens que contém essas palavras na tela")
    public void oSistemaDeveTrazerNoResultadoDaPesquisaTodosOsItensQueContémEssasPalavrasNaTela() {
    }
}
