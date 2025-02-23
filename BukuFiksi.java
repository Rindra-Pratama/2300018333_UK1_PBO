public class BukuFiksi extends Buku {
    private String genre;

   
    public BukuFiksi() {
        super(); 
        this.genre = "Fiksi Umum";
    }

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis); 
        this.genre = genre;
    }

   
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

   
    @Override
    public void infoBuku() {
        super.infoBuku(); 
        System.out.println("Genre: " + genre);
    }
}
