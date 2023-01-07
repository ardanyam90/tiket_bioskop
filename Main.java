import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kode;
        String jam;
        int harga=50000;
        Scanner scanner = new Scanner(System.in);
        Tiket user = new Tiket();
        System.out.println("Pemesanan Tiket Bioskop");
        System.out.print("Masukkan Nama : ");
        String nama = scanner.next();
        System.out.print("Masukkan Nomer Telepon : ");
        String nomor = scanner.next();
        System.out.print("Masukkan metode Pembayaran : ");
        String metode = scanner.next();

        user.setNama(nama);
        user.setTelepon(nomor);

        System.out.println("Pilihan Film : ");arda
        System.out.println("1. Dilan 1991");
        System.out.println("2. Yowis Ben 3");
        System.out.println("3. Ayat-Ayat Cinta");
        System.out.print("Masukkan Pilihan : ");
        int a = scanner.nextInt();
        if (a==1){
            kode = "a1";
        } else if (a==2) {
            kode="a2";
        } else if (a==3) {
            kode ="a3";
        }
        else {
            kode="Silahkan masukkan 1 2 3 : ";
        }
        System.out.println("Pilihan jam film : ");
        System.out.println("1 = 12.00");
        System.out.println("2 = 13.00");
        System.out.println("3 = 14.00");
        System.out.print("Masukkan Pilihan = ");
        int b = scanner.nextInt();
        if (b==1){
            jam="12.00";
        } else if (b==2) {
            jam="13.00";
        } else if (b==3) {
            jam="14.00";
        }
           else {
               jam="Silahkan masukkan yang benar";
        }
           user.setKode(kode);
           user.setJam(jam);
           user.setHargaTiket(harga);

           System.out.println("Customer name "+user.getNama());
           System.out.println("Customer nomor "+user.getTelepon());
           System.out.println("Customer Film "+user.getKode());
           System.out.println("Customer jam "+user.getJam());
           System.out.println("Customer bill "+user.getHargaTiket());
    }
}