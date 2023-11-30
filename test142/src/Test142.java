import java.util.ArrayList;
import java.util.Date;

// Main class sebagai entry point
public class Test142 {
    public static void main(String[] args) {
        // Contoh penggunaan kelas-kelas dalam program perpustakaan
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan(1, "John Doe", "Jl. Contoh No. 123");
        AnggotaPerpustakaan anggota2 =  new AnggotaPerpustakaan(2, "Magnus Charta", "Enting");
        
        Buku buku1 = new Buku(101, "Java Programming", "Jane Smith");
        Buku buku2 = new Buku(102, "Kamus Istilah Gaming", "Ita");

        TransaksiPeminjaman tpinjam1 = new TransaksiPeminjaman(1, anggota1, buku1);
        TransaksiPengembalian tkembali1 = new TransaksiPengembalian(1, tpinjam1);
        
        anggota1.informasi();
        buku1.informasi();
        anggota1.pinjam(buku1);
        tpinjam1.cetak();
        anggota1.informasi();
        buku1.informasi();
        
        anggota2.pinjam(buku1);
        anggota2.informasi();
        
        anggota1.kembali(buku1);
        tkembali1.cetak();
    }
}