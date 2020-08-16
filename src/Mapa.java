import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapa {
    public void Mapped(){
        Map<Integer,Map<Language,String>> map = new HashMap<>();
        Map<Language, String> one = new HashMap<>();
        one.put(Language.ENG, "one");
        one.put(Language.PL, "jeden");
        one.put(Language.ES, "uno");
        map.put(1,one);
        Map<Language, String> two = new HashMap<>();
        two.put(Language.ENG, "two");
        two.put(Language.PL, "dwa");
        two.put(Language.ES, "dos");
        map.put(2,two);
        Map<Language, String> three = new HashMap<>();
        three.put(Language.ENG, "three");
        three.put(Language.PL, "trzy");
        three.put(Language.ES, "tres");
        map.put(3, three);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe i jezyk:"+ Arrays.toString(Language.values()));
        int number=scanner.nextInt();
        Language language = Language.valueOf(scanner.next());
        System.out.println(map.get(number).get(language));

    }
}
