import java.util.Scanner;
public class TugasParkir16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        int jenis16, durasi16, total16=0;

       while (true) {
           System.out.print("Masukkan Jenis Kendaraan (1 Mobil, 2 Motor, 0 Keluar ):");
           jenis16= dito.nextInt();
          if (jenis16==0) {
            break;
          }
          
           if (jenis16==1 || jenis16==2) {
               System.out.print("Durasi Parkir: ");
               durasi16= dito.nextInt();
               if (durasi16 > 5){
               total16+=12500;
               }else if (jenis16==1){
                total16+= durasi16*3000;

               }else if (jenis16==2) {
                total16+=durasi16*2000;
               }else{
                continue;
               }
System.out.println("total keseluruhan:"+ total16);
           }

        
       }
    }
    
}
