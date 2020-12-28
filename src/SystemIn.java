import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIn {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println("Через " + sAge + " лет " + name + " захватит мир. Му-ха-ха!");
    }
}
class awd {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String Имя = reader.readLine();
        String число1 = reader.readLine();
        int ччисло1 = Integer.parseInt(число1);
        String число2 = reader.readLine();
        int ччисло2 = Integer.parseInt(число2);
        System.out.println(Имя + " получает " + число1 + " через " + число2 + " лет.");

    }
}

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = fuck up");
    }
}

class wasz {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String nnumber1 = reader.readLine();
        int number1 = Integer.parseInt(nnumber1);
        String nnumber2 = reader.readLine();
        int number2 = Integer.parseInt(nnumber2);
        System.out.println("За какие заслуги " + name1 + " посадили в колонию на " + nnumber1 + ", а затем еще на " + nnumber2 +"?");

    }
}

class Question {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name2 = reader.readLine();
        String age = reader.readLine();
        int age1 = Integer.parseInt(age);
        if (age1 == Integer.parseInt(age)) {
            System.out.println("Когда " + name + " купил " + name2 + " консоль, у " + name + " осталось " + age + " рублей.");
    } else {
            System.out.println("Повторите попытку и введите число");
        }

}
}

