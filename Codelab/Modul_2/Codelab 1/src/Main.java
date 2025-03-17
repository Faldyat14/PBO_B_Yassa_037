// Kelas utama untuk menjalankan perintah
public class Main {
    public static void main(String[] args) {
        // Membuat perintah
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Menjalankan perintah
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
