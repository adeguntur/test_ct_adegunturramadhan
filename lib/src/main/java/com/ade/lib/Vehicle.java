package com.ade.lib;

class Vehicle {
    private String namaMobil = "Bmw i8";
    private String kapasitasMesin = "1.5L DOHC Turbo 3 cylinder";
    private String roda = "4";

    void getOutputVehicle(){
        System.out.print("Nama Mobil : "+namaMobil + ", Kapasitas Mesin : "+kapasitasMesin + ", Roda : "+roda);
    }

    void getOutputVehicleUpperCase(){
        System.out.print("Nama Mobil : "+namaMobil.toUpperCase() + ", Kapasitas Mesin : "+this.kapasitasMesin.toUpperCase() + ", Roda : "+this.roda.toUpperCase());
    }
}
