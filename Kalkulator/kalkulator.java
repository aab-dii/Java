import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        int choice = 0;//variabel input
        Scanner sc = new Scanner(System.in);//membaca input
        
        System.out.println("========= Kalkulator Sederhana =========");
        while(choice != 5){
            System.out.println("1. Penjumlahan ");
            System.out.println("2. Pengurangan ");
            System.out.println("3. Perkalian ");
            System.out.println("4. Pembagian ");
            System.out.println("5. Keluar ");
            System.out.print("Pilih operasi (1-5): ");
            choice = sc.nextInt();//input choice
            
            switch(choice) {//pilihan input
                case 1:
                    penjumlahan();//memanggil fungsi penjumlahan
                    break;
                case 2:
                    pengurangan();//memanggil fungsi pengurangan
                    break;
                case 3:
                    perkalian();//memanggil fungsi perkalian
                    break;
                case 4:
                    pembagian();//memanggul fungsi pembagian
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator.");//keluar dari kalkulator
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");//handling error pilihan tidak valid
            }
        }
        sc.close();
    }
    

    //fungsi penjumlahan
    public static void penjumlahan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double num1 = sc.nextDouble();//input angka pertama
        System.out.print("Masukkan angka kedua: ");
        double num2 = sc.nextDouble();//input angka kedua
        double result = num1 + num2;//hasil penjumlahan
        System.out.println("Hasil penjumlahan: " + result);
    }
    
    //fungsi pengurangan
    public static void pengurangan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double num1 = sc.nextDouble();//input angka pertama
        System.out.print("Masukkan angka kedua: ");
        double num2 = sc.nextDouble();//input angka kedua
        double result = num1 - num2;//hasil pengurangan
        System.out.println("Hasil pengurangan: " + result);
    }
    
    //fungsi perkalian
    public static void perkalian() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double num1 = sc.nextDouble();//input angka pertama
        System.out.print("Masukkan angka kedua: ");
        double num2 = sc.nextDouble();//input angka kedua
        double result = num1 * num2;//hasil perkalian
        System.out.println("Hasil perkalian: " + result);
    }
    
    //fungsi pembagian
    public static void pembagian() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double num1 = sc.nextDouble();//input angka pertama
        System.out.print("Masukkan angka kedua: ");
        double num2 = sc.nextDouble();//input angka kedua
        if(num2 == 0) {
            System.out.println("Pembagian oleh nol tidak valid.");
        } else {
            double result = num1 / num2;//hasil pembagian
            System.out.println("Hasil pembagian: " + result);
        }
    }
}
