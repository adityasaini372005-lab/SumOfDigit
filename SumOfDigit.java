public class SumOfDigit {
    static void printSum(int n, int sum) {
        if (n <= 0) {
            System.out.println(sum);
            return;
        }
        int digit = n % 10;
        sum += digit;
        n /= 10;
        printSum(n, sum); // Tail Recursion

    }

    public static void main(String[] args) {
        printSum(12345, 0);
    }

}
