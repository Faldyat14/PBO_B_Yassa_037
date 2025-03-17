//Mendefinisikan class RekeningBank
public class RekeningBank {
    //Deklarasi variabel private untuk menyimpan informasi rekening
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;
    //menginisialisasi objek RekeningBank
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    //Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Saldo         : Rp" + saldo);
        System.out.println();
    }
    //Method untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }
    //Method untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        //Mengecek apakah saldo mencukupi untuk penarikan
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}