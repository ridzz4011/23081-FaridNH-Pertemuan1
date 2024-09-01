package pertemuan2.code3;

public class NilaiMain {
    public static void main(String[] args) {
        Nilai mahasiswa1 = new Nilai();
        Nilai mahasiswa2 = new Nilai();

        System.out.println("=========================================");
        mahasiswa1.nama = "Jonkler";
        mahasiswa1.npm = "2240098";
        mahasiswa1.nilaiAbsen = 90;
        mahasiswa1.nilaiTugas = 93;
        mahasiswa1.nilaiUTS = 84;
        mahasiswa1.nilaiUAS = 80;
        mahasiswa1.hitungNilaiAkhir();
        mahasiswa1.tampilkanData();

        System.out.println("=========================================");
        mahasiswa2.nama = "Jolly";
        mahasiswa2.npm = "2240099";
        mahasiswa2.nilaiAbsen = 94;
        mahasiswa2.nilaiTugas = 92;
        mahasiswa2.nilaiUTS = 90;
        mahasiswa2.nilaiUAS = 88;
        mahasiswa2.hitungNilaiAkhir();
        mahasiswa2.tampilkanData();

        System.out.println("=========================================");
    }
}
