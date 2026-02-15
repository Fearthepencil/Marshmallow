/**
 * Funkcije se definisu koristeci kljucnu rec fun
 * Kad prosledjujes parametre f-jama moras da EKSPLICITNO NAVEDES TIP promenljive
 * Povratni tip takodje moras eksplicitno da deklarsises kao : Tip odmah posle parametara
 * Parametrima u f-ji mozes da das default vrednosti, samo kazes = nesto. U slucaju
 * da ne posaljes vrednost f-ji, desice se da se triggeruje ova default vrednost
 */
fun reverseStr(string: String = "Hello!"): String {
    val reverseStr = buildString{
        for(i in string.lastIndex downTo 0){
            append(string[i])
        }
    }
    return reverseStr
}

/**
 * Extension functions - f-je koje mogu da se pozivaju nad objektima u kotlinu.
 * Prva stvar koju ces da primetis - svi kotlin tipovi i promenljive imaju te neke f-je ugradjene
 * koje mozes da pozivas. Tipa .toInt() itd.
 * Kotlin ima mnogo ludu stvar - ne moras da pravis klase da bi mogao da zoves ovakve objektne f-je.
 * Samo moras da definises tip objekta nad kojim ovo moze da se poziva. Npr String.ime_f-je znaci da
 * ovu f-ju mozes da pozoves nad bilo kojim stringom.
 * U njoj ces morati da koristis **THIS** kao kljucnu rec da referises promenljivu iz koje si pozvao f-ju, logicno
 * Anotaciju @extensionReverse moram da koristim zajedno sa this ovde da bi kompajler znao u kontekstu f-je
 * buildStr na koji ja this mislim. On ovde ne zna za this iz ove extensionReverse f-je i zbuni se
 */
fun String.extensionReverse():String{
    val reverseStr = buildString{
        for(i in this@extensionReverse.lastIndex downTo 0){
            append(this@extensionReverse[i])
        }
    }
    return reverseStr
}