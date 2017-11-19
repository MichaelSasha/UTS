package gol_binatang;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int pilihanMenu;
        int berat;
        String nama, golongan, makan, gerak, warna;
        Scanner inputuser = new Scanner(System.in);
        System.out.println("Tugas UTS Pak Bilal Dari Grup 4");
        System.out.println("Program membuat object hewan");
        System.out.println("Masukkan nama hewan :");
        nama = inputuser.next();
        System.out.println("Masukkan golongan hewan :");
        golongan = inputuser.next();
        System.out.println("masukkan gerakan awal hewan");
        gerak = inputuser.next();
        System.out.println("Masukkan makanan yang dimakan :");
        makan = inputuser.next();
        System.out.println("masukkan warna hewan");
        warna = inputuser.next();
        System.out.println("masukkan berat hewan");
        berat = Integer.parseInt(inputuser.next());
        Sapi_Perah hewanbaru = new Sapi_Perah(nama, makan,gerak,golongan, warna, berat);

        System.out.println("Pilih salah satu :\n" +
                "1. Hewan Bergerak\n" +
                "2. Hewan Makan \n" +
                "3. Keluar Aplikasi\n" +
                "Masukkan pilihan anda :");
        pilihanMenu = inputuser.nextInt();
        do {
            if (pilihanMenu == 1) {
                System.out.println("Masukkan Arah baru : ");
                String arahBaru = inputuser.next();
                hewanbaru.gantiArah(arahBaru);
                break;

            } else if (pilihanMenu == 2) {
                System.out.println("Masukkan Makanan baru yang dimakan : ");
                String Pindah_makan = inputuser.next();
                hewanbaru.gantiMakan(Pindah_makan);
break;
            }
        }
            while (pilihanMenu != 3);
            }
            }




