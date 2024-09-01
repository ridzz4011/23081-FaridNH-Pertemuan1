package pertemuan2.code3;

public class Mahasiswa {

    String nama;
    String buku;

    void membaca() {
        System.out.println(this.nama + " membaca sebuah " + this.buku);
    }

    void nyontek() {
        System.out.println(this.nama + " menyontek ke mahasiswa lain");
    }

    void modifikasi() {
        System.out.println(this.nama + " memodifikasi sebuah code yang diberikan oleh dosen");
    }
}
