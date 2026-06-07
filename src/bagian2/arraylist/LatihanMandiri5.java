package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri5 {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(10);
        angka.add(25);
        angka.add(8);
        angka.add(42);
        angka.add(17);

        int terbesar = angka.get(0);

        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
    }
}