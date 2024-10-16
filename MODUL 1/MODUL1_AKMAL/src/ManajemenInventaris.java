// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.Scanner;
import java.util.ArrayList;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Nama makanan: ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah: ");
        int jumlah = scanner.nextInt();
        System.out.print("Harga Makanan: ");
        double harga = scanner.nextDouble();
        System.out.print("Brand Makanan: ");
        String brand = scanner.nextLine();
        // Todo : Create a new object for MakananKering
        MakananKering mkering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(mkering);
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan");
        scanner.close();
    }

    public void tambahMakananBasah() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Nama makanan: ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Harga Makanan: ");
        double harga = scanner.nextDouble();
        System.out.print("Bahan Makanan: ");
        String bahan = scanner.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah mbasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(mbasah);
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan basah berhasil ditambahkan");
        scanner.close();
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering i : daftarMakananKering) {
                i.ShowData();
            }
            }
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah x : daftarMakananBasah) {
                x.ShowData();
            }
            }
        }
    

