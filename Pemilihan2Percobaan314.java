import java.util.Scanner;
public class Pemilihan2Percobaan314 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        String kategori;
        int penghasilan, gaji_bersih;
        double pajak = 0;
        
        System.out.print("Masukan Kategori : ");
        kategori = input14.nextLine();
        System.out.print("Masukan Besarnya Penghasilan : ");
        penghasilan = input14.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000) {
            pajak = 0.1;
        } else if (penghasilan <= 3000000) {
            pajak = 0.15;
        }else{
            pajak = 0.2;
        }
            gaji_bersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " +gaji_bersih);
        
        }else if (kategori.equals("Pebisnis")) {
            if (penghasilan <= 25000000) {
            pajak = 0.15;
            }else if (penghasilan <= 3500000) {
            pajak = 0.2;
            }else{
            pajak = 0.25;
            }
            gaji_bersih =(int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan Kategori Salah ");
        }
    }
}
