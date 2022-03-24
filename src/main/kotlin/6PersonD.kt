//Konstruktor tambahan (secondary constructor) didefenisikan didalam tubuh kelas. Jika property
//kelas tidak diinisialisasi pada saat mendeklarasikannya maka property tersebut harus di
//inisialisasi didalam konstruktor tambahan atau blok inisialisasi. Konstruktor tambahan
//memerlukan keyword constructor untuk mendefenisikannya. Selain itu konstruktor tambahan
//boleh tidak memiliki tubuh kelas dalam pendefenisiannya. Berikut contoh kode program kelas
//Person yang memiliki konstruktor tambahan tapi tidak memiliki konstruktor utama
class PersonD {
    var firstName: String
    var lastName : String
    var age : Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }

}
fun main(){
    val budi = PersonD("Budi", "Gunawan", 21)
    println("Name: ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}