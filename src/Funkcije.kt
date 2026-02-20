/**
 * Funkcije se definisu koristeci kljucnu rec fun
 * Kad prosledjujes parametre f-jama moras da EKSPLICITNO NAVEDES TIP promenljive
 * Povratni tip takodje moras eksplicitno da deklarsises kao : Tip odmah posle parametara
 * Parametrima u f-ji mozes da das default vrednosti, samo kazes = nesto. U slucaju
 * da ne posaljes vrednost f-ji, desice se da se triggeruje ova default vrednost
 * Default povratna vrednost (void) je **Unit** u kotlinu
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
 * Anotaciju **@extensionReverse** --> **@imeF-jeKonteksta** moram da koristim zajedno sa this ovde da bi kompajler znao u kontekstu f-je
 * buildStr na koji ja this mislim. On ovde ne zna za this iz ove extensionReverse f-je i zbuni se
 * U sustini koristeci ovu anotaciju ti kompajleru omogucavas da koristi this iz okruzujuceg konteksta - kul
 */
fun String.extensionReverse():String{
    val reverseStr = buildString{
        for(i in this@extensionReverse.lastIndex downTo 0){
            append(this@extensionReverse[i])
        }
    }
    return reverseStr
}

/**
 * Function overloading - ista f-ja za okretanje stringa, samo okrece string od odredjenog indexa.
 * Pravila za overloading su - moze isto ime, isti povratni tip, razliciti parametri mora!
 */
fun String.extensionReverse(startingIndex: Int): String{
    val reverseStr = buildString{
        for(i in startingIndex downTo 0){
            append(this@extensionReverse[i])
        }
    }
    return reverseStr
}

/**
 * Lambda f-je je u sustini samo f-ja koju mozes da prosledis kao parametar drugoj f-ji.
 * Mozes da vidis npr. kako se koristi lambda f-ja filter koja treba da izbaci nesto iz input stringa,
 * ne moras da koristis zagrade kad pozivas ovakvu f-ju. Ova f-ja npr uzima char po char iz input stringa
 * i izbacuje sve sto ne prolazi filter (lambda vraca boolean na osnovu koga se radi filtracija).
 * Karaktere mozes da dohvatis koristeci kljucnu rec **IT**
 * Mozes i sam da definises lambda f-ju, smestis je u promneljivu i da je passujes kao argument f-ji
 * koja prima lambda f-ju kao parametar. U ovom slucaju moras da navedes i tip parametra na koji se odnosi
 * **IT** i tip povratnog parametra lambda f-je u formi **(itType)->(returnType)**
 */
fun filterLetters(input: String): String{
    val lambda: (Char)->(Boolean) = {
        it.isLetter()
    }
    input.filter {
        it.isLetter()
    }
    return input.filter(predicate=lambda)
}

/**
 * Kad postoji vise promenljivih, posebno razlicitih tipova, kao ulaznih promenljivih u lambda f-ju,
 * kompajler vise ne zna na sta mislis kad kazes **it**. U ovom slucaju treba da EKSPLICITNO IMENUJES input parametre i
 * onda tako koristis u f-ji (ovde u primeru ispod ne radim to, ali cisto da znas).
 * Moja **EXTENSION LAMBDA F-JA :))**
 */
fun String.customFilter(lambda: (Char) -> Boolean): String{
    return buildString {
        for(char in this@customFilter){
            if(lambda(char)){
                append(char)
            }
        }
    }
}

/**
 * Postoji mogucnost extendovanja tipova i za lambda f-je. Zvuci ludo - sta je to?
 * U sustini pripises u runtime lambda f-ji da moze da se zove iz npr. Char tipa. Onda dalje gde koristis lambda f-ju mozes da je
 * zoves iz objekta bilo kog tipa koji si definisao da extenduje, bez da prosledjujes taj tip kao parametar. Zgodno, zar ne?
 */
fun String.customFilterExtension(lambda: Char.() -> Boolean): String{
    return buildString {
        for(char in this@customFilterExtension){
            if(char.lambda()){
                append(char)
            }
        }
    }
}
