package co.com.reto.web.questions.cantidadArticulos;

import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.reto.web.userinterfaces.verificarcompras.Compras.TXT_AUTENTICACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ContinuarAutenticacion implements Question<Boolean> {
    private final EsperarSegundos esperar = new EsperarSegundos();

    public static ContinuarAutenticacion conExito() {
        return new ContinuarAutenticacion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        esperar.waitThreeSeconds();
        WaitUntil.the(TXT_AUTENTICACION, isPresent());
        return (TXT_AUTENTICACION).resolveFor(actor).isVisible();
    }
}
