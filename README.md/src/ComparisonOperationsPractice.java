public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");
        int firstNum = 25, secondNum = 18;
        System.out.println(firstNum + " > " + secondNum + " ? " + (firstNum > secondNum) + " -> karena 25 lebih besar dari 18");
        System.out.println(firstNum + " < " + secondNum + " ? " + (firstNum < secondNum) + " -> karena 25 tidak lebih kecil dari 18");
        System.out.println(firstNum + " >= " + secondNum + " ? " + (firstNum >= secondNum) + " -> karena 25 lebih besar sama dengan 18");
        System.out.println(firstNum + " <= " + secondNum + " ? " + (firstNum <= secondNum) + " -> karena 25 tidak lebih kecil sama dengan 18");
        System.out.println(firstNum + " == " + secondNum + " ? " + (firstNum == secondNum) + " -> karena nilainya berbeda");
        System.out.println(firstNum + " != " + secondNum + " ? " + (firstNum != secondNum) + " -> karena nilainya memang tidak sama");

        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");
        double price1 = 19.99, price2 = 20.0;
        System.out.println(price1 + " < " + price2 + " ? " + (price1 < price2) + " -> karena 19.99 lebih kecil dari 20.0");
        System.out.println("Selisih = " + (price2 - price1) + ", kurang dari 1.0 ? " + ((price2 - price1) < 1.0));
        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + sum + " , apakah sama dengan 0.3 ? " + (sum == 0.3));

        System.out.println("\n=== PERBANDINGAN KARAKTER ===");
        char letter1 = 'A', letter2 = 'B';
        System.out.println(letter1 + " < " + letter2 + " ? " + (letter1 < letter2) + " -> karena kode ASCII 'A'(65) lebih kecil dari 'B'(66)");
        char lower = 'a';
        System.out.println(lower + " > " + letter1 + " ? " + (lower > letter1) + " -> karena 'a'(97) lebih besar dari 'A'(65)");
        char digit = '5';
        System.out.println(digit + " >= '0' && " + digit + " <= '9' ? " + (digit >= '0' && digit <= '9'));

        System.out.println("\n=== PERBANDINGAN STRING ===");
        String name1 = "Java", name2 = "Java";
        System.out.println("name1 == name2 ? " + (name1 == name2) + " -> karena referensi sama (string pool)");
        String name3 = new String("Java");
        System.out.println("name1 == name3 ? " + (name1 == name3) + " -> berbeda referensi walau isinya sama");
        System.out.println("name1.equals(name3) ? " + name1.equals(name3) + " -> benar karena membandingkan isi string");
        System.out.println("\"Java\".equals(\"java\") ? " + "Java".equals("java"));
        System.out.println("\"Java\".equalsIgnoreCase(\"java\") ? " + "Java".equalsIgnoreCase("java"));

        System.out.println("\n=== APLIKASI PRAKTIS ===");
        int grade = 85, passingGrade = 60, honorRoll = 90;
        System.out.println("Nilai = " + grade + ", Lulus ? " + (grade >= passingGrade));
        System.out.println("Honor roll ? " + (grade >= honorRoll));
        int age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21;
        System.out.println("Umur " + age + " bisa nyetir? " + (age >= drivingAge));
        System.out.println("Umur " + age + " bisa milih? " + (age >= votingAge));
        System.out.println("Umur " + age + " bisa minum? " + (age >= drinkingAge));
        int originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60;
        boolean bulk = originalPrice > discountThreshold;
        boolean senior = customerAge >= seniorAge;
        System.out.println("Harga " + originalPrice + " > " + discountThreshold + " ? " + bulk);
        System.out.println("Umur " + customerAge + " >= " + seniorAge + " ? " + senior);
        System.out.println("Diskon akhir ? " + (bulk || senior));

        System.out.println("\n=== PENGUJIAN BATAS ===");
        int score = 100;
        System.out.println("Score dalam rentang 0-100 ? " + (score >= 0 && score <= 100));
        int[] testScores = {0, 100, -1, 101};
        for (int s : testScores) {
            System.out.println("Score = " + s + " -> valid? " + (s >= 0 && s <= 100));
        }
        int temp = 30;
        System.out.println("Suhu " + temp + " dalam rentang -10 sampai 40 ? " + (temp >= -10 && temp <= 40));
        int height = 175, minHeight = 160, maxHeight = 200;
        System.out.println("Tinggi " + height + " dalam rentang? " + (height >= minHeight && height <= maxHeight));
        int nilai = 85;
        String gradeLetter = (nilai >= 90) ? "A" :
                (nilai >= 80) ? "B" :
                        (nilai >= 70) ? "C" :
                                (nilai >= 60) ? "D" : "F";
        System.out.println("Nilai = " + nilai + " -> Grade = " + gradeLetter);
    }
}
