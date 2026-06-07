/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> nilai = new ArrayList<>();

        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);

        int max = nilai.get(0);

        for (int n : nilai) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Nilai terbesar : " + max);
    }
}
