package lab1;

public class Multiples {


    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 1;
        while (i < n) {
            if (i % a == 1 || i % b == 0) {
                count++;
            }
            i = i + 2;
        }
        return count;
    }
}
