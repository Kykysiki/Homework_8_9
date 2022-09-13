public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1-2");
        int box[] = new int[3]; // 1 массив
        box[0] = 27;
        box[1] = 55;
        box[2] = 12;
        double[] dimensions = {1.57, 7.654, 9.986}; // 2 массив
        int recipe[] = new int[2]; // 3 массив
        int b = 3;
        recipe[0] = b;
        recipe[1] = b * 2;
        int apple = box[0]; // 1 массив - Присваивание значений переменным
        int orange = box[1];
        int mango = box[2];
        System.out.println(apple + ", " + orange + ", " + mango);
        double height = dimensions[0]; // 2 массив - Присваивание значений переменным
        double width = dimensions[1];
        double depth = dimensions[2];
        System.out.println(height + ", " + width + ", " + depth);
        int lemon = recipe[0]; // 3 массив - Присваивание значений переменным
        int sugar = recipe[1];
        System.out.println(lemon + ", " + sugar);
        System.out.println("Задача 3");
        System.out.println(mango + ", " + orange + ", " + apple);
        System.out.println(depth + ", " + width + ", " + height);
        System.out.println(sugar + ", " + lemon);
        System.out.println("Задача 4");
        if (box[0] % 2 == 0) { // Если остаток от деления 0 - выводим значение числа
            System.out.println(apple);
        } else {
            System.out.println(apple + 1); // Если условие не выполняется, добавляем 1
        }
        if (box[1] % 2 == 0) {
            System.out.println(orange);
        } else {
            System.out.println(orange + 1);
        }
        if (box[2] % 2 == 0) {
            System.out.println(mango);
        } else {
            System.out.println(mango + 1);
        }
    }
}