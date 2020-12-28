import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
    }
    }
class WhyNot2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();

        System.out.println("Спасибо! Вы ввели число " + number);

    }
}

class arara {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

    }
}

class araw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели верное чилсо " + number);
        } else {
        System.out.println("Вы ввели что - то не то !!!");
    }
    }
}

class NewClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scan.nextInt();
        System.out.println("Вы ввели число: " + age);
        if (age >= 21) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = scan1.nextLine();
            System.out.println("Вы были зарегестрированны на имя " + name + ".");
        } else {
            System.out.println("Просим прощения, но наше заведение предназначено для лиц старше 21 года.");
        }

    }
}