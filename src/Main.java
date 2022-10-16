public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int[] arr = new int[30];
        arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    private static void task2() {
        int[] arr = new int[30];
        arr = generateRandomArray();
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

                System.out.println(max);
                break;
            }
        }
    }

    private static void task3() {
        int[] arr = new int[30];
        arr = generateRandomArray();
        int average = 0;
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];}
            average = sum/30;

            System.out.println(average);

        }
}





