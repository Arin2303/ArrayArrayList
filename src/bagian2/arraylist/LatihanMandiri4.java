package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri4 {
    public static void main(String[] args) {

        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        daftarBelanja.remove(1); // menghapus item ke-2 (Gula)

        System.out.println("Isi daftar belanja:");

        for (String item : daftarBelanja) {
            System.out.println(item);
        }

        System.out.println("Jumlah item akhir: " + daftarBelanja.size());
    }
}