isPrime(int n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(isPrime(a));
    }

    public static boolean isPrime(int a) {
        if (a <= 1) { // 0 and 1 are not prime numbers
            return false;

        }
        //check from 2, it is because a number is not divisible by more than its half
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

gcd(int a, int b)


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(b, a));
    }
    //чтоб найти нод,метод принимает 2 значения
    //если b равно 0, то метод возвращает a,а если b не равен нулю,то метод вызывает сам себя,и вместо будет b, а вместо b — остаток от деления a на b ,то есть a % b
    public static int gcd(int a,int b) {
        if (b==0) {
            return a;
        }
        return gcd(b,a%b);
    }

}

lcm(int a, int b)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(lcm(b, a));
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;//метод продолжается пока а не будет равен 0,и в итоге значения нод будет определяется как последнее ненулевое значение b
        return gcd(b % a,a);
    }
    //чтобы найти нок по формуле умножаем между собой делимое и делим на нод
    static int lcm(int a,int b) {
        return (a * b / gcd(a, b)) ;
    }

}
factorial(int n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(factorial(a));
    }//использовала переменную long,чтоб выводилось корректно при вводе больших чисел
    static  long factorial(int a){
        //Метод принимает параметр int a,чтоб вычислить факториал
        //Переменную b инициализируем  значением 1,для  начального значение для вычисления факториала
        //Цикл for проходит от 1 до a, умножая b на текущее значение i на каждой итерации
        long b=1;
        for(int i=1;i<=a;i++) {
            b=b*i;
        }
        return b;//возраващает конечный ответ
    }
}

fibonacci(int n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(fibonachi(a));
    }//использовала переменную long,чтоб выводилось корректно при вводе больших чисел
    static  long fibonachi(int a){
        if (a <= 1)
            return a;
        int a1 = 0;
        int a2 = 1;
        int a3 = 0;
        for (int i = 2; i <= a; i++) {
            a3 = a1 + a2; // F(n) = F(n-1) + F(n-2)
            a1 = a2; //  F(n-2)
            a2 = a3;//F(n-1)
        }

        return a3; //возвращаем итоговое число
    }
}
isPerfectNumber(int n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //создаем объект класса main
        Main main = new Main();
        System.out.println(main.isPerfectNumber(n));
    }
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        // Находим делители и их суммируем
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i; // Добавляем делитель к сумме
            }
            else if(n<=1){
                return false;//чтоб 1 не считал
            }
        }
        //В конце проверяем, равна ли сумма делителей изначалному(вводному) числу
        return sum == n;
    }
}

sumOfDigits(int n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //создаем объект класса main
        Main main = new Main();
        System.out.println(main.sumOfDigits(a));
    }
    public int sumOfDigits(int a)
    {
        //Берем последнюю цифру и добавляем ее к общей сумме
        //Убираем последнюю цифру и повторяем  с оставшимся числом
        //Продолжаем этот процесс, пока не останется ни одной цифры
        //В итоге получаем сумму всех цифр
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
}
