package co.com.reto.web.stepdefinitions.agregararticulos;

import co.com.reto.web.models.DatosArticulo;
import co.com.reto.web.questions.agregararticulos.RegresaAlInicio;
import co.com.reto.web.tasks.agregararticulos.ContinuarCompra;
import co.com.reto.web.tasks.agregararticulos.SeleccionarArticulos;
import co.com.reto.web.tasks.verificarcompras.AgregarVariosArticulos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarArticulosStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en la pagina de inicio de la tienda$")
    public void que_me_encuentro_en_la_pagina_de_inicio_de_la_tienda() {
        theActorCalled("ElUsuario").wasAbleTo(
                Open.url("http://automationpractice.com/"));
    }


    @Cuando("^adicione un articulo al carro de compras$")
    public void adicione_un_articulo_al_carro_de_compras(List<DatosArticulo> articulo) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarArticulos.paraAgregarAlCarrito(articulo.get(0)),
                ContinuarCompra.deArticulos()
        );
    }

    @Entonces("^podre continuar con las compras desde la pagina de inicio$")
    public void podre_continuar_con_las_compras_desde_la_pagina_de_inicio() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                RegresaAlInicio.conExito()));
    }


}
