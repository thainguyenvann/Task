package thai.dev;
import java.util.Scanner;

   public class Tinhtong {
   public static void main(String[] args) {
	   
        System.out.println("Nhap vao so nguyen n :");
        
        int n = new Scanner(System.in).nextInt();
        int Tong=0;
        for (int i=1;i<=n;i++) {   
        Tong = Tong +i;
                
            }
            System.out.println("Tong cac chu so cua n la: "+Tong);
    	}
    }