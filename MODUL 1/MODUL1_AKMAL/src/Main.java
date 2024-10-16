// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris inventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        // Todo : Create Loop list menu
        int pilihan = 0;
        while (pilihan !=4) {
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");

            System.out.print("Pilih Menu: ");
            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    inventaris.tambahMakananKering();

                case 2:
                    inventaris.tambahMakananBasah();

                case 3:
                    inventaris.tampilkanSemuaMakanan();
                case 4:
                    System.out.println("Keluar dari program");
                    break;
            
            
            }
            
        scanner.close();    
        }
    }
}
