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
    /* ketika fungsi sum() dipanggil, maka akan menambahkan parameter 'k' ke sum dari seluruh 
    bilangan yang lebih kecil dari 'k' dan  */
}
