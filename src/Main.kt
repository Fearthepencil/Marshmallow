fun main() {
    /**
     * Postoji type inferencija - Kotlin sam zakljucuje koji je tip podataka dodeljen promenljivoj
     * Mozes eksplicitno da deklarises tip
     * VAL - pseudo konstante su read-only ali su RUNTIME initialized (nisu prave konstante)
     */
    val y: Float = 5f

    /**
     * VAR - klasicne promenljive koje se menjaju
     */
    var name = "Kotlin"

    /**
     * name = 5 bi izazvalo gresku u prevodjenju - zato sto ne mozes da dodelis sad string promenljivoj nesto sto nije string
     */
    name = 5.toString()

    /**
     * Mozes da printujes vrednosti promenljivih bez konkatenacije stringova (promenljiva ce se ponasati kao string)
     */
    println("Vase ime je $name a broj $y")

    /**
     * Citanje sa konzole - input se tretira kao string, ako dobijes nesto drugo moras da KASTUJES
     * Kastovanje se radi putem ugradjenih f-ja kao npr. variable.toInt()
     */
    val input = readln()
    println("Uneli ste $input")

    /**
     * NULLABILITY - obicni tipovi NE MOGU da imaju NULL KAO VREDNOST, po defaultu su NULL-SAFE.
     * Ako je Int null-safe tip, Int? je nullable tip - u ovakav tip se moze upisati vrednost null.
     * Posto npr. input moze biti null, mora se ovde staviti ILI ternarni operator i obicna moduo operacija
     * ILI forceovati da prodje koristeci !! npr: Int? is x!!%2==0 - ovo nije dobro jer tehnicki i dalje moze da bude null
     * pa da baci gresku. Zato koristimo ovde ternarni operator - ako je null dodelice se 0 u x.
     */
    println("Enter a variable to see if it is even")
    val x: Int = readln().toIntOrNull()?:0
    val isEven = x%2==0
    println("The variable you is even: $isEven")

    /**
     * Kotlin f-je imaju NULL-SAFE pozive - f-je ce se pozvati nad vrednoscu SAMO AKO NIJE NULL
     * Postoje f-je umesto vecine operatora - npr. ++ - inc, % -- rem(mod).
     * Poenta ovoga je da ne moras da koristis ternarne operatore pri dodeli kao npr gore
     */
    println("Enter a variable to see if it is even - nullsafe")
    val z: Int? = readln().toIntOrNull()?.inc()
    val isEvenZ = z?.rem(2)
    println("The variable incremented is: $z and it is now even: $isEvenZ")
}