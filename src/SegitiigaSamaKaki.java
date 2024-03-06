public class SegitiigaSamaKaki extends Segitiga{
    public double sisi;

    public SegitiigaSamaKaki(String nama, double alas, double sisi) {
        setNama(nama);
        this.alas = alas;
        this.sisi = sisi;
        setTinggi();
        super.setSegitiga(alas, tinggi, sisi, sisi);
        super.hitungKeliling();
        super.hitungLuas();
    }

    public void setTinggi() {
        tinggi = Math.round(Math.sqrt(Math.pow(sisi, 2) - Math.pow((alas / 2), 2)) * 100.0)/100.0;
    }
}