public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         * Memahami perbedaan pre/post increment-decrement, unary plus/minus,
         * boolean NOT, dan aplikasi praktis.
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        int counter = 5;

        System.out.println("Awal counter = " + counter);

        System.out.println("Pre-increment (++counter): " + (++counter) + "  (counter langsung jadi 6)");
        System.out.println("Post-increment (counter++): " + (counter++) + "  (ditampilkan 6, lalu counter jadi 7)");

        counter = 5; // reset
        System.out.println("Reset counter = " + counter);

        System.out.println("Pre-decrement (--counter): " + (--counter) + "  (counter langsung jadi 4)");
        System.out.println("Post-decrement (counter--): " + (counter--) + "  (ditampilkan 4, lalu counter jadi 3)");

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");

        int a = 10, b = 10;

        int result1 = ++a; // a jadi 11 dulu, lalu result1 = 11
        System.out.println("++a -> a: " + a + ", result1: " + result1);

        int result2 = b++; // result2 = 10 dulu, lalu b jadi 11
        System.out.println("b++ -> b: " + b + ", result2: " + result2);

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST DECREMENT ===");

        int x = 8, y = 8;

        System.out.println("--x: " + (--x) + " (langsung berkurang, x=7)");
        System.out.println("x sekarang: " + x);

        System.out.println("y--: " + (y--) + " (ditampilkan 8, lalu y jadi 7)");
        System.out.println("y sekarang: " + y);

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        int positive = 42;
        int negative = -positive;        // -42
        int backToPositive = -negative;  // jadi positif lagi

        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("backToPositive: " + backToPositive);

        int plusDemo = +positive; // tidak berubah
        System.out.println("Unary plus pada positive: " + plusDemo);

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        boolean isReady = true;
        boolean isNotReady = !isReady;

        System.out.println("isReady: " + isReady);
        System.out.println("isNotReady: " + isNotReady);

        int num = 7;
        System.out.println("Apakah num != 0? " + (num != 0));

        boolean doubleNot = !!isReady;
        System.out.println("!!isReady: " + doubleNot + " (dua kali NOT kembali ke nilai asli)");

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int attempts = 0;
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);

        int lives = 3;
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);

        System.out.println("\nLoop increment (1 sampai 5):");
        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("\nLoop countdown (3 sampai 1):");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        int value = 5;
        int hasil1 = value++ + ++value;
        // langkah: value++ -> pakai 5, value jadi 6
        // ++value -> value=7
        // hasil = 5 + 7 = 12
        System.out.println("value++ + ++value = " + hasil1 + ", value akhir = " + value);

        value = 5; // reset
        int hasil2 = --value + value--;
        // langkah: --value -> value=4
        // value-- -> pakai 4, lalu value=3
        // hasil = 4 + 4 = 8
        System.out.println("--value + value-- = " + hasil2 + ", value akhir = " + value);

        int score = 10;
        int max1 = Math.max(++score, 12); // ++score = 11, dibanding 12 -> hasil 12
        System.out.println("Math.max(++score, 12) = " + max1 + ", score = " + score);

        score = 10; // reset
        int max2 = Math.max(score++, 12); // score++ = 10, dibanding 12 -> hasil 12, score jadi 11
        System.out.println("Math.max(score++, 12) = " + max2 + ", score = " + score);
    }
}
