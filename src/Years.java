import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Years {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        System.out.println("Через " + age + " лет " + name + " захватит мир. Му-ха-ха!");

    }
}
