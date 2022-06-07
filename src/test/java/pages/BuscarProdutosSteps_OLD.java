package pages;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BuscarProdutosSteps_OLD {
    static WebDriver driver;
    HomePage homePage;


    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homePage = new HomePage(driver);

    @Dado("que estaja na pagina inicial")
            public void acessarPaginaInicial(){
            String url = "http://automationpractice.com";
            driver.get(url);

        }

            }
    @Quando("o Usuário digitar  o item : \"Printed Dress\" no campo de busca")
            public void digitarProdutoNaBusca(){
            homePage.clicarBuscar();

            }
    @E("ao clicar no botão buscar")
            public void clicarBotaoBuscar(){
            homePage.clicarBuscar();
            }

    @io.cucumber.java.pt.Dado("que estaja na pagina inicial: {string}")
    public void queEstajaNaPaginaInicial(String arg0) {
    }
}

    //@Entao ("o sistema deve trazer no resultado da pesquisa todos os itens que contém essas palavras na tela")

