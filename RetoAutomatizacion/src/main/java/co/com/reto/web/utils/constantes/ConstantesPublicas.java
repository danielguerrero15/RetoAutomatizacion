package co.com.reto.web.utils.constantes;

import static co.com.reto.web.utils.constantes.ConstantTypeClass.CONSTANT_CLASS;

public class ConstantesPublicas {
    public static final String GENERO = "genero";
    public static final String CATEGORIA = "categoria";
    public static final String SUBCATEGORIA = "subcategoria";
    public static final String ARTICULO = "articulo";
    public static final String SEPARADOR = ",";

    private ConstantesPublicas() {
        throw new IllegalStateException(CONSTANT_CLASS);
    }
}
