package com.marlen.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ListaProductosUserInterface {
    public static final Target IMAGE_TITULO_PRODUCTOS = Target.the("Imagen pricipal de titulo lista de productos").located(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

    public static final Target LABEL_NOMBRE_PRODUCTO = Target.the("Label con el nombre del producto").locatedBy("//android.widget.TextView[@text={0}]");

    public static final Target BUTTON_AGREGAR_CARRITO = Target.the("Botod para agregar producto al carrito").located(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]/android.widget.TextView"));

}
