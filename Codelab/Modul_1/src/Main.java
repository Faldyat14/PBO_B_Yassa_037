import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int birthYear = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate age
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        // Determine gender
        String genderString;
        if (gender == 'L' || gender == 'l') {
            genderString = "Laki-laki";
        } else if (gender == 'P' || gender == 'p') {
            genderString = "Perempuan";
        } else {
            genderString = "Tidak diketahui";
        }

        // Output data
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + name);
        System.out.println("Jenis Kelamin : " + genderString);
        System.out.println("Umur          : " + age + " tahun");
    }
}
