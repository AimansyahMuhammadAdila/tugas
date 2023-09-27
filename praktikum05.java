import java.util.Scanner;
public class praktikum05 {
    public static void main(String[] args) {
        Scanner ingput = new Scanner(System.in);
        double pi, jari,luas;
        pi= 3.141592;

        System.out.print("masukkan jari-jari lingkaran : "); jari = ingput.nextDouble();
        
        luas = pi*jari*jari;

        System.out.println("luas lingkaran tersebut adalah : " + (double) luas);
        

    }
}
