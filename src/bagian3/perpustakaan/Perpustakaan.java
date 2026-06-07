

package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {

private ArrayList<Buku> koleksi =
        new ArrayList<>();

public void tambahBuku(Buku buku) {
    koleksi.add(buku);
}

public void tampilkanKoleksi() {

    System.out.println(
            "=== KOLEKSI PERPUSTAKAAN ===");

    for (int i = 0;
            i < koleksi.size();
            i++) {

        Buku b = koleksi.get(i);

        System.out.println(
                (i + 1)
                + ". "
                + b.info());
    }
}

public void pinjamBuku(String judul) {

    for (Buku b : koleksi) {

        if (b.getJudul().equals(judul)) {

            if (b.isDipinjam()) {

                System.out.println(
                        judul
                        + " sedang dipinjam.");

            } else {

                b.setDipinjam(true);

                System.out.println(
                        judul
                        + " berhasil dipinjam.");
            }

            return;
        }
    }

    System.out.println(
            "Buku "
            + judul
            + " tidak ditemukan.");
}

public void kembalikanBuku(String judul) {

    for (Buku b : koleksi) {

        if (b.getJudul().equals(judul)) {

            b.setDipinjam(false);

            System.out.println(
                    judul
                    + " telah dikembalikan.");

            return;
        }
    }

    System.out.println(
            "Buku "
            + judul
            + " tidak ditemukan.");
}

public void cariPenulis(String penulis) {

    boolean ditemukan = false;

    System.out.println(
            "=== HASIL PENCARIAN ===");

    for (Buku b : koleksi) {

        if (b.getPenulis()
                .equalsIgnoreCase(
                        penulis)) {

            System.out.println(
                    b.info());

            ditemukan = true;
        }
    }

    if (!ditemukan) {

        System.out.println(
                "Penulis tidak ditemukan.");
    }
}

public int jumlahTersedia() {

    int jumlah = 0;

    for (Buku b : koleksi) {

        if (!b.isDipinjam()) {
            jumlah++;
        }
    }

    return jumlah;
}

}
