# language: es

Característica: El usuario puede agregar multiples articulos al carro de compras
  Yo como usuario de la tienda online YourLogo
  Quiero agregar articulos al carro de compras
  Para realizar la compra de estos

  @agregararticulos
  Esquema del escenario: Agregar articulos de la tienda online al carro de compras
    Dado que me encuentro en la pagina de inicio de la tienda
    Cuando adicione un articulo al carro de compras
      | genero | categoria | subcategoria |articulo|
      |<genero>|<categoria>|<subcategoria>|<articulo>|
    Entonces podre continuar con las compras desde la pagina de inicio
    Ejemplos:
      | genero | categoria | subcategoria |articulo|
      |Women|Tops|Blouses|Blouse|
      |Women|Dresses|Evening Dresses|Printed Dress|