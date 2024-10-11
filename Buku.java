public class Buku {
    private String judul;
    private String penulis;

    // Constructor overloading
    public Buku() {
        this.judul = "Tidak Diketahui";
        this.penulis = "Tidak Diketahui";
    }

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Getter dan Setter
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

    // Method yang bisa di-override
    public void infoBuku() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}
