public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task1();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    private static void task1() {
        int[] arr = new int[30];
        arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;

int totalSum = sum;
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");}

    }


}


