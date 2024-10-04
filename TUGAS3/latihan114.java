package TUGAS3;
import java.util.Scanner;

public class latihan114 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukan Bilangan pertama (BIL1): ");
        int BIL1 = input14.nextInt();

        System.out.print("Masukan Bilangan Kedua (BIL2): ");
        int BIL2 = input14.nextInt();

        System.out.print("Masukan Bilangan Ketiga (BIL3): ");
        int BIL3 = input14.nextInt();

        if (BIL1 >= BIL2) {
            System.out.print("Bilangan Terbesar Adalah: " +BIL1);
        } else {
            if (BIL2 >= BIL3) {
                System.out.print("Bilangan Terbesar Adalah: " +BIL2);
            }else{
                System.out.print("Bilangan Terbesar Adalah: " +BIL3);
            }
        }

    }
}
