# language:es

Característica: Comprar productos
  Como usuario de SwagsLabs
  Quiero agregar productos al carrito de compras
  Para realizar la compra


  Escenario: Comprar producto
    Dado que standard_user inicia sesión en SwagLabs
    Cuando agrega el producto 'Sauce Labs Onesie' al carrito de compras
    Y realiza el checkout ingresando Alberto Perez 05554
    Entonces puede ver el mensaje THANK YOU FOR YOU ORDER