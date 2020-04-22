package com.ade.lib;

public class SoalNo5 {

    public static class Vehicle {

        String namaMobil = "";
        String kapasitasMesin = "";
        String roda = "";

        //constructor
        private Vehicle(String namaMobil,String kapasitasMesin ,String roda){
            this.namaMobil = namaMobil;
            this.kapasitasMesin = kapasitasMesin;
            this.roda = roda;
        }

        private void getOutputPertama(){
            System.out.println("Nama Mobil : "+this.namaMobil + ", Kapasitas Mesin : "+this.kapasitasMesin + ", Roda : "+this.roda);
        }

        private void getOutputUpperCase(){
            System.out.println("Nama Mobil : "+this.namaMobil.toUpperCase() + ", Kapasitas Mesin : "+this.kapasitasMesin.toUpperCase() + ", Roda : "+this.roda.toUpperCase());
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bmw i8","1.5L DOHC Turbo 3 cylinder","4");

        vehicle.getOutputPertama();
        vehicle.getOutputUpperCase();
    }
}
