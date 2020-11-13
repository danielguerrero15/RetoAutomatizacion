package co.com.reto.web.userinterfaces.agregararticulos;

import net.serenitybdd.screenplay.targets.Target;

public class ContinuarCompras {
    public static final Target BTN_CONTINUAR = Target.the("Continuar compra").locatedBy("//span[(@class='continue btn btn-default button exclusive-medium')and(contains(.,'Continue shopping'))]");
    public static final Target TXT_BUSCAR = Target.the("Continuar compra").locatedBy("//input[@id='search_query_top']");

    private ContinuarCompras() {
    }
}
