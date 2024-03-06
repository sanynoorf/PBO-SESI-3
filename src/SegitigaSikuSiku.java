public class SegitigaSikuSiku extends Segitiga{
    protected double sisiMiring;

    public SegitigaSikuSiku(String nama, double alas, double sisiMiring) {
        setNama(nama);
        this.alas = alas;
        this.sisiMiring = sisiMiring;
        setTinggi();
        super.hitungKeliling();
        super.hitungLuas();
    }

    public void setTinggi() {
        tinggi = Math.round(Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(alas, 2)) * 100.0) / 100.0;
    }
}