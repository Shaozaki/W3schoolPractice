/* Methode overload berarti sebuah methode bisa punya nama yang sama
 * asalkan memliki parameter yang berbeda 
 * methode overload biasanya digunakan untuk mempermudah kode untuk dibaca
 * dan dipelihara 
 * seperti contoh dibawah ini
 */
public class MetodOverload {
    static int tambah(int x, int y) {
        return x + y;
    }

    static float tambah(float x, float y) {
        return x + y;
    }

    static double tambah(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int nomorku1 = tambah(3, 9);
        float nomorku2 = tambah(4, 9);
        double nomorku3 = tambah(7.1, 9.5);

        System.out.println("Integer : " + nomorku1);
        System.out.println("float : " + nomorku2);
        System.out.println("Double : " + nomorku3);
    }
}
