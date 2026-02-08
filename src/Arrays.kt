

fun main(){

    /**
     * Defining an array - postoje f-je za definisanje niza kao sto je:
     * intArrayOf. Ako probas da printujes samo ime niza, dobices adresu na kojoj je pocetak niza
     * Elementima niza se pristupa normalno, nista cudno. Ako probas index koji je preko velicine niza:
     * ArrayIndexOutOfBoundsException. Velicina niza se dobija koristeci niz.size
     * Ovo je staticka alokacija niza - ovaj niz se NE MOZE DINAMICKI RESIZE-OVATI, iako mozes promeniti njegove elemente
     */
    val numbers = intArrayOf(5,17,69,420,13)
    println("This array starts at address: $numbers")
    print("Enter an index of the array you want to read: ")

    val input = readln().toIntOrNull()

    /**
     * Mozes da iskoristis index in/ !in array.indices da proveris da li je index u nizu
     */
    val getFromArray =
        when {
            input == null -> "you have not entered an int"
            input !in numbers.indices -> {"array index $input out of bounds - size is ${numbers.size}"}
            else -> numbers[input]
        }
    println("The result you got is: $getFromArray")

    /**
     * Petlje - postoje klasicne for i while. While sintaksa je normalna - nista specijalno. Postoje kljucne reci
     * break i continue - znas koja sta radi
     */
    println("Enter numbers to sum, if you want to stop enter -1")
    var sum = 0
    while(true){
        val input2 = readln().toIntOrNull()
        if(input2==null){
            println("This is not a number, please enter a number")
            continue
        }
        if(input2==-1) break
        sum+=input2
        println("Current sum is: $sum")
    }
    println("Total sum is: $sum")

    /**
     * Dinamicki nizovi - Mutable Lists. Definisu se kao array isto, samo moras da dodas tip - mutableListOf<DataType>().
     * Liste mogu da se printuju kao println("Lista: $list")
     */
    println("Napravi svoj niz, mozes kolko oces elemenata")
    val niz = mutableListOf<Int>()
    while(true){
        println("Unesi novi element, -1 ako zelis da prestanes")
        val number = readln().toIntOrNull()
        when(number){
            null -> { println("Nisi uneo int, los korisnik, popravi!")
                    continue }
            -1 -> { println("Kraj unosa")
                    break }
            else -> niz.add(number)
        }
    }
    println("Vasa lista je $niz")

}