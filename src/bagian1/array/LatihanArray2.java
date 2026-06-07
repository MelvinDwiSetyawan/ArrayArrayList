/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

public class LatihanArray2 {
    public static void main(String[] args) {

        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
    }
}