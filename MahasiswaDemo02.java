import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(n);

        // INPUT DATA
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            System.out.println("-------------------");

            Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        // TAMPIL DATA AWAL
        System.out.println("\nData Mahasiswa:");
        list.tampil();

        // BUBBLE SORT
        System.out.println("\nSetelah Bubble Sort (ASC):");
        list.bubbleSort();
        list.tampil();

        // INSERTION SORT
        System.out.println("\nSetelah Insertion Sort (ASC):");
        list.insertionSort();
        list.tampil();

        // SEARCHING
        System.out.println("---------------------------------- ");
        System.out.print("Pencarian Data ");
        System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK :");
        double cari = sc.nextDouble();

        System.out.println("menggunkan Sequential Search");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //mencari data binary
        System.out.println("----------------------------------");
        System.out.print("Pencarian Data ");
        System.out.println("----------------------------------");
        System.out.print("Masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK :");
        cari = sc.nextDouble();
        System.out.println("menggunkan Binary Search");
        double posisi2 = list.findBinarySearch(cari, 0, list.listMhs.length - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    }
}