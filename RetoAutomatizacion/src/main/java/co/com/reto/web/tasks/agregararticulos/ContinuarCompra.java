package co.com.reto.web.tasks.agregararticulos;

import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.reto.web.userinterfaces.agregararticulos.ContinuarCompras.BTN_CONTINUAR;

public class ContinuarCompra implements Task {

    private final EsperarSegundos esperar = new EsperarSegundos();

    public static ContinuarCompra deArticulos() {
        return Tasks.instrumented(ContinuarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        esperar.waitThreeSeconds();
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR)
        );
        esperar.waitThreeSeconds();
    }

}
