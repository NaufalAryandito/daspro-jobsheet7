import java.util.Scanner;
public class SiakadFor16 {

    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        double nilai16, tertinggi16= 0, terendah16= 100, lulus16=0, tidakLulus16=0;
        int i;
        for (i=1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ i + ": ");
            nilai16 = dito.nextDouble();
            if (nilai16 > tertinggi16) {
                tertinggi16 = nilai16;

            }
            if (nilai16 < terendah16) {
                terendah16 = nilai16;
            }
            if (nilai16 >= 60){
                lulus16++;
            }
            if (nilai16 < 60){
                tidakLulus16++;
            }
        }
        System.out.println("Nilai Tertinggi : "+ tertinggi16);
        System.out.println("Nilai Terendah : " + terendah16);
        System.out.println("Lulus: "+ lulus16);
        System.out.println("Tidak Lulus"+ tidakLulus16);
        
    }
}