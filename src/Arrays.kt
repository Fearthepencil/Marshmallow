

fun main(){

    /**
     * Defining an array - postoje f-je za definisanje niza kao sto je:
     * intArrayOf. Ako probas da printujes samo ime niza, dobices adresu na kojoj je pocetak niza
     * Elementima niza se pristupa normalno, nista cudno. Ako probas index koji je preko velicine niza:
     * ArrayIndexOutOfBoundsException. Velicina niza se dobija koristeci niz.size
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



}