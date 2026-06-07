package tugas;

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("=== Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "231003", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "231004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "231005", 50));

        System.out.println();
        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus: " + kelas.jumlahLulus());

        kelas.tambahMahasiswa(
            new Mahasiswa("Fajar", "231006", 85)
        );

        System.out.println();
        System.out.println(
            "Jumlah data terbaru: " +
            kelas.jumlahMahasiswa()
        );
    }
}