public class Buku {
    private String judul;
    private String penulis;

 
    public Buku() {
        this.judul = "Tidak Diketahui";
        this.penulis = "Tidak Diketahui";
    }

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

  
    public void infoBuku() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}
