package com.marlen.stepdefinitions;

import com.marlen.models.InformacionPersonal;
import com.marlen.questions.ElElemento;
import com.marlen.tasks.AgregarProducto;
import com.marlen.tasks.HacerCheckout;
import com.marlen.userinterfaces.CompraCompletaUserInterface;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductosStepDefinition {

    @Cuando("^agrega el producto (.*) al carrito de compras$")
    public void agregaElProductoAlCarritoDeCompras(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito(producto));
    }
    @Cuando("^realiza el checkout ingresando (.*) (.*) (.*)$")
    public void realizaElCheckoutIngresando(String nombre, String apellido, String codigoPostal) {
        InformacionPersonal informacionPersonal = new InformacionPersonal(nombre, apellido, codigoPostal);
        theActorInTheSpotlight().attemptsTo(HacerCheckout.deLaCompraCon(informacionPersonal));
    }
    @Entonces("^puede ver el mensaje (.*)$")
    public void puedeVerElMensaje(String mensaje) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(ElElemento.elTextoDe(CompraCompletaUserInterface.LABEL_AGRADECIMIENTO_COMPRA.of(mensaje))).isEqualTo(mensaje));
    }
}
