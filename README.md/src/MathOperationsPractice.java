public class MathOperationsPractice {
    public static void main(String[] args) {
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        int num1 = 25, num2 = 4;

        int tambah = num1 + num2;   // 25 + 4 = 29
        int kurang = num1 - num2;   // 25 - 4 = 21
        int kali = num1 * num2;     // 25 * 4 = 100
        int bagiInt = num1 / num2;  // 25 / 4 = 6
        int mod = num1 % num2;      // 25 % 4 = 1

        System.out.println("Penjumlahan: " + tambah + "  (25 + 4 = 29)");
        System.out.println("Pengurangan: " + kurang + "  (25 - 4 = 21)");
        System.out.println("Perkalian: " + kali + "  (25 * 4 = 100)");
        System.out.println("Pembagian (int): " + bagiInt + "  (25 / 4 = 6)");
        System.out.println("Sisa bagi: " + mod + "  (25 % 4 = 1)");

        System.out.println("\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        int intDiv = 17 / 5;
        double floatDiv1 = 17.0 / 5;
        double floatDiv2 = (double) 17 / 5;

        System.out.println("Pembagian integer (17/5): " + intDiv + "  (17 ÷ 5 = 3, sisa 2)");
        System.out.println("Pembagian floating-point (17.0/5): " + floatDiv1 + "  (17.0 ÷ 5 = 3.4)");
        System.out.println("Pembagian dengan casting ((double)17/5): " + floatDiv2 + "  (17 ÷ 5.0 = 3.4)");

        System.out.println("\n=== KALKULASI PRAKTIS ===");

        double panjang = 12.5, lebar = 8.3;
        double luas = panjang * lebar;             // 12.5 * 8.3 = 103.75
        double keliling = 2 * (panjang + lebar);   // 2 * (12.5 + 8.3) = 41.6

        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double totalHarga = jumlahBarang * hargaBarang;       // 3 * 15.99 = 47.97
        double totalDenganPajak = totalHarga * 1.08;          // 47.97 * 1.08 = 51.71

        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;           // (25*9/5)+32 = 77.0

        int hari = 50;
        int minggu = hari / 7;   // 50 / 7 = 7 minggu
        int sisaHari = hari % 7; // 50 % 7 = 1 hari

        System.out.println("Luas persegi panjang: " + luas + "  (12.5 * 8.3 = 103.75)");
        System.out.println("Keliling persegi panjang: " + keliling + "  (2*(12.5+8.3) = 41.6)");
        System.out.println("Total harga dengan pajak: $" + String.format("%.2f", totalDenganPajak) + "  (3*15.99*1.08 = 51.71)");
        System.out.println("25°C dalam Fahrenheit: " + fahrenheit + "°F  ((25*9/5)+32 = 77.0)");
        System.out.println("50 hari = " + minggu + " minggu penuh dan " + sisaHari + " hari  (50 ÷ 7 = 7 sisa 1)");

        System.out.println("\n=== KALKULASI KOMPLEKS ===");

        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;  // 65.5 * 2.75 = 179.125

        double pokok = 1000, bunga = 0.05;
        int tahun = 3;
        double jumlah = pokok * Math.pow(1 + bunga, tahun); // 1000*(1.05^3) = 1157.63

        int[] nilai = {85, 92, 78, 96, 88};
        double rataRata = (nilai[0] + nilai[1] + nilai[2] + nilai[3] + nilai[4]) / 5.0;
        // (85+92+78+96+88)/5 = 87.8

        System.out.println("Jarak tempuh: " + jarak + " km  (65.5 * 2.75 = 179.125)");
        System.out.println("Jumlah dengan bunga majemuk: $" + String.format("%.2f", jumlah) + "  (1000*(1.05^3) = 1157.63)");
        System.out.println("Rata-rata nilai ujian: " + String.format("%.2f", rataRata) + "  ((85+92+78+96+88)/5 = 87.8)");
    }
}
