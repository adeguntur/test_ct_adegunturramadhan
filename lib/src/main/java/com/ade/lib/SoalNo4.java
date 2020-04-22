package com.ade.lib;

import java.util.ArrayList;

public class SoalNo4 {
    public static void main(String[] args) {
        ArrayList<String> kota = new ArrayList<String>();
        // Add the new element
        kota.add("Surabaya");
        kota.add("Jakarta");
        kota.add("Semarang");
        kota.add("Makassar");

        kota.set(2, "Samarinda");

        System.out.println("Output pertama Variable :");

        for (int i = 0; i < kota.size(); i++) {
            System.out.println(kota.get(i));
        }
        System.out.println();
        System.out.println("Output kedua Variable :");

        kota.add("Aceh");
        for (int i = 0; i < kota.size(); i++) {
            System.out.println(kota.get(i));
        }
    }
}
