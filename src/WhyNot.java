import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhyNot {
    public static void main (String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String nnumber1 = reader.readLine();
        int number1 = Integer.parseInt(nnumber1);
        System.out.println("Если дать по лицу " + name + ", тогда можно словить " + nnumber1 + " лет строгача");
    }

}
