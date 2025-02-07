import java.util.Scanner;
//TODO : Проверка четности числа
// Описание задачи: Напишите программу, которая проверяет, является ли введенное пользователем число четным или нечетным, с помощью тернарного оператора.
// Тест ввода:
// Введите число: 7
// Ожидаемый вывод:
// Число - нечетное.

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Введите число ");
        int n = scan.nextInt();
        String result = n % 2 == 0 ? "Число - четное" : " Число нечётное";
        System.out.println(result);
    }
}
