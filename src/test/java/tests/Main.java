package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.CardsPage;

public class Main {

    private WebDriver driver;
    CardsPage instancia;

    @BeforeTest
    public void setUp()throws Exception{
        instancia = new CardsPage(driver);
        driver = instancia.chromeDriverConnection();
        instancia.visit("https://academybugs.com/find-bugs/");
    }

    @Test
    public void test1 () throws Exception{
        instancia = new CardsPage(driver);
        instancia.SeleccionarProductos();
        Thread.sleep(2000);
        instancia.ClickViewCarts();
    }
}