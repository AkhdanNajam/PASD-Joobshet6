public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Constructor
    Mahasiswa02() {
        this.nim = "";
        this.nama = "";
        this.kelas = "";
        this.ipk = 0.0;
    }

    // Constructor dengan parameter
    Mahasiswa02(String nm, String name, String kls, double ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    void tampil() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}