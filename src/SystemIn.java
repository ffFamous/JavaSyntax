import java.io.BufferedReader;
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
