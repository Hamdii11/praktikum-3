//Inisialisasi sintaks getter dan setter di Kotlin bersifat opsional, karena secara sefault Kotlin telah
//men-generate method getter dan setter untuk property yang mutable (var) dan hanya getter
//untuk property yang read-only (val). Secara default kode yang ter-generate secara otomatis
//tersebut adalah seperti pada contoh berikut :
class Employee(_id: Int, _name: String, _age: Int){
    val id: Int = _id
        get() = field
    var name: String = _name
        get() = field
        set(value) {
            field
        }
    var age: Int =_age
        get() = field
        set(value) {
            field = value

        }
}

fun main(){
    val emp = Employee(1101, "Hamdi",20)
    println("id: ${emp.id}, Nama: ${emp.name}, umur : ${emp.age}")
}