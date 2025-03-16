public class Main {
    public static void main(String[] args) {
        // 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float[] floatNumbers = {1.57f, 7.654f, 9.986f};
        int[] anyNumbers = {15, 42, 52, 12};

        // 2
        for (int number : numbers) {
            System.out.print(number);
            if (number != numbers[numbers.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (float floatNumber : floatNumbers) {
            System.out.print(floatNumber);
            if (floatNumber != floatNumbers[floatNumbers.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int myNumber : anyNumbers) {
            System.out.print(myNumber);
            if (myNumber != anyNumbers[anyNumbers.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        // 3
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = floatNumbers.length - 1; i >= 0; i--) {
            System.out.print(floatNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = anyNumbers.length - 1; i >= 0; i--) {
            System.out.print(anyNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        // 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                numbers[i] += 1;
            }
        }
        for (int number : numbers) {
            System.out.print(number);
            if (number != numbers[numbers.length - 1]) {
                System.out.print(", ");
            }
        }
    }
}