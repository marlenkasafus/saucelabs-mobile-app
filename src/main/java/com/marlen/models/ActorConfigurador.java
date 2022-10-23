package com.marlen.models;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public enum ActorConfigurador {

    STANDARD_USER(OnStage.theActorCalled("standard_user"));

    private Actor actor;

    private ActorConfigurador(Actor actor) {
        this.actor = actor;
        this.actor.remember("contrasena","secret_sauce");
    }

    public Actor getActor() {
        return actor;
    }


}
