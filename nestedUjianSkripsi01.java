import java.util.Scanner;
public class nestedUjianSkripsi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan = "";

        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak)");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("masukan jumlah log bimbingan pembimbing 1");
        int BimbinganP1 = sc.nextInt();
        System.out.println("masukan jumlah log bimbingan pembimbing 2");
        int BimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (BimbinganP1 >= 8 && BimbinganP2 >= 4) {
                pesan = "Mahasiswa boleh ujian skripsi";
            } else if (BimbinganP1 < 8 && BimbinganP2 < 4) {
                pesan = "Gagal! log bimbingan P1 kurang dari 8 kali dan log bimbingan P2 kurang dari 4 kali";
            } else if (BimbinganP1 < 8) {
                pesan = "Gagal! log bimbingan P1 kurang dari 8 kali";
            } else {
                pesan = "Gagal! log bimbingan P2 kurang dari 4 kali";
            }
        } else {
            pesan = "Gagal! mahasiswa masih memiliki tangungan kompen";  
            System.out.println(pesan);
        }
        System.out.println(pesan); 
        sc.close(); 

        }
    }

