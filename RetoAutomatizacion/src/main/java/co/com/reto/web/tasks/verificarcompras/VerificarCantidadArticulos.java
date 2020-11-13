package co.com.reto.web.tasks.verificarcompras;

import co.com.reto.web.questions.cantidadArticulos.CantidadArticulos;
import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.questions.JavaScript;

import static co.com.reto.web.userinterfaces.verificarcompras.Compras.BTN_CHECKOUT;
import static co.com.reto.web.userinterfaces.verificarcompras.Compras.TXT_CARRO_COMPRAS;

public class VerificarCantidadArticulos implements Task {

    private final EsperarSegundos esperar = new EsperarSegundos();
    CantidadArticulos cantidad = new CantidadArticulos();

    public static VerificarCantidadArticulos paraRealizarCheckout() {
        return Tasks.instrumented(VerificarCantidadArticulos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        esperar.waitThreeSeconds();
        actor.attemptsTo(
                Click.on(TXT_CARRO_COMPRAS));
        cantidad.answeredBy(actor);
        actor.attemptsTo(
                Click.on(BTN_CHECKOUT)
                );
        esperar.waitThreeSeconds();
    }
}

