# language: es

Característica: El usuario puede verificar los articulos adicionados al carro de compras
  Yo como usuario de la tienda online YourLogo
  Quiero verificar la cantidad de articulos agregados al carrito
  Para autenticar el proceso de compra

  @verificarArticulos
  Esquema del escenario: Verificar articulos adicionados al carro de compras
    Dado que me encuentro en la pagina de inicio de la tienda
    Cuando adicione varios articulos al carro de compras
      | genero | categoria | subcategoria |articulo|
      |<genero>|<categoria>|<subcategoria>|<articulo>|
    Y verifique la cantidad de articulos agregados al carrito completando el checkout
    Entonces podre autenticar el proceso de compra
    Ejemplos:
      | genero | categoria | subcategoria | articulo |
      |Women,Women|Tops,Dresses|Blouses,Evening Dresses|Blouse,Printed Dress|