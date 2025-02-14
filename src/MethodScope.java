/*
 Methode scope merupakan batasan sebuah kode untuk mengakses sebuah variabel pada program java
 mulai dari baris pertama dari variabel dideklarasikan dan seterusnya
 
 */
public class MethodScope {
 public static void main(String[] args) {
    // kode disini tidak bisa memakai variabel variabel X
    
    int X = 100;

    // kode disini bisa memakai variabel X


    System.out.println(X);
    /*
    Block Scope merupakan batas penggunaan variabel yang diantara kurung kurawal {}
    block scope biasanya digunakan pada Statement if, while, for dll.
     */

     //kode disini tidak bisa memakai variabel s

    {// merupakan block

        // kode disini tidak bisa memakai variabel s
        int s = 200;

        // kode disini bisa memkai variabel s
        System.out.println(s);
    }

    // kode disini tidak bisa memakai variabel s

 }
}
