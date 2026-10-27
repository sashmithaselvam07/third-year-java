public class OddEvenSum {
    public static void main(String[] args) {
        int mark[] = {7, 8, 15, 17, 91, 45};

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < mark.length; i++) {
            if (mark[i] % 2 == 0) {
                evenSum = evenSum + mark[i];
            } else {
                oddSum = oddSum + mark[i];
            }
        }

        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}
