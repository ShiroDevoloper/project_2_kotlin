fun main() {
    //mendeklarasikan variable
    var arrayA = arrayOf<Int>()
    arrayA += 34
    println(arrayA[0])//menampilkan array pertama

    //membuat sebuah data range dari 1-10
    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
//        println(arrB)
    }
    //menampilkan data dari range diatas(alasan tidak dibikin didalam looping karena agar menghasilkan array nya)
    for (i in arrB) {
        print("$i ")
    }

}