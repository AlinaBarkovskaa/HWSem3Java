import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(n);
        Random r = new Random();
        for(int i = 0; i < n; i++){
            numbers.add(r.nextInt(100) + 1);
        }
        System.out.println("Исходный список: " + numbers);
         for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println("Финальный список: " + numbers);
    }
}





