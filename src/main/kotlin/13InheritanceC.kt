//Kotlin membutuhkan eksplisit akses modifier untuk meng-override fungsi pada kelas induk yaitu
//akses modifier open.
//Contoh kode program :
open class Teacher{
    open fun teach(){
        println("Teaching...")
    }
        fun info(){
            println("I'am a Teacher.")
    }
}

class MathsTeacher : Teacher(){
    override fun teach() {
        println("Teaching Maths...")
    }
}
fun main(){
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.info()
    mathsTeacher.teach()
}