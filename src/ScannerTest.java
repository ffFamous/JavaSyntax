import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner canner = new Scanner(System.in);
        String name = canner.nextLine();
        int age = canner.nextInt();
        System.out.println("Через " + age + " лет " + name + " захватит мир. Му-ха-ха!");
    }
}
