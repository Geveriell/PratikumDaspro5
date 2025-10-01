package jobsheet5;

import java.util.Scanner;

public class perpustakaan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Perpustakaan Kampus ---");
        System.out.print("Apakah Anda masih memiliki pinjaman buku? (true/false): ");
        boolean adaPinjaman = sc.nextBoolean();

        if (!adaPinjaman) {
            System.out.println("Tidak ada pinjaman buku. Anda dapat mengakses layanan perpustakaan.");
        } else {
            System.out.print("Apakah buku sudah melewati batas waktu pengembalian? (true/false): ");
            boolean terlambat = sc.nextBoolean();

            if (terlambat) {
                System.out.println("Anda masih memiliki buku yang terlambat dikembalikan. Akses layanan ditolak!");
            } else {
                System.out.println("Anda masih memiliki pinjaman, tetapi belum jatuh tempo. Silakan lanjutkan akses layanan.");
            }
        }

        sc.close();
    }
}
