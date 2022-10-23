package com.marlen.userinterfaces;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionUserInterface {
    public static final Target INPUT_NOMBRE_USUARIO = Target.the("Campo nombre de usuario").located(AppiumBy.accessibilityId("test-Username"));
    public static final Target INPUT_CONTRASENA_USUARIO = Target.the("Campo contraseña de usuario").located(AppiumBy.accessibilityId("test-Password"));
    public static final Target BUTTON_CONTRASENA_USUARIO = Target.the("Botón para iniciar sesión").located(AppiumBy.accessibilityId("test-LOGIN"));

}
