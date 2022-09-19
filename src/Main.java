public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1-2:");
        int box[] = new int[3]; // 1 массив
        for (int index = 0; index < box.length; index++) {
            box[index] = index + 1;
            if (index == box.length - 1) {
                System.out.println(box[index]);
                break;
            }
            System.out.print(box[index] + ", ");
        }
        double[] dimensions = {1.57, 7.654, 9.986}; // 2 массив
        for (int index = 0; index < dimensions.length; index++) {
            if (index == dimensions.length - 1) {
                System.out.println(dimensions[index]);
                break;
            }
            System.out.print(dimensions[index] + ", ");
        }
        int recipe[] = new int[4]; // 3 массив
        for (int index = 0; index < recipe.length; index++) {
            recipe[index] = (index + 1) * 2;
            if (index == recipe.length - 1) {
                System.out.println(recipe[index]);
                break;
            }
            System.out.print(recipe[index] + ", ");
        }
    }

    public static void task2() {
        System.out.println("Задача 3:");
        int box[] = new int[3]; // 1 массив
        for (int index = box.length - 1; index >= 0; index--) {
            box[index] = index + 1;
            if (index == 0) {
                System.out.println(box[index]);
                break;
            }
            System.out.print(box[index] + ", ");
        }
        double[] dimensions = {1.57, 7.654, 9.986}; // 2 массив
        for (int index = dimensions.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(dimensions[index]);
                break;
            }
            System.out.print(dimensions[index] + ", ");
        }
        int recipe[] = new int[4]; // 3 массив
        for (int index = recipe.length - 1; index >= 0; index--) {
            recipe[index] = (index + 1) * 2;
            if (index == 0) {
                System.out.println(recipe[index]);
                break;
            }
            System.out.print(recipe[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 4:");
        int arr[] = new int[3];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
            if (arr[index] % 2 != 0) { // Если остаток от деления не равен 0 - добавляем 1 к значению
                arr[index]++;
            }
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
    }
}