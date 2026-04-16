import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            char ulang;

            do {
                System.out.println("=== Form Data Mahasiswa ===");

                // Input + validasi sederhana
                String nama;
                do {
                    System.out.print("Input Nama          : ");
                    nama = input.nextLine();
                } while (nama.isEmpty());

                String nim;
                do {
                    System.out.print("Input NIM           : ");
                    nim = input.nextLine();
                } while (nim.isEmpty());

                System.out.print("Input Program Studi : ");
                String programStudi = input.nextLine();

                // Output
                System.out.println("\n--------------------------");
                System.out.println(" HASIL DATA MAHASISWA ");
                System.out.println("--------------------------");
                System.out.printf("Nama          : %s%n", nama.toUpperCase());
                System.out.printf("NIM           : %s%n", nim);
                System.out.printf("Program Studi : %s%n", programStudi);
                System.out.println("--------------------------");

                // Tanya ulang
                System.out.print("\nInput data lagi? (y/n): ");
                ulang = input.nextLine().charAt(0);

            } while (ulang == 'y' || ulang == 'Y');

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat input data.");
        }
    }
}