import java.util.Scanner;
public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

        int kopi16, teh16, roti16;
        String namaPelanggan16;
        long hargaKopi16= 12000, hargaTeh16= 7000, hargaRoti16= 20000, totalHarga16;
        

        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) :");
            namaPelanggan16 = dito.nextLine();
            if (namaPelanggan16.equalsIgnoreCase("Batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi16 = dito.nextInt();
            System.out.print("Jumlah teh: ");
            teh16 = dito.nextInt();
            System.out.print("Jumlah roti: ");
            roti16 = dito.nextInt();

            totalHarga16 = (kopi16 *hargaKopi16) + (teh16 * hargaTeh16)+ (roti16 * hargaRoti16);
            System.out.println("Total yang harus dibayar : Rp."+ totalHarga16);
            dito.nextLine();       
        } while (true);
        System.out.println("Semua transaksi selesai");
    }
    }