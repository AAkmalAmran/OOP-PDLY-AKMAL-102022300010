public class Main {
    public static void main(String[] args) throws Exception {
        Hewan hwkc = new Hewan("Doraemon", 3);
        Kucing kc = new Kucing("Doraemon", 3, "Persia");

        Hewan hwbr = new Hewan("Loid", 1);
        Burung br = new Burung("Loid", 1, "Putih");

        System.out.println("Detail Hewan");
        System.out.println(" ");

        System.out.println("Ini adalah " + kc.getNama() + "!");
        kc.suara();
        System.out.println(hwkc.makan());
        System.out.println(hwkc.makan("ikan"));

        System.out.println(" ");

        System.out.println("Ini adalah " + br.getNama() + "!");
        br.suara();
        System.out.println(hwbr.makan());
        System.out.println(hwbr.makan("Biji-bijian"));

        System.out.println(" ");

        kc.infoHewan();
        br.infoHewan();
    }
}
