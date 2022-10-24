package com.marlen.stepdefinitions;

import com.marlen.models.InformacionPersonal;
import com.marlen.questions.ElElemento;
import com.marlen.tasks.AgregarProducto;
import com.marlen.tasks.HacerCheckout;
import com.marlen.userinterfaces.CompraCompletaUserInterface;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductosStepDefinition {

    @DataTableType(replaceWithEmptyString = "[blank]")
    public InformacionPersonal convertirDataTableAModelo(Map<String, String> entry){
        return new InformacionPersonal(
                entry.get("nombre"),
                entry.get("apellido"),
                entry.get("codigoPostal")
        );
    }

    @Cuando("^agrega el producto (.*) al carrito de compras$")
    public void agregaElProductoAlCarritoDeCompras(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito(producto));
    }
    @Cuando("^realiza el checkout ingresando$")
    public void realizaElCheckoutIngresando(List<InformacionPersonal> informacionPersonalList) {
        theActorInTheSpotlight().attemptsTo(HacerCheckout.deLaCompraCon(informacionPersonalList.get(0)));
    }
    @Cuando("^arrastra el producto (.*) al carrito de compras$")
    public void arrastraElProductoAlCarritoDeCompras(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.arrastrandoloAlCarrito(producto));
    }
    @Entonces("^puede ver el mensaje (.*)$")
    public void puedeVerElMensaje(String mensaje) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(ElElemento.elTextoDe(CompraCompletaUserInterface.LABEL_AGRADECIMIENTO_COMPRA.of(mensaje))).isEqualTo(mensaje));
    }
}
