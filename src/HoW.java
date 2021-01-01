import java.io.*;
import java.util.Scanner;
import java.io.Console;


public class HoW {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя1: ");
        String name = reader.readLine();
        System.out.println("Введите имя2: ");
        String name2 = reader.readLine();
        System.out.println("Введите сумму долга: ");
        String aage = reader.readLine();
        int age = Integer.parseInt(aage);
        System.out.println(name + " занял у " + name2 + " " + aage + " рублей.");
    }
}

class SCaner {
    public static void main (String[] args){
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = cs.nextInt();
        System.out.println("Вы ввели число " + number);
        System.out.println("Введите другое целое число: ");
        int number2 = cs.nextInt();
        System.out.println("Вы ввели число " + number2);
        System.out.println("Введите сумму этих двух чисел: ");
        int summ = cs.nextInt();
        if (number + number2 == summ) {
            System.out.println("Вы ответили верно, сумма двух чисел равна " +summ + ".");
        } else {
            System.out.println("Ваш ответ не является верным.");
        }
    }

}

class Solution2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);
        System.out.println(s);
    }
}

class Main {

    public static void main(String[] args) {

        int a = 5 % 2;
        System.out.println(a);
    }
    }

class Soaalution {

    public static void main(String[] args) {
        int number = 546;

        int lastDigit = 9 % 2; //напишите тут ваш код

        int a = 5;
        String name = a + a + "1" + a;
        System.out.println(name);
        System.out.println(lastDigit);
    }
}

class Solutioaaan {

    public static void main(String[] args) {
        String emptyString = "";

        //напишите тут ваш код
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println(emptyString + 2 + 2 + "22");
    }
}

class DaDa {
    public static void main (String[] args) {
        System.out.println("dadadadada".length());
    }

}

class DoDo {
    public static void main (String[] args) {
        String s = "555";
        int x = 100;
        int y = Integer.parseInt(s) + x;
        System.out.println(y);
    }
}

class DoDa {
    public static void main (String[] args) {
        int x = 5;
        int y = 2;
        if ((x + y)  % 2 == 0) {
            System.out.println ("Число целочисленное!");
        } else {
            System.out.println ("Число не является целочисленным!");
        }

    }
}

class DodDa {
    public static void main (String[] args){
        String s = "555";
        int g = 100;
        System.out.println((Integer.parseInt(s) + Integer.toString(g)).length());
    }
}

class awdawdawd {
    public static void main (String[] args) {
        Scanner ov = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String zoro = ov.nextLine();
        System. out.println("Введите число: ");
        int z = ov.nextInt();
        System.out.println("Введите дату: ");
        String zz = ov.next();
        ov.close();
    }
}

class Chaaracters {
    public static void main(String[] args) {
        char a = 'v', b, c = 'c';
        b = (char) ((a + c) / 2); // Можно складывать, вычитать, делить и умножать
        // Но из-за особенностей арифметики Java результат приходится приводить к типу char явно
        System.out.println(b); // Выведет символ 'b'
    }
}


