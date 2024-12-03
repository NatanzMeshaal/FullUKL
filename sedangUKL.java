import java.util.Scanner;

public class sedangUKL {
    public static void main(String[] args) {
        int nilai, total=0, siswa;
        double mean;
        Scanner p = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa yang ingin di nilai");
        siswa = p.nextInt();

        for (int i = 1; i <= siswa; i++) {
            System.out.println("Masukkan nilai siswa ke-"+i);
            nilai = p.nextInt();
            total += nilai;
        }

        mean=total/siswa;
        System.out.println("Jumlah Siswa : "+siswa);
        System.out.println("Rata - rata : "+mean);

        output();
        p.close();
    }
    public static void output(){
        System.out.println("===================");
        System.out.println("Terimakasih telah login di aplikasi kami-");
    }
}
