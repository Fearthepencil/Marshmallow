

fun main(){

    /**
     * Defining an array - postoje f-je za definisanje niza kao sto je:
     * intArrayOf. Ako probas da printujes samo ime niza, dobices adresu na kojoj je pocetak niza
     * Elementima niza se pristupa normalno, nista cudno. Ako probas index koji je preko velicine niza:
     * ArrayIndexOutOfBoundsException
     */
    val numbers = intArrayOf(5,17,69,420,13)
    println("This array starts at address: $numbers")
    print("Enter an index of the array you want to read: ")

    var input = 0
    try{
        input = readln().toInt()
    } catch (e: NumberFormatException){
        println("You have not entered an int ${e.message}")
    }
    try {
        val getFromArray = numbers[input]
        println("The element is: $getFromArray")
    } catch (e: IndexOutOfBoundsException){
        println("This array is out of bounds ${e.message}")
    }



}