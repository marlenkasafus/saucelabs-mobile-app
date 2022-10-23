package com.marlen.interactions;

import com.google.common.collect.ImmutableMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Scroll implements Interaction {
    private Target elemento;

    public Scroll(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        Dimension dimension = driver.manage().window().getSize();
        int posicionCentral = dimension.width / 2;
        int posicionInicialSuperior = dimension.height / 4;
        int tamanoScroll = posicionInicialSuperior * 2;

        while (!elemento.resolveFor(actor).isVisible()) {
            ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", posicionCentral, "top", posicionInicialSuperior, "width", 10, "height", tamanoScroll,
                    "direction", "down",
                    "percent", 5.0
            ));
        }
    }

    public static Scroll AElemento(Target elemento) {
        return Tasks.instrumented(Scroll.class, elemento);
    }
}
