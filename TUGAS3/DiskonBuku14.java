package TUGAS3;
import java.util.Scanner;

public class DiskonBuku14 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukan Jenis Buku (kamus/novel): ");
        String jenisBuku = input14.nextLine();

        System.out.print("Masukan Jumlah Buku: ");
        int jumlahBuku = input14.nextInt();

        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 27) {
                diskon = 10 + 2;
            }else {
                diskon = 10 + 1;
            }
        }else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 37) {
                diskon = 7 + 2;
            }else {
                diskon = 7 + 1;
            }
        }else {
            diskon = 0;
        }

        System.out.println("Total diskon yang diperoleh: " + diskon + "%" );
    }
}
