package gol_binatang;

public class sapi extends hewan{
    private String golongan;
    private String warna;
    private int berat;

    public sapi(String nama,String gerak,String makan, String golongan, String warna, int berat) {
        super(nama,gerak,makan);
        this.golongan = golongan;
        this.warna = warna;
        this.berat = berat;
    }
    public void gantiArah(String arahBaru){
        System.out.println("Semula bergerak kearah " + this.getGerak()+ "\nSekarang bergerak kearah " + arahBaru);
        this.setGerak(arahBaru);
    }

    public void gantiMakan(String Pindah_makan){
        System.out.println("Semula makan " + this.getMakan()+ "\nSekarang makan " + Pindah_makan);
        this.setMakan(Pindah_makan);
    }

    public String getgolongan() {return golongan;}

    public String getWarna() {return warna;}

    public int getberat() {return berat;}



}
