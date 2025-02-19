/*
 * Recursion merupakan teknik yang membuat sebuah fungsi memanggil dirinya sendiri. Teknik ini menyediakan 
 * jalan untuk menyelesaikan masalah rumit menjadi lebih mudah untuk diselesaikan.
 */
public class recursion {
    // contoh recursion
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    /*
     * ketika fungsi sum() dipanggil, maka akan menambahkan parameter 'k' ke sum
     * dari seluruh bilangan yang lebih kecil dari 'k' dan return ke result.
     * ketika program akan mengikuti tahap berikut :
     * 10 + sum(9)
     * 10 + ( 9 + sum(8) )
     * 10 + ( 9 + ( 8 + sum(7) ) )
     * ...
     * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
     * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
     * fungsi berhenti memanggil dirinya sendiri sejak 'k' adalah 0, program berhenti disitu dan returns result.
     */

     
}
