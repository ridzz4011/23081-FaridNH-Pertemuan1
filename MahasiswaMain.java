package pertemuan2.code3;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        System.out.println("=====================================");

        mhs1.nama = "Jonkler";
        mhs1.buku = "Cara Membaca Buku";
        mhs1.membaca();

        System.out.println("=====================================");

        mhs2.nama = "Patrick";
        mhs2.nyontek();

        System.out.println("=====================================");

        mhs3.nama = "Naruto";
        mhs3.modifikasi();

        System.out.println("=====================================");
    }
}
