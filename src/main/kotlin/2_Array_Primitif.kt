fun main(args: Array<String>) {
    //pengunaan aritmatika di sebuah array
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2] //mengubah array bagian index ke 1(0) menjadi varibale 2 tambah variable 3
    x.forEach { print(it.toString() + ' ') } //memanggil array yang ada di variable x kemudian diubah kembali menjadi string
    print('\n')


    // pengunaan byte array
    val byteArray = ByteArray(5) // deklarasi byte array
    byteArray.forEach { print(it.toString() + ' ') } // menamilkan semua array di bytearray
    print('\n')

    //pengunaan Short array
    val shortArray = ShortArray(5) { 42 } //membuat size dengan tipe data short dengan nilai 42 per nilai
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')

    //Penggunaan int array
    var intArray = IntArray(5) { it * 2 }//tak paham
    intArray.forEach { print(it.toString() + ' ') }// perulangan seperti biasa
    print('\n')
}