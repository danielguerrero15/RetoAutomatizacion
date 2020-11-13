package co.com.reto.web.questions.cantidadArticulos;

import co.com.reto.web.interactions.verificarcompras.RecorrerElementos;
import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;

import static co.com.reto.web.userinterfaces.verificarcompras.Compras.TXT_CANTIDAD_PRODUCTOS;

public class CantidadArticulos implements Question<Boolean> {
    private final EsperarSegundos esperar = new EsperarSegundos();

    @Override
    public Boolean answeredBy(Actor actor) {
        int cantidadArticulos = actor.recall("cantidad");
        int totalArticulos = Integer.parseInt(TXT_CANTIDAD_PRODUCTOS.resolveFor(actor).getText());

        return totalArticulos==cantidadArticulos;
    }

    public static CantidadArticulos correcta() {
        return new CantidadArticulos();
    }
}