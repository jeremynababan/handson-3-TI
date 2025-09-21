public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         * Kode ini menampilkan prediksi, langkah, dan hasil untuk berbagai
         * ekspresi yang menunjukkan precedence, associativity, dan cara mengontrol
         * urutan evaluasi menggunakan tanda kurung.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");
        int a = 10, b = 5, c = 2;

        // a + b * c
        System.out.println("\nEkspresi: a + b * c");
        System.out.println("Prediksi: 20");
        System.out.println("Langkah: b * c -> " + b + " * " + c + " = " + (b * c));
        System.out.println("Langkah: a + (b * c) -> " + a + " + " + (b * c) + " = " + (a + b * c));
        System.out.println("Hasil: " + (a + b * c));

        // (a + b) * c
        System.out.println("\nEkspresi: (a + b) * c");
        System.out.println("Prediksi: 30");
        System.out.println("Langkah: (a + b) -> " + a + " + " + b + " = " + (a + b));
        System.out.println("Langkah: (a + b) * c -> " + (a + b) + " * " + c + " = " + ((a + b) * c));
        System.out.println("Hasil: " + ((a + b) * c));

        // a * b + c / 2
        System.out.println("\nEkspresi: a * b + c / 2");
        System.out.println("Prediksi: 51  (karena pembagian integer untuk c/2)");
        System.out.println("Langkah: a * b -> " + a + " * " + b + " = " + (a * b));
        System.out.println("Langkah: c / 2 -> " + c + " / 2 = " + (c / 2));
        System.out.println("Langkah: (a*b) + (c/2) -> " + (a * b) + " + " + (c / 2) + " = " + (a * b + c / 2));
        System.out.println("Hasil: " + (a * b + c / 2));

        // a / b + c * 2
        System.out.println("\nEkspresi: a / b + c * 2");
        System.out.println("Prediksi: 6");
        System.out.println("Langkah: a / b -> " + a + " / " + b + " = " + (a / b));
        System.out.println("Langkah: c * 2 -> " + c + " * 2 = " + (c * 2));
        System.out.println("Langkah: (a/b) + (c*2) -> " + (a / b) + " + " + (c * 2) + " = " + (a / b + c * 2));
        System.out.println("Hasil: " + (a / b + c * 2));


        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");
        int x = 15, y = 10, z = 20;

        // x + y > z - 5
        System.out.println("\nEkspresi: x + y > z - 5");
        System.out.println("Langkah: x + y -> " + x + " + " + y + " = " + (x + y));
        System.out.println("Langkah: z - 5 -> " + z + " - 5 = " + (z - 5));
        System.out.println("Langkah: (x+y) > (z-5) -> " + (x + y) + " > " + (z - 5) + " = " + ((x + y) > (z - 5)));
        System.out.println("Hasil: " + ((x + y) > (z - 5)));

        // x > y + z / 4
        System.out.println("\nEkspresi: x > y + z / 4");
        System.out.println("Langkah: z / 4 -> " + z + " / 4 = " + (z / 4));
        System.out.println("Langkah: y + (z/4) -> " + y + " + " + (z / 4) + " = " + (y + z / 4));
        System.out.println("Langkah: x > (y + z/4) -> " + x + " > " + (y + z / 4) + " = " + (x > y + z / 4));
        System.out.println("Hasil: " + (x > y + z / 4));

        // (x + y) > (z - 5) && x < z
        System.out.println("\nEkspresi: (x + y) > (z - 5) && x < z");
        boolean left = (x + y) > (z - 5);
        boolean right = x < z;
        System.out.println("Langkah: (x+y)>(z-5) -> " + left);
        System.out.println("Langkah: x<z -> " + right);
        System.out.println("Langkah: left && right -> " + (left && right));
        System.out.println("Hasil: " + (left && right));

        // x * 2 + y > z && y < x + 5
        System.out.println("\nEkspresi: x * 2 + y > z && y < x + 5");
        System.out.println("Langkah: x * 2 -> " + x + " * 2 = " + (x * 2));
        System.out.println("Langkah: (x*2) + y -> " + (x * 2) + " + " + y + " = " + (x * 2 + y));
        System.out.println("Langkah: (x*2 + y) > z -> " + (x * 2 + y) + " > " + z + " = " + ((x * 2 + y) > z));
        System.out.println("Langkah: y < x + 5 -> " + y + " < " + (x + 5) + " = " + (y < x + 5));
        System.out.println("Hasil akhir: " + (((x * 2 + y) > z) && (y < x + 5)));


        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");
        boolean p = true, q = false, r = true;

        // p && q || r
        System.out.println("\nEkspresi: p && q || r");
        System.out.println("Langkah: p && q -> " + p + " && " + q + " = " + (p && q));
        System.out.println("Langkah: (p && q) || r -> " + (p && q) + " || " + r + " = " + ((p && q) || r));
        System.out.println("Hasil: " + ((p && q) || r));

        // p || q && r
        System.out.println("\nEkspresi: p || q && r");
        System.out.println("Langkah: q && r -> " + q + " && " + r + " = " + (q && r));
        System.out.println("Langkah: p || (q && r) -> " + p + " || " + (q && r) + " = " + (p || (q && r)));
        System.out.println("Hasil: " + (p || q && r));

        // !p && q || r
        System.out.println("\nEkspresi: !p && q || r");
        System.out.println("Langkah: !p -> " + (!p));
        System.out.println("Langkah: (!p && q) -> " + (!p && q));
        System.out.println("Langkah: (!p && q) || r -> " + ((!p && q) || r));
        System.out.println("Hasil: " + ((!p && q) || r));

        // p && (q || r)
        System.out.println("\nEkspresi: p && (q || r)");
        System.out.println("Langkah: q || r -> " + (q || r));
        System.out.println("Langkah: p && (q || r) -> " + p + " && " + (q || r) + " = " + (p && (q || r)));
        System.out.println("Hasil: " + (p && (q || r)));


        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");
        int num1 = 25, num2 = 15, num3 = 30;

        // num1 > num2 + 5 && num3 / 2 < num1
        System.out.println("\nEkspresi: num1 > num2 + 5 && num3 / 2 < num1");
        System.out.println("Langkah: num2 + 5 -> " + num2 + " + 5 = " + (num2 + 5));
        System.out.println("Langkah: num3 / 2 -> " + num3 + " / 2 = " + (num3 / 2));
        System.out.println("Langkah: num1 > (num2+5) -> " + num1 + " > " + (num2 + 5) + " = " + (num1 > num2 + 5));
        System.out.println("Langkah: (num3/2) < num1 -> " + (num3 / 2) + " < " + num1 + " = " + ((num3 / 2) < num1));
        System.out.println("Hasil: " + ((num1 > num2 + 5) && ((num3 / 2) < num1)));

        // num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        System.out.println("\nEkspresi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10");
        System.out.println("Catatan: && dievaluasi sebelum ||");
        System.out.println("Langkah: num1 + num2 -> " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Langkah: num3 - num1 -> " + num3 + " - " + num1 + " = " + (num3 - num1));
        System.out.println("Langkah: num3 - num1 < 10 -> " + ((num3 - num1) < 10));
        System.out.println("Langkah: num2 > 10 -> " + (num2 > 10));
        System.out.println("Langkah: (num3 - num1 < 10) && (num2 > 10) -> " + (((num3 - num1) < 10) && (num2 > 10)));
        System.out.println("Langkah akhir: (num1+num2>30) || [previous] -> " + ((num1 + num2 > 30) || (((num3 - num1) < 10) && (num2 > 10))));
        System.out.println("Hasil: " + ((num1 + num2 > 30) || (((num3 - num1) < 10) && (num2 > 10))));

        // Memaksa evaluasi berbeda dengan tanda kurung
        System.out.println("\nEkspresi dengan tanda kurung: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10");
        boolean grouped = ((num1 + num2 > 30) || ((num3 - num1) < 10)) && (num2 > 10);
        System.out.println("Langkah: (num1+num2>30) -> " + (num1 + num2 > 30));
        System.out.println("Langkah: (num3-num1<10) -> " + ((num3 - num1) < 10));
        System.out.println("Langkah: inner OR -> " + ((num1 + num2 > 30) || ((num3 - num1) < 10)));
        System.out.println("Langkah: inner && (num2>10) -> " + grouped);
        System.out.println("Hasil: " + grouped);


        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");
        int value = 8;

        System.out.println("\nEkspresi: ++value * 2");
        System.out.println("Langkah: ++value -> value jadi " + (++value));
        System.out.println("Langkah: ++value * 2 -> " + value + " * 2 = " + (value * 2));
        System.out.println("Hasil: " + (value * 2) + " (value sekarang = " + value + ")");

        value = 8; // reset
        System.out.println("\nEkspresi: value++ * 2");
        System.out.println("Langkah: value++ -> pakai nilai lama " + value + " lalu value++ membuat value jadi " + (value + 1));
        System.out.println("Langkah: value++ * 2 -> " + value + " * 2 = " + (value * 2));
        value++; // terapkan increment yang tertunda
        System.out.println("Hasil: " + ( (value - 1) * 2) + " (value sekarang = " + value + ")");

        value = 8; // reset
        System.out.println("\nEkspresi: 2 * ++value");
        System.out.println("Langkah: ++value -> value jadi " + (++value));
        System.out.println("Langkah: 2 * ++value -> 2 * " + value + " = " + (2 * value));
        System.out.println("Hasil: " + (2 * value));

        value = 8; // reset
        System.out.println("\nEkspresi: -value + 10");
        System.out.println("Langkah: -value -> -" + value + " = " + (-value));
        System.out.println("Langkah: -value + 10 -> " + (-value) + " + 10 = " + (-value + 10));
        System.out.println("Hasil: " + (-value + 10));


        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");
        int aa = 5, bb = 10;

        System.out.println("\nEkspresi: a += b * 2");
        System.out.println("Langkah: b * 2 -> " + bb + " * 2 = " + (bb * 2));
        aa += bb * 2;
        System.out.println("Hasil: a = " + aa + " (aritmatika dilakukan sebelum assignment)");

        aa = 5; // reset
        System.out.println("\nEkspresi: a *= b + 3");
        System.out.println("Langkah: b + 3 -> " + bb + " + 3 = " + (bb + 3));
        aa *= bb + 3;
        System.out.println("Hasil: a = " + aa + " (b + 3 dihitung terlebih dahulu)");

        System.out.println("\nEkspresi ternary: a = b > 5 ? b * 2 : b / 2");
        int ternaryResult = (bb > 5) ? (bb * 2) : (bb / 2);
        System.out.println("Langkah: b > 5 ? yes->b*2 no->b/2, dengan b=" + bb + " -> hasil = " + ternaryResult);


        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");
        int A = 8, B = 4, C = 2, D = 6;

        System.out.println("\nEkspresi: a + b * c - d");
        System.out.println("Langkah: b * c -> " + B + " * " + C + " = " + (B * C));
        System.out.println("Langkah: a + (b*c) -> " + A + " + " + (B * C) + " = " + (A + B * C));
        System.out.println("Langkah: (a + b*c) - d -> " + (A + B * C) + " - " + D + " = " + (A + B * C - D));
        System.out.println("Hasil: " + (A + B * C - D));

        System.out.println("\nEkspresi: (a + b) * (c - d)");
        System.out.println("Langkah: (a + b) -> " + A + " + " + B + " = " + (A + B));
        System.out.println("Langkah: (c - d) -> " + C + " - " + D + " = " + (C - D));
        System.out.println("Langkah: (a+b)*(c-d) -> " + (A + B) + " * " + (C - D) + " = " + ((A + B) * (C - D)));
        System.out.println("Hasil: " + ((A + B) * (C - D)));

        System.out.println("\nEkspresi: a > b && c < d || a == b  VS  a > b && (c < d || a == b)");
        System.out.println("Langkah pertama (tanpa kurung): (a > b && c < d) || a == b -> " +
                ((A > B && C < D) || (A == B)));
        System.out.println("Langkah kedua (dengan kurung): a > b && (c < d || a == b) -> " +
                (A > B && (C < D || A == B)));

        System.out.println("\nEkspresi nested: ((a + b) * c) / (d - 2) > (a - b)");
        int numerator = (A + B) * C;            // (a+b) * c
        int denominator = D - 2;               // d - 2
        int leftSide = numerator / denominator; // integer division
        int rightSide = A - B;
        System.out.println("Langkah: (a + b) = " + (A + B));
        System.out.println("Langkah: (a + b) * c = " + numerator);
        System.out.println("Langkah: (d - 2) = " + denominator);
        System.out.println("Langkah: ((a+b)*c) / (d-2) = " + leftSide);
        System.out.println("Langkah: (a - b) = " + rightSide);
        System.out.println("Hasil perbandingan: " + leftSide + " > " + rightSide + " = " + (leftSide > rightSide));
    }
}
