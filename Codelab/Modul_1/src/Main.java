import java.util.Scanner;
class Biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur
        int tahunSekarang = java.time.Year.now().getValue();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminStr = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Output hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminStr);
        System.out.println("Umur          : " + umur + " tahun");

        scanner.close();
    }
}
