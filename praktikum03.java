import java.util.Scanner;

public class praktikum03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1;

        System.out.print("masukkan angka : "); angka1 = input.nextInt();

        int kondisi = angka1 % 2;
        String hasil = kondisi > 0 ? "ganjil" : "genap";
        System.out.println("angka yang anda masukkan adalah angka " + hasil ); 
    }
}
