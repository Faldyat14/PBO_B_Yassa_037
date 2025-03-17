//Mendefinisikan class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        //Membuat objek rekening pertama dengan saldo awal Rp500.000
        RekeningBank rekening1 = new RekeningBank("202410370110058", "Fauzan", 500000.0);
        //Membuat objek rekening kedua dengan saldo awal Rp1.000.000
        RekeningBank rekening2 = new RekeningBank("202410370110047", "Abi", 1000000.0);
        // Menampilkan informasi rekening pertama dan kedua
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
        //Menyetor uang ke rekening pertama sebesar Rp200.000
        rekening1.setorUang(200000.0);
        //Menyetor uang ke rekening kedua sebesar Rp500.000
        rekening2.setorUang(500000.0);
        //Menarik uang dari rekening pertama sebesar Rp800.000
        rekening1.tarikUang(800000.0);
        //Menarik uang dari rekening kedua sebesar Rp300.000
        rekening2.tarikUang(300000.0);
        //Menampilkan kembali informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}