import java.util.Scanner;
//TODO Определение максимума из двух чисел
// Напишите программу, которая сравнивает два введенных числа и выводит наибольшее из них с использованием тернарного оператора.
// Тест ввода:
// Введите первое число: 7
// Введите второе число: 5
// Ожидаемый вывод:
// Наибольшее число - 7.

public class Second {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = scan.nextInt();
        System.out.print("Введите второе число: ");
        b = scan.nextInt();
        String result =  a > b ? " Наибольшее число " + a : " Наибольшее число " + b;
        System.out.println(result);

    }
}
