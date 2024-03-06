public class SegitigaSamaSisi extends Segitiga{
    protected double sisi;

    public SegitigaSamaSisi(String nama, double sisi) {
        setNama(nama);
        this.sisi = sisi;
        hitungKeliling();
        hitungLuas();
    }

    public void hitungKeliling() {
        keliling = 3 * sisi;
    }

    public void hitungLuas() {
        luas = (1.0/4 * Math.pow(sisi, 2)) * Math.sqrt(3);
    }
}