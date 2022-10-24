package com.marlen.interactions;

import com.google.common.collect.ImmutableMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Arrastrar implements Interaction{

    private Target elementoOrigen;
    private Target elementoDestino;

    public Arrastrar(Target elementoOrigen, Target elementoDestino) {
        this.elementoOrigen = elementoOrigen;
        this.elementoDestino = elementoDestino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "startX", elementoOrigen.resolveFor(actor).getLocation().x,
                "startY",elementoOrigen.resolveFor(actor).getLocation().y,
                "endX", elementoDestino.resolveFor(actor).getLocation().x,
                "endY", elementoDestino.resolveFor(actor).getLocation().y
        ));
    }

    public static Interaction elemento(Target elementoOrigen, Target elementoDestino) {
        return Tasks.instrumented(Arrastrar.class, elementoOrigen, elementoDestino);
    }
}
