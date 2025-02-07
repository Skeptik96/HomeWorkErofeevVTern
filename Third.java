import java.util.Scanner;
//TODO: Проверка числа с помощью логических операторов
// Описание задачи: Напишите программу, которая проверяет, делится ли введенное пользователем число нацело на 2 и 5 или на 3 и 7.
// Тест ввода:
// Введите число: 21??
// Ожидаемый вывод:
// Число 21 делится.

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a;
        a = scan.nextInt();
        if (a % 2 == 0 && a % 5 == 0 || a % 3 == 0 && a % 7 ==0) {
            System.out.println("Число " + a + " делится");
        } else {
        }
    }
}
