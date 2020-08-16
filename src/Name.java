import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Name {
    public void nameGet(){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        Set<String> names = new HashSet<>();
        while (!"koniec".equals(name)){
            names.add(name);
            name = input.next();
        }
        System.out.println(names);
    }
}
