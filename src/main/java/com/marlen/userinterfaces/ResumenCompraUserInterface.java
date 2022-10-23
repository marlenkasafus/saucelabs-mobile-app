package com.marlen.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ResumenCompraUserInterface {
    public static final Target BUTTON_FINALIZAR_COMPRA = Target.the("Botón finalizar compra").located(AppiumBy.accessibilityId("test-FINISH"));
}
