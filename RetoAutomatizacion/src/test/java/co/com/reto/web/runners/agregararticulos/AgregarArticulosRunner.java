package co.com.reto.web.runners.agregararticulos;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.reto.web.utils.constantes.ConstantTypeClass.RUNNER_CLASS;

@CucumberOptions(
        features = "src/test/resources/features/agregararticulos/agregar_articulos.feature",
        glue = "co.com.reto.web.stepdefinitions",
        snippets = SnippetType.CAMELCASE  //,
        //tags= "@agregararticulos"
)

@RunWith(CucumberWithSerenity.class)

public class AgregarArticulosRunner {
    private AgregarArticulosRunner() {
        throw new IllegalStateException(RUNNER_CLASS);
    }
}
