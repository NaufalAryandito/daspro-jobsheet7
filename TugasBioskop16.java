import java.util.Scanner;
public class TugasBioskop16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        double hargaTiket16= 50000;
        String namaPengguna16;
        
        
    do {

        System.out.println("Masukkan Nama: ");
        namaPengguna16= dito.nextLine();
        System.out.print("Jumlah Tiket: ");
        int tiket16 = dito.nextInt();
        dito.nextLine();

        if (tiket16<0) {
            System.out.println("Jumlah tidak boleh negatif!, mohon ulangi");
            continue;
        }

        double diskon16 = 0, hargaAwal16, hargaDiskon16, hargaTotal16;
    
        if (tiket16 > 10) {
            diskon16 = 0.15;
        } else if (tiket16 > 4){
            diskon16= 0.10;
        }
        hargaAwal16= tiket16*hargaTiket16;
        hargaDiskon16= tiket16*diskon16;
        hargaTotal16= hargaAwal16-hargaDiskon16;
    
        System.out.println("Diskon: "+ diskon16);
        System.out.println("Harga Total: "+hargaTotal16);
    
        
    } while (true);
    } 



    
}

