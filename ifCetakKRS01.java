import java.util.Scanner;
public class ifCetakKRS01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("---CETAK KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silakan cetak KRS Dan Minta Tanda Tangan DPA");
        } else {
            System.out.println("Pembayaran UKT Belum Terverifikasi");  
            input.close();  
        }

    }
    }
