package pertemuan2.code3;

public class Nilai {
    String nama;
    String npm;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    void hitungNilaiAkhir() {
        this.nilaiAkhir = (this.nilaiAbsen * 0.10) + (this.nilaiTugas * 0.20) + (this.nilaiUTS * 0.30) + (this.nilaiUAS * 0.40);
    }

    void tampilkanData() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("NPM           : " + this.npm);
        System.out.printf("Nilai Absen [10%%]   : %.2f%n", this.nilaiAbsen);
        System.out.printf("Nilai Tugas [20%%]   : %.2f%n", this.nilaiTugas);
        System.out.printf("Nilai UTS [30%%]     : %.2f%n", this.nilaiUTS);
        System.out.printf("Nilai UAS [40%%]     : %.2f%n", this.nilaiUAS);
        System.out.printf("Nilai Akhir         : %.2f%n", this.nilaiAkhir);
    }
}
