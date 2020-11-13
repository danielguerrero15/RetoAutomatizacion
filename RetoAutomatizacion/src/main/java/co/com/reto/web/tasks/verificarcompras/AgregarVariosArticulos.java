package co.com.reto.web.tasks.verificarcompras;

import co.com.reto.web.interactions.verificarcompras.RecorrerElementos;
import co.com.reto.web.models.DatosArticulo;
import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.reto.web.userinterfaces.verificarcompras.Compras.*;

public class AgregarVariosArticulos implements Task {

    private final EsperarSegundos esperar = new EsperarSegundos();
    private final DatosArticulo articulos;

    private AgregarVariosArticulos(DatosArticulo articulos){
        this.articulos = articulos;
    }

    public static AgregarVariosArticulos alCarritoDeCompras(DatosArticulo articulos) {
        return new AgregarVariosArticulos(articulos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        esperar.waitThreeSeconds();

        actor.attemptsTo(
                RecorrerElementos.unoPorUno(articulos));
        esperar.waitThreeSeconds();
    }

}
