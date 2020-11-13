package co.com.reto.web.interactions.verificarcompras;

import co.com.reto.web.models.DatosArticulo;
import co.com.reto.web.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Arrays;
import java.util.List;

import static co.com.reto.web.userinterfaces.agregararticulos.Articulos.*;
import static co.com.reto.web.userinterfaces.agregararticulos.Articulos.BTN_AGREGAR;
import static co.com.reto.web.userinterfaces.agregararticulos.ContinuarCompras.BTN_CONTINUAR;
import static co.com.reto.web.utils.constantes.ConstantesPublicas.SEPARADOR;

public class RecorrerElementos implements Interaction {
    private final EsperarSegundos esperar = new EsperarSegundos();
    private final DatosArticulo articulos;
    private int cantidad;

    public RecorrerElementos(DatosArticulo articulos) {
        this.articulos = articulos;
    }

    public static RecorrerElementos unoPorUno(DatosArticulo articulos) {
        return new RecorrerElementos(articulos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Llegue");
        String[] genero = articulos.getGenero().split(SEPARADOR);
        String[] categoria = articulos.getCategoria().split(SEPARADOR);
        String[] subcategoria = articulos.getSubcategoria().split(SEPARADOR);
        String[] articulo = articulos.getArticulo().split(SEPARADOR);

        List<String> generosSeparados = Arrays.asList(genero);
        List<String> categoriasSeparadas = Arrays.asList(categoria);
        List<String> subcategoriasSeparadas = Arrays.asList(subcategoria);
        List<String> articulosSeparados = Arrays.asList(articulo);

        actor.remember("cantidad",cantidad);

        for (int i=0; i < generosSeparados.size(); i++){
            actor.attemptsTo(
                    Click.on(TXT_GENERO.of(generosSeparados.get(i))),
                    Click.on(TXT_CATEGORIA.of(categoriasSeparadas.get(i))),
                    Click.on(TXT_CATEGORIA.of(subcategoriasSeparadas.get(i))),
                    Click.on(TXT_ARTICULO.of(articulosSeparados.get(i))),
                    Click.on(BTN_AGREGAR),
                    Click.on(BTN_CONTINUAR)
            );
            esperar.waitThreeSeconds();
        }
    }
}