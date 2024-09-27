import java.util.Scanner;


public class PemilihanBilangan14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKAN ANGKA: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "Termasuk Bilangan Genap" : "Termasuk Bilangan Ganjil";
        System.out.println("Angka " + angka + " " +hasil);
    }
    
}
