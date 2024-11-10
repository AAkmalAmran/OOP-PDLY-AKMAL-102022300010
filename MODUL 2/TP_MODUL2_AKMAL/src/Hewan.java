public class Hewan {

    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void suara() {
        return;
    }

    public String nama() {
        return "Tidak diketahui";
    }

    public String makan() {
        return nama + " sedang makan";
    }

    public String makan(String Makanan) {
        return nama + " Memakan " + Makanan + ".";
    }

    public void infoHewan() {
        return;
    }
}
