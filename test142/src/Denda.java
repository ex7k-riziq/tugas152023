import java.util.Date;

public class Denda {
    public String idanggotad;
    public String judulbukud;
    public Date tanggalkembalid;
    public Date tanggalpinjamd;

    public Denda(AnggotaPerpustakaan anggota, Buku buku, TransaksiPeminjaman pinjam, TransaksiPengembalian kembali) {
        this.idanggotad = anggota.getNama();
        this.judulbukud = buku.getJudul();
        this.tanggalkembalid = pinjam.tanggalPeminjaman;
        this.tanggalpinjamd = kembali.tanggalPengembalian;
    }

    public String getIdanggotad() {
        return idanggotad;
    }

    public void setIdanggotad(String idanggotad) {
        this.idanggotad = idanggotad;
    }

    public String getJudulbukud() {
        return judulbukud;
    }

    public void setJudulbukud(String judulbukud) {
        this.judulbukud = judulbukud;
    }

    public Date getTanggalkembalid() {
        return tanggalkembalid;
    }

    public void setTanggalkembalid(Date tanggalkembalid) {
        this.tanggalkembalid = tanggalkembalid;
    }

    public Date getTanggalpinjamd() {
        return tanggalpinjamd;
    }

    public void setTanggalpinjamd(Date tanggalpinjamd) {
        this.tanggalpinjamd = tanggalpinjamd;
    }
    
    public void informasi(){
        System.out.println("Anggota didenda: " + this.idanggotad);
        System.out.println("Buku yang di'tahan': " + this.judulbukud);
        System.out.println("Tanggal pinjam: " + this.tanggalpinjamd);
        System.out.println("Tanggal pengembalian seharusnya: " + this.tanggalkembalid);
        System.out.println();
    }
}
