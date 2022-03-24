//Membuat kelas parent dan child
//Secara default semua kelas di Kotlin memiliki akses modifier final, artinya tidak dapat di
//wariskan. Agar dapat diwariskan ke kelas anak, kelas induk harus memiliki akses modifier open.
//Namun kelas anak memiliki tanggung jawab untuk menginisialisasi kelas induknya. Jika kelas
//anak memiliki sebuah primary constructor, maka ia harus menginisialisasi kelas induknya di
//bagian kanan kelas header dengan melewatkan parameter ke primary constructor nya.
//Berikut adalah contoh kode program :
open class computer(val name: String, val brand: String)

class Laptop (name: String, brand: String, val batteryLife: Double) : computer( name, brand){
    fun info (){
        println("Name: $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")

    }
}

fun main(){
    val myLaptop = Laptop ("Acer Aspire 4783", "Acer", 2.5)
    println(myLaptop.info())

}