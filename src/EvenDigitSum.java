public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        do {
            sum += ((number % 10) % 2 == 0) ? number % 10 : 0;
            number /= 10;
        } while (number != 0);
        System.out.println(number);
        return sum;
    }
}
