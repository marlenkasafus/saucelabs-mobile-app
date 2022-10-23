package com.marlen.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ListaProductosUserInterface {
    public static final Target IMAGE_TITULO_PRODUCTOS = Target.the("Imagen pricipal de titulo lista de productos").located(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));
}
