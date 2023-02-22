fun main() {
    names("Kelly","Nelly","Belly","Berry")
    capital()
    loops()
    var x =context("Benita","Kelly","Winnie")
    println(x)

}
fun names(name1: String,name2: String,name3: String,name4: String) {
    var add = arrayOf(name1, name2, name3, name4)
    println(add.contentToString())
}

fun capital(){
    var capitals = arrayOf("harare","mumbai","dodoma","jakarta")
    for (capital in capitals){
        println(capital.capitalize())}
}
fun loops(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun context(nam1: String,nam2: String,nam3: String):String {
    var naming = arrayOf(nam1, nam2, nam3)
    return naming.contentToString()
}


