package com.marlen.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ContenidoCarritoUserInterface {
    public static final Target BUTTON_HACER_CHECKOUT = Target.the("Boton para chacer el chckout").located(AppiumBy.accessibilityId("test-CHECKOUT"));
}
