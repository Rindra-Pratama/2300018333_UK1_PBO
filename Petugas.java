public class Petugas extends Anggota {
    private String shiftKerja;

   
    public Petugas() {
        super("Tidak Diketahui", "Tidak Diketahui");
        this.shiftKerja = "Pagi";
    }

    public Petugas(String nama, String idAnggota, String shiftKerja) {
        super(nama, idAnggota);
        this.shiftKerja = shiftKerja;
    }

  
    public String getShiftKerja() {
        return shiftKerja;
    }

    public void setShiftKerja(String shiftKerja) {
        this.shiftKerja = shiftKerja;
    }


    @Override
    public void infoAnggota() {
        super.infoAnggota();
        System.out.println("Shift Kerja: " + shiftKerja);
    }

   
    public void melayani() {
        System.out.println("Petugas " + getNama() + " sedang melayani.");
    }
}
