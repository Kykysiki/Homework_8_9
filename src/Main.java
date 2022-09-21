public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int[] task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Задание 1:");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        return arr;
    }


    public static int[] task2() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr = generateRandomArray();
        for (int arr2 : arr) {
            if (min > arr2) {
                min = arr2;
            }
            if (max < arr2) {
                max = arr2;
            }
        }
        System.out.println("Задание 2:");
        System.out.println("Минимальная сумма трат за день составила "+min +" рублей. Максимальная сумма трат за день составила "+max +" рублей ");
        return arr;
}

    public static int[] task3() {
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int element : arr) {
            sum += (double) element / arr.length;
        }
        System.out.println("Задание 3:");
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
        return arr;
    }

    public static void task4() {
        System.out.println("Задание 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
