# language:es

Característica: Comprar productos
  Como usuario de SwagsLabs
  Quiero agregar productos al carrito de compras
  Para realizar la compra

  Antecedentes: Iniciar sesión
    Dado que standard_user inicia sesión en SwagLabs

  @BotonAgregar
  Escenario: Comprar producto presionando botón agregar
    Cuando agrega el producto 'Sauce Labs Onesie' al carrito de compras
    Y realiza el checkout ingresando
      |nombre |apellido|codigoPostal|
      |Alberto|Perez   |05554       |
    Entonces puede ver el mensaje THANK YOU FOR YOU ORDER

  @ArrastrarProducto
  Escenario: Comprar producto arrastrandolo al carrito
    Cuando arrastra el producto 'Sauce Labs Onesie' al carrito de compras
    Y realiza el checkout ingresando
      |nombre |apellido|codigoPostal|
      |Alberto|Perez   |05554       |
    Entonces puede ver el mensaje THANK YOU FOR YOU ORDER