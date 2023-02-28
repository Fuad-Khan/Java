public class MaxNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum value is: " + max);
    }
}