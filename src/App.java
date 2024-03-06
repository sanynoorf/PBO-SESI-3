public class App {
    public static void main(String[] args) throws Exception {
        Lingkaran lingkaranA = new Lingkaran("Lingkaran", 7);
        lingkaranA.getInfo();

        Persegi persegiA = new Persegi("Persegi", 6);
        persegiA.getInfo();

        SegitigaSikuSiku segitigaSikuSikuA = new SegitigaSikuSiku("Segitiga Siku Siku", 3, 5);
        segitigaSikuSikuA.getInfo();

        SegitigaSembarang segitigaSembarangA = new SegitigaSembarang("Segitiga Sembarang", 10, 20, 30, 30);
        segitigaSembarangA.getInfo();

        SegitigaSamaSisi segitigaSamaSisiA = new SegitigaSamaSisi("Segitiga Sama Sisi", 4);
        segitigaSamaSisiA.getInfo();

        SegitiigaSamaKaki segitiigaSamaKakiA = new SegitiigaSamaKaki("Segitiga Sama Kaki", 6, 5);
        segitiigaSamaKakiA.getInfo();
    }
}
