import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> carNumber = new HashMap<>();

        for(;;)
        {
            System.out.println("Пожалуйста, введите номер автомобиля:");
            Integer command = Integer.parseInt(reader.readLine().trim());

            if(carNumber.containsKey(command))
            {
                System.out.println(carNumber.get(command));
            }

            else if(!carNumber.containsKey(command))
            {
                System.out.println("Номер автомобиля в базе отсутствует. Введите имя владельца:");
                String name = reader.readLine();
                carNumber.put(command, name);
            }
        }
    }
}
