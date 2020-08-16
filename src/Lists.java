import java.util.ArrayList;
import java.util.List;

public class Lists {
    public void listPrint(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> listAdd = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(8);
        list1.add(31);
        list2.add(15);
        list2.add(18);
        list2.add(27);
        list2.add(331);
        list2.add(275);
        System.out.println(list1);
        System.out.println(list2);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)+", "+list2.get(i));
            listAdd.add(list1.get(i)+list2.get(i));
            System.out.println(listAdd.get(i));
        }
    }
}
