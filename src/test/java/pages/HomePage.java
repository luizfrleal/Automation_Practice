package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    String digitaItem = "//input[@id='search_query_top']"; //Item a ser buscado
    String btnbuscar = "//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]"; //Botão Buscar
    String btnAddToCart = "//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[2]/div[2]/a[1]/span[1]"; //Botão adicionar item Printed Dress

    String btncheckout = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]";
    //Proceed to checkout//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-container']//div[@class='right-block']//div[@class='button-container']//a[@class='button ajax_add_to_cart_button btn btn-default']//span[contains(text(),'Add to cart')]


    public HomePage(WebDriver driverDoTeste) {
        this.driver = driverDoTeste;
    }

    public void pesquisarItem (){
        driver.findElement(By.xpath(digitaItem)).sendKeys("Printed Dress");
               }
    public void clicarBuscar(){
        driver.findElement(By.xpath(btnbuscar)).click();
    }
    public void selecionaItem (){
        driver.findElement(By.xpath(btnAddToCart)).click();
    }
    public void botaoCheckout (){
        driver.findElement(By.xpath(btncheckout)).click();
    }

}
