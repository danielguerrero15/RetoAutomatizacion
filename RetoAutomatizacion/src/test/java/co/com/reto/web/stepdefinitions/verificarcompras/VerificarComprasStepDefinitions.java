

package co.com.reto.web.stepdefinitions.verificarcompras;
import co.com.reto.web.models.DatosArticulo;
import co.com.reto.web.questions.cantidadArticulos.CantidadArticulos;
import co.com.reto.web.questions.cantidadArticulos.ContinuarAutenticacion;
import co.com.reto.web.tasks.verificarcompras.AgregarVariosArticulos;
import co.com.reto.web.tasks.verificarcompras.VerificarCantidadArticulos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VerificarComprasStepDefinitions {

@Cuando("^adicione varios articulos al carro de compras$")
public void adicione_varios_articulos_al_carro_de_compras(List<DatosArticulo> articulos) {
    theActorInTheSpotlight().attemptsTo(
            AgregarVariosArticulos.alCarritoDeCompras(articulos.get(0)));
}

@Cuando("^verifique la cantidad de articulos agregados al carrito completando el checkout$")
public void verifique_la_cantidad_de_articulos_agregados_al_carrito_completando_el_checkout() {
    theActorInTheSpotlight().attemptsTo(
            VerificarCantidadArticulos.paraRealizarCheckout());
        }

@Entonces("^podre autenticar el proceso de compra$")
public void podre_autenticar_el_proceso_de_compra() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(
            ContinuarAutenticacion.conExito()));
        }
}