/** */
import java.util.Scanner;

public class susahUKL {
    public static void main(String[] args) {
        String[][] data = {
            {"1", "Galuh", "1", "Sawojajar"},
            {"2", "Indro", "3", "Blimbing"},
            {"3", "Jedi", "2", "Lowokwaru"},
            {"4", "Kanu", "3", "Klojen"},
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan ID Pelanggan : ");
        int id = in.nextInt();
        System.out.println("Masukkan Jumlah pemakaian kwh : ");
        int kwh = in.nextInt();
        
        System.out.println("------------------------");
        System.out.println("ID : " + data[id-1][0]);
        System.out.println("Nama : " + data[id-1][1]);
        System.out.println("Golongan : " + data[id-1][2]);
        System.out.println("Alamat : " + data[id-1][3]);

        int gol = Integer.parseInt(data[id-1][2]);
        if (gol == 1) {
            int tagihan = kwh*1000;
            System.out.println("Jumlah kwh : " +kwh);
            System.out.println("------------------------");
            System.out.println("Total Tagihan : Rp." +tagihan);
            System.out.println("------------------------");
        } else if (gol == 2) {
            int tagihan = kwh*1500;
            System.out.println("Jumlah kwh : " +kwh);
            System.out.println("------------------------");
            System.out.println("Total Tagihan : Rp." +tagihan);
            System.out.println("------------------------");
            
        } else if (gol == 3) {
            int tagihan = kwh*2000;
            System.out.println("Jumlah kwh : " +kwh);
            System.out.println("------------------------");
            System.out.println("Total Tagihan : Rp." +tagihan);
            System.out.println("------------------------");

        } else {
            System.out.println("empty");
        }
    }
}
