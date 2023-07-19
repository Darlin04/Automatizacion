package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardsPage extends Base {

    By card1Locator = By.id("ec_add_to_cart_1");
    By card2Locator = By.id("ec_add_to_cart_2");
    By card9Locator = By.id("ec_add_to_cart_9");
    By ViewCatLocator = By.linkText("View Cart");
    By PageFindValidador = By.xpath("//h3[contains(text(),'Find Bugs')]");
    public  CardsPage(WebDriver driver){
        super(driver);
    }

    public void SeleccionarProductos(){

        if (isDisplayed(PageFindValidador)){
            click(card1Locator);
            click(card2Locator);
            click(card9Locator);
        }

    }

    public void ClickViewCarts(){
        click(ViewCatLocator);
    }
}
