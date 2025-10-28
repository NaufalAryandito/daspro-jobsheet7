import java.util.Scanner;
public class SiakadWhile16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        int i=0, nilai;

        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs= dito.nextInt();
        
        while (i < jmlMhs) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) + ": ");
            nilai = dito.nextInt();

            if (nilai<0 || nilai>100){
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + "\s adalah A");
                // System.out.println("Bagus, Pertahankan nilainya");
            }else if (nilai > 73 && nilai <= 80){
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + "\s adalah B+");
            }else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + "\s adalah B");
            }else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + "\s adalah C+");
            }else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + "\s adalah C");
            }else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + "\s adalah D");
            }else {
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + "\s adalah E");
            }
            i++;
        }
    }
}
