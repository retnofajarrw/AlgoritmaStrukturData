
package minggu10;
import java.util.Scanner;
public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek Front ");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        
        System.out.println("--------------------------");
        System.out.print("Pilih menu: ");
    }
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = retno.nextInt();
        
      Queue Q = new Queue(n);
       int pilih;
      do {
          menu();
          pilih = retno.nextInt();
          switch(pilih){
              case 1:
                  System.out.print("Masukkan data baru: ");
                  int dataMasuk = retno.nextInt();
                  Q.Enqueue(dataMasuk);
                  break;
               case 2:
                   int dataKeluar =Q.Dequeue();
                   if (dataKeluar != 0){
                       System.out.println("Data yang dikeluarkan: "+dataKeluar);
                       break;
                   }
               case 3:
                  Q.print();
                  break;
               case 4: 
                   Q.peek();
                   break;
               case 5:
                   Q.peekRear();
                   break;
               case 6:
                   System.out.print("Posisi data Yang anda cari : ");
                   int find = retno.nextInt();
                   Q.peekPosition(find);
                   break;
               case 7:
                   System.out.println("Data pada antrian: ");
                   int antri = retno.nextInt();
                   Q.peekAt(antri);
                   break;
          }
      }while (pilih==1 || pilih == 2||pilih == 3||pilih==4||pilih==5||pilih==6||pilih==7);
    }
}
