import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();

        daftarPenerbangan.add(new Penerbangan("EAD123", "SBY", "BDG", "08:00", "10:30", 700.0f));
        daftarPenerbangan.add(new Penerbangan("OOP321", "BDG", "SBY", "12:00", "14:30", 800.0f));

        ArrayList<Penumpang> dataPenumpang = new ArrayList<>();
        ArrayList<Penerbangan> penerbanganDipesan = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("===== EAD Ticket Booking System =====");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Penerbangan:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ".");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    }
                    break;
                case 2:
                        System.out.println(" ");
                        System.out.println("Silahkan isi data diri anda terlebih dahulu!");
                        System.out.println("--------------------------------------------");
                        System.out.print("Masukkan NIK: ");
                        String NIK = sc.nextLine();
                        System.out.print("Masukkan Nama Depan: ");
                        String namaDepan = sc.nextLine();
                        System.out.print("Masukkan Nama Belakang: ");
                        String namaBelakang = sc.nextLine();
                        Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
                        dataPenumpang.add(penumpang);

                        System.out.print("Masukkan nomor penerbangan: ");
                        int noPenerbangan = sc.nextInt() - 1;
                        sc.nextLine();

                        if (noPenerbangan >= 0 && noPenerbangan < daftarPenerbangan.size()) {
                            penerbanganDipesan.add(daftarPenerbangan.get(noPenerbangan));

                            System.out.println("Pesanan tiket berhasil dibuat:");
                            daftarPenerbangan.get(noPenerbangan).tampilDaftarPenerbangan();
                            System.out.println("Penumpang:");
                            penumpang.tampilDaftarPenumpang();
                        } else {
                            System.out.println("Nomor penerbangan tidak ada.");
                        }
                        break;
                        

                case 3:
                    System.out.println("===== Detail Tiket Penerbangan =====");
                    if (dataPenumpang.isEmpty()) {
                        System.out.println("Belum ada tiket yang dipesan.");
                    } else {
                        for (int i = 0; i < dataPenumpang.size(); i++) {
                            System.out.println("Pesanan " + (i + 1) + ":");
                            dataPenumpang.get(i).tampilDaftarPenumpang();
                            penerbanganDipesan.get(i).tampilDaftarPenerbangan();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Tidak ada dalam menu. Silakan pilih menu yang tersedia.");
                    break;
            }
        } while (pilihan != 4);

        sc.close();
    }
}
