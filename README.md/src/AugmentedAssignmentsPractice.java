public class AugmentedAssignmentsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Augmented Assignments
         * Berlatih operator augmented assignment dan memahami efisiensinya.
         */

        // ===== AUGMENTED ASSIGNMENTS DASAR =====
        System.out.println("=== AUGMENTED ASSIGNMENTS DASAR ===");

        int score = 100;
        score += 25;
        System.out.println("Setelah += 25: " + score);
        score -= 15;
        System.out.println("Setelah -= 15: " + score);
        score *= 2;
        System.out.println("Setelah *= 2: " + score);
        score /= 4;
        System.out.println("Setelah /= 4: " + score);
        score %= 10;
        System.out.println("Setelah %= 10: " + score);

        // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
        System.out.println("\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

        int value1 = 50, value2 = 50;
        value1 = value1 + 30;
        value2 += 30;
        System.out.println("value1 (regular): " + value1);
        System.out.println("value2 (augmented): " + value2);

        value1 = 80;
        value2 = 80;
        value1 = value1 * 3;
        value2 *= 3;
        System.out.println("value1 (regular * 3): " + value1);
        System.out.println("value2 (augmented * 3): " + value2);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        double bankBalance = 1000;
        bankBalance += 250; // deposit
        bankBalance -= 75;  // penarikan
        bankBalance *= 1.05; // bunga 5%
        System.out.println("Saldo akhir bank: " + bankBalance);

        int totalSales = 0;
        totalSales += 150;
        totalSales += 200;
        totalSales += 175;

        double productionCount = 1000;
        productionCount -= 25;   // barang cacat
        productionCount *= 1.1;  // bonus produksi
        System.out.println("Total penjualan: " + totalSales);
        System.out.println("Jumlah produksi akhir: " + productionCount);

        // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
        System.out.println("\n=== TIPE DATA BERBEDA ===");

        double temperature = 20.5;
        temperature += 5.7;
        temperature *= 1.8;
        temperature += 32;
        System.out.println("Suhu akhir dalam Fahrenheit: " + temperature);

        String message = "Hello";
        message += " World";
        message += "!";
        System.out.println("Pesan akhir: " + message);

        double investment = 5000;
        investment *= 1.07; // tahun 1
        investment *= 1.07; // tahun 2
        investment *= 1.07; // tahun 3
        double profit = investment - 5000;
        System.out.println("Nilai investasi akhir: " + investment);
        System.out.println("Profit: " + profit);
    }
}
