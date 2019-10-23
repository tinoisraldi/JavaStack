import java.util.*;
public class tesstack2 {
    public static void main(String[] args) {
        Stack x = new Stack(5);
        Scanner sc = new Scanner(System.in);
        int pilihan;
        int data;
        do{
            System.out.println("1. PUSH Item");
            System.out.println("2. POP Item");
            System.out.println("3. Keluar");
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();

            if(pilihan==1){
                System.out.println("Data yang ditambahkan : ");
                data = input.nextInt();
                x.push(data);
            }
            else if(pilihan==2){
                System.out.println(x.pop());
            }


            else if(pilihan==3){
                System.exit(0);
            }
            else{
                System.out.println("Pilihan Tidak Ada!!");
            }
        } while(pilihan!=0);
    }
        }


