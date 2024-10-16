// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;
    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
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

    public String getBrand() {
        return brand;
    }
    // Todo : Create Method ShowData
    public void ShowData(){
        System.out.println("Nama: "+ nama);
        System.out.println("Jumlah: "+ jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("Brand: "+ brand);
    }
}
