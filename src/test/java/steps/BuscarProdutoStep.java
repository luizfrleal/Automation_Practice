package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BuscarProdutoStep {
    static WebDriver driver; //Criando driver  para instanciar no @Bifore
    HomePage homePage; //Criando a homepage para instanciar no @Bifore
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);


        homePage = new HomePage(driver);
    }
    @Test
    @Dado("que esteja na pagina inicial: {string}")
    public void queEstejaNaPaginaInicial() {
        driver.get("http://automationpractice.com/index.php");
    }
    @Test
    @Quando("o Usuário digitar no campo busca o item : {string}")
    public void oUsuárioDigitarNoCampoBuscaOItem() {
        homePage.pesquisarItem();

    }
    @Test
    @E("clica no botão buscar")
    public void clicaNoBotãoBuscar() {
        homePage.clicarBuscar();

    }

    @Entao("o sistema deve trazer no resultado da pesquisa todos os itens que contém essas palavras na tela")
    public void oSistemaDeveTrazerNoResultadoDaPesquisaTodosOsItensQueContémEssasPalavrasNaTela() {
        Assert.assertTrue(homePage.ValidarMensagemBusca());

    }
}
