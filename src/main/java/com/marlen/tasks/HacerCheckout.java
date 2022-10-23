package com.marlen.tasks;

import com.marlen.interactions.Scroll;
import com.marlen.models.InformacionPersonal;
import com.marlen.userinterfaces.ContenidoCarritoUserInterface;
import com.marlen.userinterfaces.InformacionPersonalUserInterface;
import com.marlen.userinterfaces.MenuSuperiorUserInterface;
import com.marlen.userinterfaces.ResumenCompraUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HacerCheckout implements Task {

    private InformacionPersonal informacionPersonal;

    public HacerCheckout(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuSuperiorUserInterface.IMAGE_CARRITO_COMPRAS),
                Scroll.AElemento(ContenidoCarritoUserInterface.BUTTON_HACER_CHECKOUT),
                Click.on(ContenidoCarritoUserInterface.BUTTON_HACER_CHECKOUT),
                Enter.theValue(informacionPersonal.getNombre()).into(InformacionPersonalUserInterface.INPUT_PRIMER_NOMBRE),
                Enter.theValue(informacionPersonal.getApellido()).into(InformacionPersonalUserInterface.INPUT_APELLIDO),
                Enter.theValue(informacionPersonal.getCodigoPostal()).into(InformacionPersonalUserInterface.INPUT_CODIGO_POSTAL),
                Scroll.AElemento(InformacionPersonalUserInterface.BUTTON_CONTINUAR),
                Click.on(InformacionPersonalUserInterface.BUTTON_CONTINUAR),
                Scroll.AElemento(ResumenCompraUserInterface.BUTTON_FINALIZAR_COMPRA),
                Click.on(ResumenCompraUserInterface.BUTTON_FINALIZAR_COMPRA)
        );
    }

    public static HacerCheckout deLaCompraCon(InformacionPersonal informacionPersonal) {
        return Tasks.instrumented(HacerCheckout.class, informacionPersonal);
    }
}
