/*Return Value atau nilai pengembalian merupakan nilai yang dikembalikan
setelah sebuah method dieksekusi;
untuk mengembalikan nilai methode tersebut harus menggunakan tipe data primitif
seperti (int, char, dll) atau tipe data lainnya selain void.
*/
//contoh penggunaan return value
public class nilaiPengembalian {
    //membuat metode dengan dua parameter X dan y 
    static int myMethod(int x, int y) {
        //mengembalikan nilai dari parameter yang dijumlahkan
        return x + y;
    }
    //membuat void main untuk memanggil methode
    public static void main(String[] args){
        //metohde bisa didefinisikan dengan variabel 
        int z = myMethod(6, 8 );
        //Cetak hasil dari variabel z
        System.out.println(z);
}
}