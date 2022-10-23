package com.marlen.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class ElElemento {

    public static Question<Boolean> esVisible(Target elemento){
        return Question.about("Estado del elemento").answeredBy(
                actor -> elemento.resolveFor(actor).isVisible()
        );
    }

    public static Question<String> elTextoDe(Target elemento){
        return Question.about("El texto del elemento").answeredBy(
                actor -> Text.of(elemento).answeredBy(actor)
        );
    }
}
