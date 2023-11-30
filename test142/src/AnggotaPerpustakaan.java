
import java.util.ArrayList;
import java.util.List;

// Class untuk merepresentasikan anggota perpustakaan
class AnggotaPerpustakaan {
    private int id;
    private String nama;
    private String alamat;
    private Buku pinjambuku;

    public AnggotaPerpustakaan(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Buku getPinjambuku() {
        return pinjambuku;
    }

    public void pinjam(Buku buku) {
        if(this.pinjambuku != buku && buku.tersedia == true){
            this.pinjambuku = buku;
            buku.setTersediatidak();
            System.out.println("Buku " + buku.getJudul() + " dipinjam.");
            System.out.println();
        } else if (buku.tersedia == false){
            System.out.println("Buku tidak tersedia");
            System.out.println();
        } else {
            System.out.println("Kesalahan");
            System.out.println();
        }
    }

    public void kembali(Buku buku){
        this.pinjambuku = null;
        buku.setTersediaya();
        System.out.println("Buku " + buku.getJudul() + " dikembalikan.");
        System.out.println();
    }
    
    public void informasi(){
        System.out.println("ID Anggota: " + this.id);
        System.out.println("Nama Anggota: " + this.nama);
        System.out.println("Alamat Anggota: " + this.alamat);
        if(this.pinjambuku == null){
            System.out.println("Buku yang dipinjam: tidak ada");
        }else{
            System.out.println("Buku yang dipinjam: " + this.pinjambuku.getJudul());
        }
        System.out.println();
    }
}
