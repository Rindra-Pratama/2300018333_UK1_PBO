public class BukuFiksi extends Buku {
    private String genre;

    // Constructor overloading
    public BukuFiksi() {
        super(); // Memanggil constructor dari kelas induk
        this.genre = "Fiksi Umum";
    }

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis); // Memanggil constructor dari kelas induk dengan parameter
        this.genre = genre;
    }

    // Getter dan Setter
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Overriding method
    @Override
    public void infoBuku() {
        super.infoBuku(); // Memanggil method dari kelas induk
        System.out.println("Genre: " + genre);
    }
}
