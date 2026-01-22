
fun main(){
    val y = readln().toIntOrNull()?.inc()?.dec()
    val isEven = y?.rem(2) == 0
    //you can use ifs as conditions
    val output = if(isEven){
        "even"
    } else {
        "odd"
    }
    println("The number you entered is: $output")
}


fun var_decider(){

}
