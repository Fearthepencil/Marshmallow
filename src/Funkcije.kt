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