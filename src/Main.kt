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
     * NULLABILITY -
     */
}