package co.com.reto.web.models;

public class DatosArticulo {
    private String genero;
    private String categoria;
    private String subcategoria;
    private String articulo;

    public DatosArticulo(String genero, String categoria, String subcategoria, String articulo) {
        this.genero = genero;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.articulo = articulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
}
