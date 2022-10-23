package com.marlen.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.marlen.userinterfaces.InicioSesionUserInterface.*;

public class IniciarSesion implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(actor.getName()).into(INPUT_NOMBRE_USUARIO),
                Enter.theValue(actor.recall("contrasena").toString()).into(INPUT_CONTRASENA_USUARIO),
                Click.on(BUTTON_CONTRASENA_USUARIO)
        );
    }

    public static IniciarSesion enSwagLabs() {
        return Tasks.instrumented(IniciarSesion.class);
    }

}
