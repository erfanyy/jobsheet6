package TUGAS3;
import java.util.Scanner;

class Sepatu {
        String kode;
        String merk;
        String kategori;
        String ukuran;
        double harga;

    Sepatu(String kode, String merk, String kategori, String ukuran, double harga) {
        this.kode = kode;
        this.merk = merk;
        this.kategori = kategori;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    void displayInfo() {
        System.out.println("Kode Sepatu: " +kode);
        System.out.println("Merk : " +merk);
        System.out.println("Kategori : " +kategori);
        System.out.println("Ukuran: " +ukuran);
        System.out.println("Harga: " +harga);
        System.out.println();
    }
}

public class Sepatu14 {
    public static void main(String[] args) {
        Sepatu[] sepatuList = {
            new Sepatu("1", "Converse", "Slip On", "36-40", 800000),
            new Sepatu("1", "Converse", "High Top", "40-44", 1200000),
            new Sepatu("2", "Sketcher", "Woman", "36-41", 1000000),
            new Sepatu("2", "Sketcher", "Man", "41-44", 1800000),
            new Sepatu("3", "Nike", "Kids", "36-40", 750000),
            new Sepatu("3", "Nike", "Adult", "36-44", 1500000),
        };
        Scanner input14 = new Scanner(System.in);
        System.out.print("Masukkan Kode Sepatu Yang Anda Cari: ");
        String kodeCari = input14.nextLine();

        boolean found = false;
        for (Sepatu sepatu : sepatuList) {
            if (sepatu.kode.equals(kodeCari)) {
                sepatu.displayInfo();
                found = true;
            }
        }

        if(!found) {
            System.out.println("Sepatu Dengan Kode" + kodeCari + "Tidak Di Temukan.");
        }
    }    
}
