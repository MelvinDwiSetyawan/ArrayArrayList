package tugas;

// Nama : Melvin Dwi Styawan
// NPM  : 2410010550

public class MainTugas {

public static void main(String[] args) {

    // Array mata kuliah
    String[] mataKuliah = {
        "Pemrograman Java",
        "Basis Data",
        "Jaringan Komputer"
    };

    System.out.println("=== DAFTAR MATA KULIAH ===");

    for (String mk : mataKuliah) {
        System.out.println(mk);
    }

    System.out.println();

    // Membuat objek KelasKuliah
    KelasKuliah kelas = new KelasKuliah();

    // Menambahkan minimal 5 mahasiswa
    kelas.tambahMahasiswa(
            new Mahasiswa(
                    "Andi",
                    "2410010001",
                    80));

    kelas.tambahMahasiswa(
            new Mahasiswa(
                    "Budi",
                    "2410010002",
                    55));

    kelas.tambahMahasiswa(
            new Mahasiswa(
                    "Citra",
                    "2410010003",
                    90));

    kelas.tambahMahasiswa(
            new Mahasiswa(
                    "Doni",
                    "2410010004",
                    70));

    kelas.tambahMahasiswa(
            new Mahasiswa(
                    "Eka",
                    "2410010005",
                    40));

    System.out.println("=== DATA MAHASISWA ===");
    kelas.tampilkanSemua();

    System.out.println();

    System.out.println(
            "Rata-rata nilai : "
            + kelas.hitungRataRata());

    System.out.println(
            "Jumlah mahasiswa lulus : "
            + kelas.jumlahLulus());

    System.out.println();

    // Menambah 1 mahasiswa baru
    kelas.tambahMahasiswa(
            new Mahasiswa(
                    "Fajar",
                    "2410010006",
                    85));

    System.out.println(
            "Jumlah mahasiswa terbaru : "
            + kelas.jumlahMahasiswa());
}

}
