package com.ade.lib;

public class SoalNo3 {
    public static void main(String[] args) {
        String nama = "Ade Guntur Ramadhan";
        String developer = nama + " CrOssTechno Developer";
        System.out.println(developer);
        String replaceString = developer.replace('o','A');
        String replaceString2 = replaceString.replace('O','A');
        System.out.println(replaceString2);
    }
}
