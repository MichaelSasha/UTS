package gol_binatang;

public class hewan {
    private String nama;
    private String gerak;
    private String makan;

    private String pindah_makan;
    private String pindah_gerak;

    public hewan(String nama,String makan,String gerak) {
    this.nama = nama;
    this.makan =  makan;
    this.gerak=gerak;
    this.pindah_makan ="";
    this.pindah_gerak = "";

    }

    public String getNama() {
        return nama;}
    public void setNama(String nama) {
        this.nama = nama;

    }

    public String getGerak() {
        return gerak;}
        public void setGerak(String gerak) {
            this.gerak = gerak;

    }

    public String getMakan() {
        return makan; }
    public void setMakan(String makan) {
        this.makan = makan;
    }



}
