public class BukuNonFiksi extends Buku {
    private String bidang;

    // Constructor overloading
    public BukuNonFiksi() {
        super(); // Memanggil constructor dari kelas induk
        this.bidang = "Tidak Diketahui";
    }

    public BukuNonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis); // Memanggil constructor dari kelas induk
        this.bidang = bidang;
    }

    // Getter dan Setter
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // Overriding method
    @Override
    public void infoBuku() {
        super.infoBuku(); // Memanggil method dari kelas induk
        System.out.println("Bidang: " + bidang);
    }
}
