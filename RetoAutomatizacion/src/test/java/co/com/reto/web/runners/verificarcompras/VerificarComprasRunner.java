package co.com.reto.web.runners.verificarcompras;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.reto.web.utils.constantes.ConstantTypeClass.RUNNER_CLASS;

@CucumberOptions(
        features = "src/test/resources/features/verificarcompras/verificar_compras.feature",
        glue = "co.com.reto.web.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags= "@verificarArticulos"
)

@RunWith(CucumberWithSerenity.class)

public class VerificarComprasRunner {
    private VerificarComprasRunner() {
        throw new IllegalStateException(RUNNER_CLASS);
    }
}
