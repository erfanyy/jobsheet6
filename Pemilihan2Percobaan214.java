import java.util.Scanner;
public class Pemilihan2Percobaan214 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        int pilihan_menu;
        String member;
        double diskon;
        int harga;
        double total_bayar;
        String jenis_pembayaran;
        int potongan_qris = 1000;

        System.out.println("===========");
        System.out.println("====Menu Cafe====");
        System.out.println("===========");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("===========");
        System.out.print("Masukan Angka dari menu yang anda pilih = ");

        pilihan_menu = input14.nextInt();
        input14.nextLine();
        System.out.print("Apakah punya member y/n ? = ");
        member = input14.nextLine();
        System.out.print("Jenis Pembayaran QRIS/TUNAI = ");
        jenis_pembayaran = input14.nextLine();
        System.out.println("===========");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (pilihan_menu == 1 ) {
                harga = 14000;
                System.out.println("Harga Rice Bowl =" + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea =" +harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =" +harga);

            }else {
                System.out.println("Masukan Pilihan Menu Yang Benar ");
                return;
            }

            total_bayar = harga - (harga * diskon);
            if (jenis_pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= potongan_qris;
            }
            System.out.println("Total Bayar Setelah Diskon =" +total_bayar);

        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl =" +harga);
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea =" +harga);
        }else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling =" +harga);
        }else {
            System.out.println("Masukan Pilihan Menu dengan Benar");
            return;
        }
        total_bayar = harga;
        if (jenis_pembayaran.equalsIgnoreCase("QRIS")) {
            total_bayar -= potongan_qris;
        }
        System.out.println("Total Bayar =" +total_bayar);
        }else {
            System.out.println("Member Tidak Valid");
        }
        System.out.println("========================");
    }
}
