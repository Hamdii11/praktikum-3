//Selama pembuatan sebuah instance baru dari kelas turunan, inisialisasi kelas induk diselesaikan
//terlebih dahulu pada langkah pertama (hanya mendahulukan evaluasi dari argument untuk
//konstruktor kelas induk) dan demikian terjadi sebelum inisialisasi logika dari kelas turunan yang
//berjalan.
//Contoh kode program :
open class Base (val name : String){
    init {
        println("initializing Base")
    }
    open val size : Int = name.length.also{
        println("initializing size in Base: $it")
    }
}
class Derived(name: String, val lastName:String) :
        Base(name.capitalize().also { println("Argumen For Base: $it") }) {
    init {
        println("initializing Derived")
    }

    override val size: Int = (super.size + lastName.length).also {
        println("initializing size in Derived : $it")
    }
}

fun main() {
    val turunan = Derived ("Kurniawan", "Hamdi")
    turunan.size
}
