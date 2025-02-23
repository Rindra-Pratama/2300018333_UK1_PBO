public class Main {
    public static void main(String[] args) {
        
        BukuFiksi bukuFiksi = new BukuFiksi("Harry Potter", "J.K. Rowling", "Fantasy");
        bukuFiksi.infoBuku();

       
        BukuNonFiksi bukuNonFiksi = new BukuNonFiksi("Sejarah Dunia", "John Doe", "Sejarah");
        bukuNonFiksi.infoBuku();


        Petugas petugas = new Petugas("Budi", "P001", "Siang");
        petugas.infoAnggota();
        petugas.melayani();

   
        Buku bukuPoli = new BukuFiksi("The Hobbit", "J.R.R. Tolkien", "Adventure");
        bukuPoli.infoBuku(); 
    }
}
