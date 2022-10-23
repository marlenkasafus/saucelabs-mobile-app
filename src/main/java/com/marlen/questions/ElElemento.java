package com.marlen.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ElElemento {

    public static Question<Boolean> esVisible(Target elemento){
        return Question.about("Estado del elemento").answeredBy(
                actor -> elemento.resolveFor(actor).isVisible()
        );
    }
}
