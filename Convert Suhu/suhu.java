import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        System.out.println("====== Convert Suhu Sederhana ======");
        int choice = 0;//variabel input
        Scanner sc = new Scanner(System.in);

        while (choice != 5) {
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Reamur");
            System.out.println("4. Kelvin");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            choice = sc.nextInt();//input pilihan menu

            switch (choice) {
                case 1:
                    System.out.println("===== Convert ke? =====");
                    System.out.println("1. Fahrenheit");
                    System.out.println("2. Reamur");
                    System.out.println("3. Kelvin");
                    System.out.println("4. Kembali");
                    System.out.print("Pilih Menu : ");
                    choice = sc.nextInt();//input pilihan menu

                    switch (choice) {
                        case 1:
                            System.out.print(" >>> ");
                            double fr = sc.nextDouble();//input suhu
                            celsiustofahrenheit(fr);//memanggil fungsi dengan parameter
                            break;
                        case 2:
                            System.out.print(" >>> ");
                            double rm = sc.nextDouble();
                            celsiustoreamur(rm);
                            break;
                        case 3:
                            System.out.print(" >>> ");
                            double kv = sc.nextDouble();
                            celsiustokelvin(kv);
                            break;
                        case 4://kembali ke menu sebelumnya
                            break;
                        default:
                            System.out.println("Pilihan Invalid");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("===== Convert ke? =====");
                    System.out.println("1. Celsius");
                    System.out.println("2. Reamur");
                    System.out.println("3. Kelvin");
                    System.out.println("4. Kembali");
                    System.out.print("Pilih Menu : ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print(" >>> ");
                            double cs = sc.nextDouble();
                            fahrenheittocelsius(cs);
                            break;
                        case 2:
                            System.out.print(" >>> ");
                            double rm = sc.nextDouble();
                            fahrenheittoreamur(rm);
                            break;
                        case 3:
                            System.out.print(" >>> ");
                            double kv = sc.nextDouble();
                            fahrenheittokelvin(kv);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Pilihan Invalid");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("===== Convert ke? =====");
                    System.out.println("1. Fahrenheit");
                    System.out.println("2. Celsius");
                    System.out.println("3. Kelvin");
                    System.out.println("4. Kembali");
                    System.out.print("Pilih Menu : ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print(" >>> ");
                            double fr = sc.nextDouble();
                            reamurtofahrenheit(fr);
                            break;
                        case 2:
                            System.out.print(" >>> ");
                            double cs = sc.nextDouble();
                            reamurtocelsius(cs);
                            break;
                        case 3:
                            System.out.print(" >>> ");
                            double kv = sc.nextDouble();
                            reamurtokelvin(kv);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Pilihan Invalid");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("===== Convert ke? =====");
                    System.out.println("1. Fahrenheit");
                    System.out.println("2. Reamur");
                    System.out.println("3. Celsius");
                    System.out.println("4. Kembali");
                    System.out.print("Pilih Menu : ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print(" >>> ");
                            double fr = sc.nextDouble();
                            kelvintofahrenheit(fr);
                            break;
                        case 2:
                            System.out.print(" >>> ");
                            double rm = sc.nextDouble();
                            kelvintoreamur(rm);
                            break;
                        case 3:
                            System.out.print(" >>> ");
                            double cs = sc.nextDouble();
                            kelvintocelsius(cs);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Pilihan Invalid");
                            break;
                    }
                    break;
                case 5://keluar program
                    System.out.println("Terimakasih telah menggunakan program convert suhu");
                    break;
                default:// pilihan tidak tersedia
                    System.out.println("Pilihan Invalid");
                    break;
            }
            sc. close();
        }
    }

    //fungsi masing masing suhu dengan parameter
    public static void celsiustofahrenheit(double temp) {
        double result = (temp * 1.8) + 32;//hasil penghitungan
        System.out.println(result + " Fahrenheit");//output hasil
        System.out.println("=============================");
    }
    
    public static void celsiustoreamur(double temp) {
        double result = (temp / 1.25);
        System.out.println(result + " Reamur");
        System.out.println("=============================");
    }
    
    public static void celsiustokelvin(double temp) {
        double result = (temp + 273.15);
        System.out.println(result + " Kelvin");
        System.out.println("=============================");
    }
    
    public static void fahrenheittokelvin(double temp) {
        double result = ((temp - 32) / 1.8) + 273.15;
        System.out.println(result + " Kelvin");
        System.out.println("=============================");
    }
    
    public static void fahrenheittocelsius(double temp) {
        double result = (temp - 32) / 1.8;
        System.out.println(result + " Celsius");
        System.out.println("=============================");
    }
    
    public static void fahrenheittoreamur(double temp) {
        double result = ((temp - 32) / 1.8) / 1.25;
        System.out.println(result + " Reamur");
        System.out.println("=============================");
    }
    
    public static void reamurtokelvin(double temp) {
        double result = (temp * 1.25) + 273.15;
        System.out.println(result + " Kelvin");
        System.out.println("=============================");
    }
    
    public static void reamurtocelsius(double temp) {
        double result = (temp * 1.25);
        System.out.println(result + " Celsius");
        System.out.println("=============================");
    }

    public static void reamurtofahrenheit(double temp) {
        double result = ((temp * 1.25) * 1.8) + 32;
        System.out.println(result + " Fahrenheit");
        System.out.println("=============================");
    }
    
    public static void kelvintocelsius(double temp) {
        double result = temp - 273.15;
        System.out.println(result + " Celsius");
        System.out.println("=============================");
    }
    
    public static void kelvintofahrenheit(double temp) {
        double result = ((temp - 273.15) * 1.8) + 32;
        System.out.println(result + " Fahrenheit");
        System.out.println("=============================");
    }
    
    public static void kelvintoreamur(double temp) {
        double result = (temp - 273.15) / 1.25;
        System.out.println(result + " reamur");
        System.out.println("=============================");
    }
}
