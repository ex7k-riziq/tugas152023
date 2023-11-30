// Class untuk merepresentasikan notifikasi
public class Notifikasi {
    private int id;
    private String pesan;

    public Notifikasi(int id, String pesan) {
        this.id = id;
        this.pesan = pesan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    
}