public class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;
    protected double sisiB;
    protected double sisiC;

    public void setSegitiga(double alas, double tinggi, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        hitungKeliling();
        hitungLuas();
    }

    public void hitungKeliling() {
        keliling = alas + sisiB + sisiC;
    }

    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }
}
