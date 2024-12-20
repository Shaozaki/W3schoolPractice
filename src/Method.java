public class Method {
    // Method adalah baris kode yang hanya bekerja ketika dipanggil.
    // Kita bisa meneruskan suatu data yang dikenal sebagai parameter ke dalam method.
    
    // Deklarasi method dimulai dengan kata kunci 'public' yang berarti method ini bisa diakses dari mana saja.
    public
    
    // Kata kunci 'static' berarti method ini milik kelas dan bisa dipanggil tanpa membuat objek dari kelas tersebut.
    static
    
    // Kata kunci 'void' berarti method ini tidak mengembalikan nilai apapun.
    void
    
    // 'myMethode()' adalah nama method. Nama ini bisa kita gunakan untuk memanggil method ini.
    myMethode()
    {
        // Baris ini mencetak teks "Mama AKu Lapar" ke layar.
        System.out.println("Mama AKu Lapar");
    }
    
    // Method 'main' adalah titik masuk dari program Java. Program akan mulai berjalan dari sini.
    public static void main(String[] args) {
        // Memanggil method 'myMethode' tiga kali.
        myMethode();
        myMethode();
        myMethode();
    }
}