public class Album {
    private String albumName;
    private String artist;
    private int total;
    private int available;
    private int rented;

    public Album(String albumName, String artist, int total, int available, int rented) {
        this.albumName = albumName;
        this.artist = artist;
        this.total = total;
        this.available = available;
        this.rented = rented;
    };

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setRented(int rented) {
        this.rented = rented;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public int getTotal() {
        return total;
    }

    public int getAvailable() {
        return available;
    }

    public int getRented() {
        return rented;
    }

}
