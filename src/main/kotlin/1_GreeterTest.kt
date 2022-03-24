fun main() {
    val `1Greeter` = `1_Greeter`()
    `1Greeter`.greet()
    `1Greeter`.text = "Hi"
    `1Greeter`.greet("Anton")
    `1Greeter`.greet("Budi")
    `1Greeter`.text = "Hello programmer"
    println(`1Greeter`.with_ret_val("Dono"))
}