package com.marlen.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/comprar_productos.feature",
        tags = "@BotonAgregar",
        glue = "com.marlen.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ComprarProductosRunner {
}
