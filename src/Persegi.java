public class Persegi extends BangunDatar{
    protected double sisi;

    public Persegi(String nama, double sisi) {
        setNama(nama);
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        luas = sisi * sisi;
    }

    public void hitungKeliling() {
        keliling = sisi * 4;
    }
}
