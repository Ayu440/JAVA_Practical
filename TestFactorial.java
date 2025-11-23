class Factorial {
    int findFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * findFactorial(n - 1);
    }
}

public class TestFactorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int number = 7;

        int result = f.findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
