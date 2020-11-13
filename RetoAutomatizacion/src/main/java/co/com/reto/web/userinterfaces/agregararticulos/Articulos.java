package co.com.reto.web.userinterfaces.agregararticulos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Articulos {
    public static final Target TXT_GENERO = Target.the("Genero").locatedBy("//a[(@class='sf-with-ul')and(contains(@title,'{0}'))]");
    public static final Target TXT_CATEGORIA = Target.the("Categorias posibles").locatedBy("//a[(@class='subcategory-name')and(contains(text(),'{0}'))]");
    public static final Target TXT_ARTICULO = Target.the("Articulo").locatedBy("//a[(@class='product-name')and(contains(@title,'{0}'))]");
    public static final Target INPUT_CANTIDAD = Target.the("Cantidad del articulo").locatedBy("//input[@id='quantity_wanted']");
    public static final Target BTN_AGREGAR = Target.the("Agregar al carrito").locatedBy("//span[contains(text(),'Add to cart')]");

    private Articulos() {
    }
}
