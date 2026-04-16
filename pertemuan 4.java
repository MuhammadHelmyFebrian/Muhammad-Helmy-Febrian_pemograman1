import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String programStudi;

    Mahasiswa(String nama, String nim, String programStudi) {
        this.nama = nama;
        this.nim = nim;
        this.programStudi = programStudi;
    }
}

public class DataMahasiswa {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            ArrayList<Mahasiswa> daftar = new ArrayList<>();
            char ulang;

            do {
                System.out.println("=== Form Data Mahasiswa ===");

                System.out.print("Input Nama          : ");
                String nama = input.nextLine();

                System.out.print("Input NIM           : ");
                String nim = input.nextLine();

                System.out.print("Input Program Studi : ");
                String programStudi = input.nextLine();

                // Simpan ke list
                daftar.add(new Mahasiswa(nama, nim, programStudi));

                System.out.print("\nInput data lagi? (y/n): ");
                ulang = input.nextLine().charAt(0);

            } while (ulang == 'y' || ulang == 'Y');

            // Tampilkan semua data
            System.out.println("\n===== DAFTAR MAHASISWA =====");
            for (int i = 0; i < daftar.size(); i++) {
                Mahasiswa m = daftar.get(i);
                System.out.println("--------------------------");
                System.out.println("Data ke-" + (i + 1));
                System.out.println("Nama          : " + m.nama);
                System.out.println("NIM           : " + m.nim);
                System.out.println("Program Studi : " + m.programStudi);
            }
            System.out.println("--------------------------");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat input data.");
        }
    }
}