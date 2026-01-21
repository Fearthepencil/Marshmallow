
fun main(){
    val name: String = "kurac"
    var var_name: String = "promenljivo"
    var_name = "kurcina"
    val flag: Boolean = false
    println("Just learned a better way to print $name $var_name $flag")
    val x:Float = 4F
    println(x)
    print("Input a number so I can tell you if it is even: ")
    //Safe - works
    val y = readln().toIntOrNull()?.inc()
    val isEven = y?.rem(2) == 0
    println("Even? $isEven")
}

fun var_decider(){

}
