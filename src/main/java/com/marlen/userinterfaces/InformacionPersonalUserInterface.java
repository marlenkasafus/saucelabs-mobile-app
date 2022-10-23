package com.marlen.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonalUserInterface {
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Campo primer nombre").located(AppiumBy.accessibilityId("test-First Name"));
    public static final Target INPUT_APELLIDO = Target.the("Campo apellido").located(AppiumBy.accessibilityId("test-Last Name"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Campo código postal").located(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static final Target BUTTON_CONTINUAR = Target.the("Botón Continuar").located(AppiumBy.accessibilityId("test-CONTINUE"));

}
