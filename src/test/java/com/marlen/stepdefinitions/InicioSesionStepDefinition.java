package com.marlen.stepdefinitions;

import com.marlen.models.ActorConfigurador;
import com.marlen.questions.ElElemento;
import com.marlen.tasks.IniciarSesion;
import com.marlen.userinterfaces.ListaProductosUserInterface;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class InicioSesionStepDefinition {

    private Actor actor;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere iniciar sesión$")
    public void queElUsuarioQuiereIniciarSesion(String usuario) {
        ActorConfigurador.valueOf(usuario.toUpperCase());
    }
    @Dado("^que (.*) inicia sesión en SwagLabs$")
    public void queElUsuarioIniciaSesiónEnSwagLabs(String usuario) {
        ActorConfigurador.valueOf(usuario.toUpperCase());
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enSwagLabs());
    }

    @Cuando("ingresa sus credenciales correctamente")
    public void ingresaSusCredencialesCorrectamente() {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enSwagLabs());
    }

    @Entonces("puede ver la lista de productos disponibles")
    public void puedeVerLaListaDeProductosDisponibles() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(ElElemento.esVisible(ListaProductosUserInterface.IMAGE_TITULO_PRODUCTOS)).isTrue());
    }
}
