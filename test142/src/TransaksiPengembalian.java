import java.util.Date;

// Class untuk merepresentasikan transaksi pengembalian buku
class TransaksiPengembalian {
    public int id;
    public TransaksiPeminjaman transaksiPeminjaman;
    public Date tanggalPengembalian;

    public TransaksiPengembalian(int id, TransaksiPeminjaman transaksiPeminjaman) {
        this.id = id;
        this.transaksiPeminjaman = transaksiPeminjaman;
        this.tanggalPengembalian = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TransaksiPeminjaman getTransaksiPeminjaman() {
        return transaksiPeminjaman;
    }

    public void setTransaksiPeminjaman(TransaksiPeminjaman transaksiPeminjaman) {
        this.transaksiPeminjaman = transaksiPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void cetak(){
        System.out.println("ID Transaksi: " + this.id);
        System.out.println("Nama peminjam: " + transaksiPeminjaman.anggota.getNama());
        System.out.println("Judul buku: " + transaksiPeminjaman.buku.getJudul());
        System.out.println("Tanggal peminjaman: " + transaksiPeminjaman.tanggalPeminjaman);
        System.out.println("Tanggal pengembalian: " + this.tanggalPengembalian);
        System.out.println();
    }
}