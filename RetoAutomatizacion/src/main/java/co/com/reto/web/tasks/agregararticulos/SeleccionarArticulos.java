package co.com.reto.web.tasks.agregararticulos;

import co.com.reto.web.models.DatosArticulo;
import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.reto.web.userinterfaces.agregararticulos.Articulos.*;

public class SeleccionarArticulos implements Task {

    private final EsperarSegundos esperar = new EsperarSegundos();
    private DatosArticulo nuevoArticulo;

    private SeleccionarArticulos(DatosArticulo nuevoArticulo){
        this.nuevoArticulo = nuevoArticulo;
    }

    public static SeleccionarArticulos paraAgregarAlCarrito(DatosArticulo nuevoArticulo) {
        return new SeleccionarArticulos (nuevoArticulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        esperar.waitThreeSeconds();
        actor.attemptsTo(
                Click.on(TXT_GENERO.of(nuevoArticulo.getGenero())),
                Click.on(TXT_CATEGORIA.of(nuevoArticulo.getCategoria())),
                Click.on(TXT_CATEGORIA.of(nuevoArticulo.getSubcategoria())),
                Click.on(TXT_ARTICULO.of(nuevoArticulo.getArticulo())),
                Click.on(BTN_AGREGAR)
        );
        esperar.waitThreeSeconds();
    }

}
