public class Main {
    public static void main(String[] args) {
        // Instansiasi objek BukuFiksi
        BukuFiksi bukuFiksi = new BukuFiksi("Harry Potter", "J.K. Rowling", "Fantasy");
        bukuFiksi.infoBuku();

        // Instansiasi objek BukuNonFiksi
        BukuNonFiksi bukuNonFiksi = new BukuNonFiksi("Sejarah Dunia", "John Doe", "Sejarah");
        bukuNonFiksi.infoBuku();

        // Instansiasi objek Petugas
        Petugas petugas = new Petugas("Budi", "P001", "Siang");
        petugas.infoAnggota();
        petugas.melayani();

        // Polymorphism - Menggunakan referensi Buku
        Buku bukuPoli = new BukuFiksi("The Hobbit", "J.R.R. Tolkien", "Adventure");
        bukuPoli.infoBuku(); // Memanggil method override dari BukuFiksi
    }
}
