//Untuk lebih meringkas kode program kelas Person diatas maka kita dapat menggabungkan
//proses deklarasi dan menginisialisasi sebuah variabel pada blok inisialisasi kedalam satu
//statement seperti berikut:
class PersonB (_firstName: String, _lastName: String, _age: Int){
    var firsName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

fun main(){
    val budi = PersonB("budi", "Gunawan", 21)
    println("name : ${budi.firsName} ${budi.lastName}")
    println("Age : ${budi.age}")
}