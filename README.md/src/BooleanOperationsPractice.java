public class BooleanOperationsPractice {
    public static void main(String[] args) {
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: AND (&&)
        boolean isLoggedIn = true, hasPermission = false;
        System.out.println("User bisa akses admin? " + (isLoggedIn && hasPermission) +
                " -> karena butuh login=true DAN permission=true, tapi permission=false");

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: OR (||)
        boolean isWeekend = false, isHoliday = true;
        System.out.println("\nHari libur? " + (isWeekend || isHoliday) +
                " -> karena salah satu true (isHoliday=true)");

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: NOT (!)
        boolean isRaining = true;
        boolean isSunny = !isRaining;
        System.out.println("\nIsRaining = " + isRaining + ", jadi isSunny = " + isSunny);
        System.out.println("!!isRaining = " + (!!isRaining));
        System.out.println("!(5 > 3) = " + (!(5 > 3)) + " -> karena (5 > 3) true, dibalik jadi false");

        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        boolean attendanceGood = true, gradesHigh = false, behaviorGood = true;
        boolean outstanding = attendanceGood && gradesHigh && behaviorGood;
        boolean memuaskan = attendanceGood && (gradesHigh || behaviorGood);
        boolean perluPerbaikan = !attendanceGood || !behaviorGood;
        System.out.println("Outstanding? " + outstanding);
        System.out.println("Memuaskan? " + memuaskan);
        System.out.println("Perlu perbaikan? " + perluPerbaikan);

        System.out.println("\n=== APLIKASI PRAKTIS ===");

        boolean hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false;
        boolean aksesNormal = hasKeyCard && knowsPassword && isAuthorizedTime;
        boolean aksesDarurat = isEmergency || (hasKeyCard && isAuthorizedTime);
        boolean aksesDitolak = !(aksesNormal || aksesDarurat);
        System.out.println("Akses normal? " + aksesNormal);
        System.out.println("Akses darurat? " + aksesDarurat);
        System.out.println("Akses ditolak? " + aksesDitolak);

        boolean isSnowing = true, isCloudy = true;
        int temperature = -5;
        boolean cuacaBagus = !isRaining && !isSnowing && temperature > 0;
        boolean butuhPayung = isRaining || (isCloudy && temperature > 20);
        boolean jalanBerbahaya = isSnowing || (isRaining && temperature < 5);
        System.out.println("\nCuaca bagus? " + cuacaBagus);
        System.out.println("Butuh payung? " + butuhPayung);
        System.out.println("Jalan berbahaya? " + jalanBerbahaya);

        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        int a = 5, b = 0;
        boolean result1 = (b != 0) && (a / b > 2);
        System.out.println("(b != 0) && (a / b > 2) = " + result1 + " -> aman karena b!=0 sudah false, kanan tidak dievaluasi");

        boolean result2 = (b == 0) || (a / b > 2);
        System.out.println("(b == 0) || (a / b > 2) = " + result2 + " -> aman karena b==0 true, kanan tidak dievaluasi");

        boolean expensiveCheck1 = false, expensiveCheck2 = true;
        boolean andShort = expensiveCheck1 && expensiveCheck2; // kiri false → kanan tidak dicek
        boolean orShort = expensiveCheck2 || expensiveCheck1;  // kiri true → kanan tidak dicek
        System.out.println("\nexpensiveCheck1 && expensiveCheck2 = " + andShort + " -> hanya cek kiri (false)");
        System.out.println("expensiveCheck2 || expensiveCheck1 = " + orShort + " -> hanya cek kiri (true)");
    }
}
