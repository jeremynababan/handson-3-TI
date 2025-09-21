public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        int a = 10;
        int b = 5;

        // Latihan Expression
        int sum = a + b;            // 10 + 5 = 15
        int product = a * b;        // 10 * 5 = 50
        boolean isAGreater = a > b; // 10 > 5 → true
        String greeting = "Hello" + " " + "World"; // "Hello World"
        double power = Math.pow(2, 3); // 2^3 = 8.0

        // Output
        System.out.println("Sum (a+b): " + sum);          // 15
        System.out.println("Product (a*b): " + product);  // 50
        System.out.println("Is a > b?: " + isAGreater);   // true
        System.out.println("Greeting: " + greeting);      // Hello World
        System.out.println("2^3 = " + power);             // 8.0

        // ===== STATEMENTS =====
        System.out.println("\n=== STATEMENTS ===");

        int score;
        score = 85;     // assign

        // if statement
        if (score >= 60) {   // 85 >= 60 → true
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // loop statement
        System.out.println("Loop from 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration: " + i);
        }

        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        int x = 15;

        // if block
        if (x > 10) {  // 15 > 10 → true
            String category = "High";
            System.out.println("x = " + x + ", category = " + category);
        }

        // loop block
        System.out.println("For loop with inner variable:");
        for (int i = 0; i < 3; i++) {
            int iteration = i + 1;
            System.out.println("Iteration inside block: " + iteration);
        }

        // scope block
        int outerVariable = 100;
        {
            int innerVariable = 50;
            outerVariable += 25; // 100 + 25 = 125
            System.out.println("Inside block -> outerVariable: " + outerVariable +
                    ", innerVariable: " + innerVariable);
        }

        System.out.println("After block -> outerVariable: " + outerVariable);
        // innerVariable tidak bisa dipakai di sini
    }
}
