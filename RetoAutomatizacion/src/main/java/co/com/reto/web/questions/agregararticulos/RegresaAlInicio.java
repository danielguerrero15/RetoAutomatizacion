package co.com.reto.web.questions.agregararticulos;

import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.reto.web.userinterfaces.agregararticulos.ContinuarCompras.TXT_BUSCAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RegresaAlInicio implements Question<Boolean> {
    private final EsperarSegundos esperar = new EsperarSegundos();

    public static RegresaAlInicio conExito() {
        return new RegresaAlInicio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        esperar.waitThreeSeconds();
        WaitUntil.the(TXT_BUSCAR, isPresent());
        return (TXT_BUSCAR).resolveFor(actor).isVisible();
    }
}
