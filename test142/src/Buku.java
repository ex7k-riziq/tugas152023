// Class untuk merepresentasikan buku
public class Buku {
    private int id;
    private String judul;
    private String pengarang;
    public boolean tersedia;

    public Buku(int id, String judul, String pengarang) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tersedia = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    
    public void setTersediaya() {
        boolean tersedia = true;
        this.tersedia = tersedia;
    }
    
    public void setTersediatidak(){
        boolean tersedia = false;
        this.tersedia = tersedia;
    }

    public void informasi(){
        System.out.println("ID Buku: " + this.id);
        System.out.println("Judul Buku: " + this.judul);
        System.out.println("Pengarang Buku: " + this.pengarang);
        if (this.tersedia == true){
            System.out.println("Ketersediaan buku: ada");
        } else if (this.tersedia == false){
            System.out.println("Ketersediaan buku: tidak ada");
        }
        System.out.println();
    }
}
