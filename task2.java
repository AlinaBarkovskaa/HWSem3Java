import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class task2 {
    
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
        int minimum = SeachMin(numbers);
        System.out.println("Минимальное значение = " + minimum);
        int maximum = SeachMax(numbers);
        System.out.println("Максимальное значение = " + maximum);
        int average = SearchArithmeticMean(numbers);
        System.out.println("Среднее арифметическое = " + average);
    }
    public static int SeachMin(ArrayList<Integer> numbers){
        int min = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < min){
                min = numbers.get(i);
            }
        }
        return min;
    }
    public static int SeachMax(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static int SearchArithmeticMean(ArrayList<Integer> numbers){
        int sum = 0;
        for(int number : numbers){
         sum += number;
        }
        int arithmeticMean = sum / numbers.size();
        return arithmeticMean;
    }       
}

    

