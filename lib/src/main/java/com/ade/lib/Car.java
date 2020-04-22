package com.ade.lib;

public class Car extends Vehicle{

    // Soal No 6

    private String merk = "BMW";
    private String tahunPembuatan = "2020";
    private String nomorRangka = "Te7-E-KB6-nh700M-l";

    private void getOutputCar(){
        System.out.print(", Merk: "+merk + ", Tahun Pembuatan : "+tahunPembuatan + ", Nomor Rangka : "+nomorRangka);
    }

    private void getOutputCarUpperCase(){
        System.out.print(", Merk : "+merk.toUpperCase() + ", Tahun Pembuatan : "+tahunPembuatan.toUpperCase() + ", Nomor Rangka : "+nomorRangka.toUpperCase());
    }

    public static void main(String[] args) {
        Car myFastCar = new Car();
        System.out.println("Output Pertama :");
        myFastCar.getOutputVehicle();
        myFastCar.getOutputCar();

        System.out.println();
        System.out.println();
        System.out.println("Output Kedua (UpperCase) :");
        myFastCar.getOutputVehicleUpperCase();
        myFastCar.getOutputCarUpperCase();
    }

}
