package contohinterface;
import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        
        Phone redmiNote8 = new Xiaomi();
        Phone Iphone13 = new Iphone();
        Phone samsungNote9 = new Samsung();
        Phone oppoReno7 = new Oppo();
        Phone nokiaJadul = new Nokia();
        PhoneUser ersa = new PhoneUser(nokiaJadul);
        
        ersa.turnOnThePhone();
        Scanner input = new Scanner(System.in);
        int aksi;
        
        while(true){
            System.out.println("===APLIKASI INTERFACE===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[5] Hp di banting");
            System.out.println("[0] Keluar");
            System.out.println("-------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();
            
            switch(aksi){
                case 1:
                    ersa.turnOnThePhone();
                    break;
                case 2:
                    ersa.turnOffThePhone();
                    break;
                case 3:
                    ersa.makePhoneLouder();
                    break;
                case 4:
                    ersa.makePhoneSilent();
                    break;
                case 5:
                    ersa.phoneDropped();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Kamu memilih aksi yang salah");
                     
            }
        }
    }
    
}
