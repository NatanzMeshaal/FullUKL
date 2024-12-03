import java.util.Scanner;

public class mudahUKL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("angka :");
        int angka = in.nextInt();

        cekGanjilGenap(angka);
        in.close();
    }
    
    public static void cekGanjilGenap(int angka) {
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah Bilangan Genap");
        } else {
            System.out.println(angka + " adalah Bilangan Ganjil");
        }
    }

    public static boolean cekGanjilGenap2(int angka) {
        if(angka % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
