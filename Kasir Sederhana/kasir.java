import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int[] barang = new int[4]; // Array untuk menyimpan jumlah barang yang dibeli (telur, beras, mie goreng,
                                   // tepung)
        int[] harga = { 40000, 12000, 25000, 12000 }; // Array untuk menyimpan harga barang (telur, beras, mie goreng,
                                                      // tepung)
        int totalBayar = 0; // Variabel untuk menyimpan total harga belanjaan

        while (choice != 6 && choice != 5) {
            System.out.println("==== Toko Sembako Tohar ==== ");
            System.out.println("1. Telor (Piring)");
            System.out.println("2. Beras (Kg)");
            System.out.println("3. Mie Goreng (Dus)");
            System.out.println("4. Tepung (Kg)");
            System.out.println("5. Bayar");
            System.out.println("6. Keluar");
            System.out.print(">> ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Jumlah telor (Piring): ");
                    int telor = sc.nextInt();
                    barang[0] += telor;
                    break;
                case 2:
                    System.out.print("Berapa kilogram beras: ");
                    int beras = sc.nextInt();
                    barang[1] += beras;
                    break;
                case 3:
                    System.out.print("Berapa dus mie goreng: ");
                    int mieGoreng = sc.nextInt();
                    barang[2] += mieGoreng;
                    break;
                case 4:
                    System.out.print("Berapa kilogram tepung: ");
                    int tepung = sc.nextInt();
                    barang[3] += tepung;
                    break;
                case 5:
                    // Hitung total harga belanjaan
                    for (int i = 0; i < barang.length; i++) {
                        if (barang[i] > 0) {
                            totalBayar += barang[i] * harga[i];
                        }
                    }
                    // Tampilkan struk pembayaran
                    System.out.println("==== Struk Pembayaran ====");
                    System.out.println("Barang          Jumlah    Harga");
                    for (int i = 0; i < barang.length; i++) {
                        if (barang[i] > 0) {
                            System.out.printf("%-15s %-8d Rp %-10d\n", getNamaBarang(i), barang[i],
                                    barang[i] * harga[i]);
                        }
                    }
                    System.out.println("Total Bayar: Rp " + totalBayar);
                    System.out.println("Terima kasih telah berbelanja di Toko Sembako Tohar.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
        sc.close();
    }

    // Metode untuk mendapatkan nama barang berdasarkan indeks
    public static String getNamaBarang(int index) {
        switch (index) {
            case 0:
                return "Telor (Piring)";
            case 1:
                return "Beras (Kg)";
            case 2:
                return "Mie Goreng (Dus)";
            case 3:
                return "Tepung (Kg)";
            default:
                return "Barang tidak ditemukan";
        }
    }
}
