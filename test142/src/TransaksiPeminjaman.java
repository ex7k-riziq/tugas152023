import java.util.Date;

// Class untuk merepresentasikan transaksi peminjaman buku
public class TransaksiPeminjaman {
    public int id;
    public AnggotaPerpustakaan anggota;
    public Buku buku;
    public Date tanggalPeminjaman;

    public TransaksiPeminjaman(int id, AnggotaPerpustakaan anggota, Buku buku) {
        this.id = id;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPeminjaman = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }

    public void setAnggota(AnggotaPerpustakaan anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }
    
    public void cetak(){
        System.out.println("ID Transaksi: " + this.id);
        System.out.println("Nama peminjam: " + this.anggota.getNama());
        System.out.println("Judul buku: " + this.buku.getJudul());
        System.out.println("Tanggal peminjaman: " + this.tanggalPeminjaman);
        System.out.println();
    }
}

