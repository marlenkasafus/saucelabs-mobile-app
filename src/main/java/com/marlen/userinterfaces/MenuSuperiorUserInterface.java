package com.marlen.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuSuperiorUserInterface {
    public static final Target IMAGE_CARRITO_COMPRAS = Target.the("Imagen del carrito de compras").located(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup"));
}
