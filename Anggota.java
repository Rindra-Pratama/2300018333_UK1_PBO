public class Anggota {
    private String nama;
    private String idAnggota;

    // Constructor
    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    // Method
    public void infoAnggota() {
        System.out.println("Nama: "+ nama +", ID Anggota: " + idAnggota);
    }
}
