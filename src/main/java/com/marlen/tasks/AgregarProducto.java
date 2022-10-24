package com.marlen.tasks;

import com.marlen.interactions.Arrastrar;
import com.marlen.interactions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.marlen.userinterfaces.ListaProductosUserInterface.*;

public class AgregarProducto implements Task {

    private String producto;

    public AgregarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.AElemento(LABEL_NOMBRE_PRODUCTO.of(producto)),
                Click.on(LABEL_NOMBRE_PRODUCTO.of(producto)),
                Scroll.AElemento(BUTTON_AGREGAR_CARRITO),
                Click.on(BUTTON_AGREGAR_CARRITO)
        );
    }

    public static AgregarProducto alCarrito(String producto) {
        return Tasks.instrumented(AgregarProducto.class, producto);
    }

    public static Task arrastrandoloAlCarrito(String producto) {
        return Task.called("Arrastrar producto al carrito").whereTheActorAttemptsTo(
                Scroll.AElemento(LABEL_NOMBRE_PRODUCTO.of(producto)),
                Arrastrar.elemento(BUTTON_ARRASTRAR_PRODUCTO.of(producto), TOP_BAR_CARRITO)
        );
    }
}
