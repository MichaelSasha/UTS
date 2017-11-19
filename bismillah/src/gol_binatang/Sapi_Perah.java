package gol_binatang;

public class Sapi_Perah extends sapi {
    public Sapi_Perah(String nama, String gerak, String makan, String golongan, String warna, int berat) {
        super(nama, gerak, makan, golongan, warna, berat);
        System.out.println("hewan yang dibuat adalah " + getNama());
        System.out.println("hewan bergerak ke  " + getGerak());
        System.out.println("Makanan  yang dimakan adalah " + getMakan());
        System.out.println("golongan hewan adalah " + getgolongan());
        System.out.println("Warna hewan adalah " + getWarna());
        System.out.println("Berat hewan  adalah " + getberat());

    }
}



