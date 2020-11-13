package co.com.reto.web.userinterfaces.verificarcompras;

import net.serenitybdd.screenplay.targets.Target;

public class Compras {
    public static final Target TXT_CARRO_COMPRAS = Target.the("Carro de compras").locatedBy("//b[(contains(.,'Cart'))]");
    public static final Target TXT_CANTIDAD_PRODUCTOS = Target.the("Cantidad de productos").locatedBy("//span[@class='ajax_cart_quantity']");
    public static final Target BTN_CHECKOUT = Target.the("Ir al checkout").locatedBy("//a[@class='button btn btn-default standard-checkout button-medium']");
    public static final Target TXT_AUTENTICACION = Target.the("Pantalla de autenticacion").locatedBy("//h1[(@class='page-heading')and(contains(.,'Authentication'))]");

    private Compras() {
    }
}
