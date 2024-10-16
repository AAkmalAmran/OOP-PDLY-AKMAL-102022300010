// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;
    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }

    // Todo : Create Getter and Setter
    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    } 

    public String getBahan() {
        return bahan;
    }
    // Todo : Create Method ShowData
    public void ShowData(){
        System.out.println("Nama: "+ nama);
        System.out.println("Jumlah: "+ jumlah);
        System.out.println("Harga: "+ harga);
        System.out.println("Bahan: "+ bahan);
    }

}
