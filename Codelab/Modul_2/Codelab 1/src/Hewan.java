//Kelas Hewan
class Hewan {

    String nama;
    String jenis;
    String suara;

    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }
    //Command untuk menampilkan informasi Hewan
    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Suara : " + suara);
        System.out.println();
    }
}