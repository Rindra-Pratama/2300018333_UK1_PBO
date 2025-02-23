public class BukuNonFiksi extends Buku {
    private String bidang;


    public BukuNonFiksi() {
        super(); 
        this.bidang = "Tidak Diketahui";
    }

    public BukuNonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis); 
        this.bidang = bidang;
    }

   
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

   
    @Override
    public void infoBuku() {
        super.infoBuku(); 
        System.out.println("Bidang: " + bidang);
    }
}
