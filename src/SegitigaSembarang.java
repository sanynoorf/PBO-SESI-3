public class SegitigaSembarang extends Segitiga{
    protected double sudut;

    public SegitigaSembarang(String nama, double alas, double sisiB, double sisiC, double sudut) {
        setNama(nama);
        this.alas = alas;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sudut = sudut;
        hitungLuas();
        super.hitungKeliling();
    }

    public void hitungLuas() {
        luas = 0.5 * alas * sisiB * Math.round(Math.sin(Math.toRadians(sudut)) * 100.0) / 100.0;
    }
}
